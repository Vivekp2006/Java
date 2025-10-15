/*import java.util.InputMismatchException;
class TestNewException{
	static int a=10;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	static int a=sc(nextInt);
	public static expFirst(){
			try(){
				c=a/b;
			}
			catch(Exception e){
				}
			}
	public static expSecond(){
			try(){
				c=a+b;
			}
			catch(Exception e){
				}
			}
	public static void main(String args[]){
		expFirst();
}
}
*/






import java.util.InputMismatchException;
import java.util.Scanner;

class TestNewException{
    static Scanner sc=new Scanner(System.in);
    static int a=10;

    static void expFirst(){
        try{
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e){
            System.out.println("Exception caught: Division by zero!");
		expSecond();
		
        } 
	/*catch (InputMismatchException e){
            System.out.println("Exception caught");
            sc.nextLine();
        }*/
   
    }

    static void expSecond(){
        try{
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e){
            System.out.println("Exception caught");
        
        }
    }
	static void expThird(){
        try {
            int[] arr={1,2,3};
            System.out.print("Enter array index (0–2): ");
            int index=sc.nextInt();
            System.out.println("Value at index: " + arr[index]);
        } catch(Exception e){
            System.out.println("Exception caught");
        
        }
    }

    public static void main(String[] args){
        expFirst();
	expSecond();

    }
}

				
			
