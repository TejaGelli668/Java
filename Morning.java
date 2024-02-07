import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time: ");
        int n = sc.nextInt();

        if (n < 12) {
            System.out.println("Good Morning");
        } else if (n > 12 && n < 16) {
            System.out.println("Good Afternoon");
        } else if (n >= 16 && n < 18) {
            System.out.println("Good Evening");
        } else if (n >= 18 && n < 24){
            System.out.println("Good Night");
        }
    }
}
