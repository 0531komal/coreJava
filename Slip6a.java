import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class Slip6a {
    static int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the number is zero
            if (number == 0) {
                throw new NumberIsZeroException("Number is zero.");
            } else {
                // Calculate and print the sum of the first and last digits
                int sum = calculateSumOfFirstAndLastDigit(number);
                System.out.println("The sum of the first and last digits is: " + sum);
            }
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Static method to calculate the sum of the first and last digits
    private static int calculateSumOfFirstAndLastDigit(int num) {
        int lastDigit = Math.abs(num % 10); // Last digit (absolute value for negative numbers)
        int firstDigit = Character.getNumericValue(Integer.toString(num).charAt(0)); // First digit

        return firstDigit + lastDigit;
    }
}