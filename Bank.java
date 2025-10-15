/*class BankAccount {
    int id, num;
    String name;
    double balance;

    BankAccount(int id, int num, String name, double balance) {
        this.id = id; this.num = num; this.name = name; this.balance = balance;
    }

    public String toString() {
        return id + " " + num + " " + name + " " + balance;
    }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount[] acc = {
		            new BankAccount(1, 101, "Rahul", 1000),
		            new BankAccount(2, 102, "Priya", 100000),
		            new BankAccount(3, 103, "Amit", 10000000000000.0),
		            new BankAccount(4, 104, "Sneha", 50000)
		        };

		        BankAccount max = acc[0];
		        for (BankAccount a : acc)
		            if (a.balance > max.balance) {
		            	max = a;
		            }
		        System.out.println("Max Balance User: " + max.name);
	}

}*/
/*
class BankAccount {
    int id, num;
    String name;
    double balance;

    BankAccount(int id, int num, String name, double balance) {
        this.id = id; this.num = num; this.name = name; this.balance = balance;
    }

    // Getters
    public int getId(){ 
    	return id; 
    	}
    public int getNum(){
    	return num; 
    	}
    public String getName(){ 
    	return name;
    	}
    public double getBalance(){ 
    	return balance; 
    	}

    // toString
    public String toString() {
        return id + " " + num + " " + name + " " + balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount[] acc = {
            new BankAccount(1, 101, "Rahul", 1000),
            new BankAccount(2, 102, "Priya", 100000),
            new BankAccount(3, 103, "Amit", 10000000000000.0),
            new BankAccount(4, 104, "Sneha", 50000)
        };

        BankAccount max = acc[0];
        for (BankAccount a : acc)
            if (a.getBalance() > max.getBalance())
                max = a;

        System.out.println("Max Balance User: " + max.getName());
    }
}
*/
public class Bank {
    public static void main(String[] args) {
        int[] ids = {1, 2, 3, 4};
        int[] nums = {101, 102, 103, 104};
        String[] names = {"Rahul", "Priya", "Amit", "Sneha"};
        double[] balances = {1000, 100000, 10000000000000.0, 50000};
        int maxIndex = 0;
        for (int i = 1; i < balances.length; i++) {
            if (balances[i] > balances[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Max Balance User: " + names[maxIndex]+"Max Balance: "+balances[maxIndex]);
    }
}
