import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // Using bitwise AND operator (&) with 1
        // If the last bit of the number is 1, then it's odd; otherwise, it's even
        String result = (n & 1) == 1 ? "Odd Number" : "Even Number";
        System.out.println(result);
    }
}
