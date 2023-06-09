package virProj;

public class Atm {
  public static void main(String args[]) {
	  Transactions t1 = new Transactions();
	  t1.checkBalance(5000);
	  t1.deposit(1000,5000);
	  t1.withdraw(500,1000);
  }
}
class Transactions{
	int currbalance;
	int Amount;
	int balance;
	void checkBalance(int currbalance) {
		System.out.println(currbalance);
	}
	void deposit(int Amount,int currbalance) {
		balance = Amount+currbalance;
		System.out.println("Your Amount Has been Deposited.\nYour Balance is "+ balance);
	}
	void withdraw(int Amount,int currbalance) {
		if(Amount>currbalance) {
			System.out.println("Required Amount is less than the current Balance.Hence Cannot be withdrawn.");
		}else {
			System.out.println("Your Amount has Successfully withdrawn");
		}
	}
}
