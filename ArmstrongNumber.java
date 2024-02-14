import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {

        int originalNumber, remainder, result = 0;
        int numberOfDigits = String.valueOf(number).length();

        originalNumber = number;

        while (number > 0) {
            remainder = number % 10;
            result += Math.pow(remainder, numberOfDigits);
            number /= 10;
        }

        return originalNumber == result;
    }
}