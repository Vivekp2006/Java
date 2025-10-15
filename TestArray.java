import java.util.Scanner;
public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //one D
        int a[] = new int[5];
        String name[] = new String[5];
        //Two D

        System.out.println("Enter Array");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
            name[i] = scanner.next();
        }

        //name's id?
        System.out.println("Enter Name of Your Choice:");
        String choice = scanner.next();
        for (int i = 0; i < 3; i++) {
            if (name[i].equals(choice)) {
                System.out.println("ID for " + choice + " is: " + a[i]);
            }
        }
    }
}
