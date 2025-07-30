package scann;
import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter a:");
		a= scanner.nextInt();
		System.out.print("Enter b:");
		b= scanner.nextInt();
		System.out.println(a+b);
		if(a>b) {
			System.out.println("Division a/b:"+a/b);
		}
		else{
			System.out.println("Division b/a:"+b/a);
		}
		
	}

}
