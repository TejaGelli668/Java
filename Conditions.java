import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int n = sc.nextInt();

        if (n >= 70) {
            System.out.println("A Grade");
        } else if (n >= 60 && n < 70) {
            System.out.println("B Grade");
        } else if (n >= 50 && n < 60) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
