import java.util.Scanner;

public class ByteBoost {

    static void printHeading() {
        System.out.println("=======================================");
        System.out.println("        BYTEBOOST - CORE JAVA PRACTICE  ");
        System.out.println("=======================================");
    }

    public static void main(String[] args) {

        printHeading();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String status = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println("\n--- User Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Status : " + status);

        System.out.println("\n--- ByteBoost Counter ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Practice Level " + i);
        }

        System.out.println("\nThank you for using ByteBoost!");
        sc.close();
    }
}
