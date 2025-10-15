import util.java.Scanner;
public class Student{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[m];
        System.out.println("Enter subject names:");
        for (int j = 0; j < m; j++) {
            subjects[j] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            int[] marks = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.print("Enter marks in " + subjects[j] + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            int maxIndex = 0;
            for (int j=1;j<m;j++){
                if(marks[j]>marks[maxIndex]){
                    maxIndex=j;
                }
            }
            System.out.println("Student:"+name);
            System.out.println("Highest Marks:"+marks[maxIndex]+"in"+subjects[maxIndex]);
        }
    }
}
