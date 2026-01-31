package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to my calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = scan.nextInt();

        System.out.println("Enter 1st number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = scan.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = addition(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                scan.close();
                return;
        }

        System.out.println("Result: " + result);
        scan.close();
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

}
