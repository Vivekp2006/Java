package scann;


class Calc {
    int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
}
class Calculator extends Calc{
	int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
	 
}
public class TestOverloading {
    public static void main(String[] args) {
    	System.out.println("Parent Class:");
        Calc cal = new Calc();
        System.out.println(cal.add(4, 3));            
        System.out.println(cal.add(3.2f, 6.2f));       
        System.out.println(cal.add(5.3, 2.3));  
        System.out.println("Child Class:");
        Calculator Calcu=new Calculator();
        System.out.println(Calcu.add(2, 3));
        System.out.println(Calcu.add(3.5, 4.5));
        System.out.println(Calcu.add(2.8f,3.4f));
        
    }
}
