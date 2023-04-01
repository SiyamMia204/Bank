package Bank;

import java.util.*;

public abstract class BankAccount{
	
	
		private String memberName, accNumber,memberNID;
		private double balance,minimumBalance;
		ArrayList<Transaction> ta=new ArrayList<>();
		
		public BankAccount(String memberName,double balance,double minimumBalance,String memberNID) {
			Random rand = new Random();
			String idaccNumber ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
			rand.nextInt(10)+ rand.nextInt(10);
			
			this.memberName=memberName;
			this.accNumber=idaccNumber;
			this.balance=balance;
			this.minimumBalance=minimumBalance;
			this.memberNID=memberNID;
			
		}
		public void addTransaction(double amt, String type) {
			Transaction t=new Transaction(amt,type);
			ta.add(t);
		}
		public void deposit(double ba)
		{
			
			deposit( ba,"Deposit");
			
		}
		protected void deposit(double ba,String transactionType)
		{
			
			balance+=ba;
			addTransaction(ba,transactionType);
			
		}
		protected void withdraw(double withAmount, String transactionType) {
			if((minimumBalance)<(balance-withAmount)) {
				balance=balance-withAmount;
				addTransaction(withAmount,transactionType);
				
			}
				
			else
				System.out.printf("haven't Balance\n");
			
		}
		public void withdrow(double withAmount)
		{
			
			withdraw(withAmount,"Withdraw");
		}
		public String toString() {
			return String.format("Name:"+memberName+" Id:"+accNumber+" balance:"+balance);
		}
		public String getMemberName()
		{
			return memberName;
		}
		public String getAccNum()
		{
			return accNumber;
		}
		public double getBalance()
		{
			return balance;
		}
		public void setaccNumber(String accNumber)
		{
			this.accNumber=accNumber;
		}
		public String getmemberNID()
		{
			return memberNID;
		}
		public ArrayList<Transaction>getTansactions(){
			return ta;
		}

}