package scann;

import java.util.Scanner;

public class AdditionTest {

    public static void main(String[] args) {
        Addition abc = new Addition();
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        c = abc.sum(a, b);

        if (c > 30) {
            System.out.println("Sum: " + c);
        } else {
            runProgram(); 
        }
    }
    private static void runProgram() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        c = a + b;
        if (c > 30) {
            System.out.println("Sum: " + c);
        } else {
            runProgram(); 
        }

    }
}
