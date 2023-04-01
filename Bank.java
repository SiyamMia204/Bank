package Bank;
import java.util.*;

public class Bank {
	private String bankName;
	private ArrayList<BankAccount>accounts=new ArrayList<>();
	public Bank(String bankName) {
		this.bankName=bankName;
	}
	public String getbankName()
	{
		return bankName;
	}
	public ArrayList <BankAccount>getArrayList()
	{
		return accounts;
	}
	public void addAccount(String memberName,double accountBalance,double maxWithdrawLimit,String memberNID )
	{
		SavingsAccount s1=new SavingsAccount(memberName,accountBalance,maxWithdrawLimit,memberNID);
		accounts.add(s1);
		System.out.println(s1);
	}
	public void addAccount(String memberName,double accountBalance,String tradeLicenseNumber,String memberNID)
	{
		CurrentAccount c1=new CurrentAccount(memberName,accountBalance,tradeLicenseNumber,memberNID);
		accounts.add(c1);
		System.out.println(c1);
		
	}
	public BankAccount findAccount(String accountNum) {
		for(BankAccount a:accounts)
		{
			if(a.getAccNum().equals(accountNum))
			{
				return a;
			}
		}
		
			return null;
			
	}
	public void transfer(String fromAccNum, String toAccNum, double amt) {
		BankAccount A1=findAccount(fromAccNum);
		BankAccount A2=findAccount(toAccNum);
		if(A1!= null && A2!= null)
		{
			A1.withdraw(amt,"Transferred");
			A2.deposit(amt,"Received");
		}
		else
			System.out.println("Invalid account");
		
	}
	public void deposit(String accountNum, double amt) {
		BankAccount b=findAccount(accountNum);
		if(b!=null)
		{
			b.deposit(amt);
		}
		else
		{
			System.out.println("Invalide account");
		}
	}
	public void withdraw(String accountNum, double amt) {
		
		BankAccount c=findAccount(accountNum);
		if(c!=null)
		{
			c.withdrow(amt);
		}
		else
		{
			System.out.println("Invalide account");
		}
	}
	public double getBalance(String accountNum) {
		BankAccount c=findAccount(accountNum);
		if(c!=null)
		{
			if(c instanceof CurrentAccount) {
				double b=c.getBalance();
				return b;
			}
			else if(c instanceof SavingsAccount){
				double b=((SavingsAccount)c).getNetBalance();// getNetBalance() howar khotha
				return b;	
			}
				
			
		}
		else
		{
			System.out.println("Invalide account");
		}
		return 0;
		
	}
	public ArrayList<BankAccount> getAccounts(){
		for(BankAccount a:accounts)
		{
			
				return accounts;
			}
		return null;
				
	}
	
	public ArrayList<BankAccount> getAccounts(String type){
		
		
		if(type.equals("CurrentAccount"))
		{
			ArrayList<BankAccount>Ca=new ArrayList<>();
			for(BankAccount a:accounts)
			{
				
				if(a instanceof CurrentAccount )
				{
					Ca.add(a);
				}
		}
			return Ca;
		}
		else if(type.equals("SavingsAccount"))
		{
			ArrayList<BankAccount>Sa=new ArrayList<>();
			for(BankAccount a:accounts)
			{
				
				if(a instanceof SavingsAccount )
				{
					Sa.add(a);
				}
		}
			return Sa;
		}
		
		
		return null;
	}
	public ArrayList<Transaction> getAccTransactions(String accountNum){
		
		BankAccount c=findAccount(accountNum);
		if(c!= null)
		{
			
			
			return c.getTansactions();
		}
		else
			System.out.println("Invalide account");
		return null;
	}
	public ArrayList<BankAccount> findAccounts(String memberNID){
		
		ArrayList<BankAccount>AcN=new ArrayList<>();
		
		for(BankAccount a:accounts)
		{
			
				if(a.getmemberNID().equals(memberNID))
				{
					AcN.add(a);
				}
			}
		if(AcN!=null)
		{
			return AcN;
		}
		else
		return null;
	}
	public void Display()
	{
		for(BankAccount a:accounts)
		{
			
				System.out.println(a);
			}
	}
	public void Displaysp(String Anum)
	{
		BankAccount c=findAccount(Anum);
		if(c!=null)
		{
			System.out.println(c);
		}
		else
			System.out.println("invalid account");
	}
	public void Display(String g)
	{
		if(g.equals("CurrentAccount"))
		{
			for(BankAccount a:accounts)
			{
				
				if(a instanceof CurrentAccount )
				{
					System.out.println(a);
				}
		}
		
			
				
			}
		else {
			for(BankAccount a:accounts)
			{
				
				if(a instanceof SavingsAccount )
				{
					System.out.println(a);
				}
		}
		}
	}
	public BankAccount findAccount(String memberNid, String accountNumber) {
		BankAccount c=findAccount(accountNumber);
		if(c!=null)
		{
			for(BankAccount a:accounts)
			{
				
				if(a.getmemberNID().equals(memberNid) )
				{
					return a;
				}
		}
		}
		return null;
		
	}
	
	public ArrayList<Transaction> GetAccTransactions(String memberNid, String accountNum){
		BankAccount a=findAccount( memberNid,  accountNum);
		if(a!=null) {
			return a.getTansactions();
			
		}
		
		return null;
	}
	
	
		
	}