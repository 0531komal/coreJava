import java.util.Scanner;

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class Slip27a {
    static int number;
    // Method to display the factors of a number
    private static void displayFactors(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a newline after displaying all factors
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 1000) {
                throw new NumberOutOfRangeException("Number is out of Range.");
            } else {
                displayFactors(number);
            }
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}