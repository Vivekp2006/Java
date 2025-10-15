class BankAccount{
	private double balance;
	
	//setter method 
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance=balance;
		}
	}
	//Getter Method
	public double getBalance() {
		return balance;
	}
}
public class VidEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.setBalance(50000);
		System.out.println("Account Balance:"+account.getBalance());
	}

}
