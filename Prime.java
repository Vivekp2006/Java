import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter start and end range");
		Scanner scanner=new Scanner(System.in);
		int srange= scanner.nextInt(); //starting range
		int erange=scanner.nextInt(); //ending range
		for(int i=srange;i<=erange;i++) {
			if(i<2) continue;
			int j;
			for(j=2;j<=i/2;j++) {
				if(i%j==0){
					break;
					}
				
				}
			if(j>i/2) {
				System.out.println(i);
			}
		}
	}

}
