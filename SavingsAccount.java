package Bank;

public class SavingsAccount extends BankAccount {
 private double interest=0.05; 
 private double maxWithLimit;
	public SavingsAccount(String memberName, double balance, double maxWithLimit,String memberNID) {
		
		super(memberName, balance, 2000,memberNID);
		this.maxWithLimit=maxWithLimit;
		setaccNumber("11-"+getAccNum());
		
	}
	public double getNetBalance() {
		 double NetBalance=((interest*getBalance())+getBalance());
		 return NetBalance;
	}
	public void withdraw(double amount)
	{
		if(amount<maxWithLimit)
		{
			super.withdrow(amount);
		}
		else
			System.out.println("maxWithLimit overflow");
	}
	public void withdraw(double amount, String transactionType){
		if(amount<maxWithLimit)
		{
			super.withdraw(amount, transactionType);
		}
		else
			System.out.println("maxWithLimit overflow");
		
		
	}
	public double getmaxWithLimit()
	{
		return maxWithLimit;
	}
	public String toString()
	{
		return super.toString()+"maxWithLimit: "+maxWithLimit;
	}

}