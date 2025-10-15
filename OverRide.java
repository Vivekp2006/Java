package scann;
import java.util.Scanner;
public class OverRide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose 1 for Calculator (child), 2 for Calc (parent): ");
        choice = scanner.nextInt();

        if (choice == 1) {
            Calculator Calcu = new Calculator();
            System.out.println(Calcu.add(8, 3));
            System.out.println(Calcu.add(3.5, 4.5));
            System.out.println(Calcu.add(2.8f, 3.4f));
        } 
        else if (choice == 2) {
            Calc cal = new Calc();
            System.out.println(cal.add(9, 3));
            System.out.println(cal.add(3.2f, 6.2f));
            System.out.println(cal.add(5.3, 2.3));
        } 
        else if(choice==0) {
        	scanner.close();
        }
        else {
            System.out.println("Invalid choice.");
            OverRide.main(args);
        }
    }
   /* private static void runProgram() {
    	Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose 1 for Calculator (child), 2 for Calc (parent): ");
        choice = scanner.nextInt();

        if (choice==1) {
            Calculator Calcu = new Calculator();
            System.out.println(Calcu.add(8, 3));
            System.out.println(Calcu.add(3.5, 4.5));
            System.out.println(Calcu.add(2.8f, 3.4f));
        } 
        else if (choice==2) {
            Calc cal = new Calc();
            System.out.println(cal.add(9, 3));
            System.out.println(cal.add(3.2f, 6.2f));
            System.out.println(cal.add(5.3, 2.3));
        } 
        else if(choice==0) {
        	scanner.close();
        }
        else {
            System.out.println("Invalid choice.");
            runProgram();
        }}*/
}
