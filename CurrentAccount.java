package Bank;

public class CurrentAccount extends BankAccount{
	private String tradeNumber;
	public CurrentAccount(String memberName, double balance,String tradeNumber,String memberNID) {
		super(memberName, balance, 5000,memberNID);
		this.tradeNumber=tradeNumber;
		setaccNumber("22-"+getAccNum());
	}

	
	

}