import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class Slip29a {

    // Static method to check voting eligibility
    private static void checkEligibility(int age, boolean isCitizen) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Candidate is underage and not eligible to vote.");
        } else if (!isCitizen) {
            System.out.println("Candidate is not a citizen and is not eligible to vote.");
        } else {
            System.out.println("Candidate is eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();

            System.out.print("Is the candidate a citizen (true/false)? ");
            boolean isCitizen = scanner.nextBoolean();

            // Check eligibility
            checkEligibility(age, isCitizen);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct values.");
        } finally {
            scanner.close();
        }
    }
}
