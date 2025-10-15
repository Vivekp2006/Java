class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	
}

public class VidOverload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		System.out.println("int Sum:"+calc.add(5.5,10));
		System.out.println("Double Sum: "+calc.add(2.5, 3.4));
	}

}
