package Bank;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Transaction {
	private double amount;
	private String transactionType;
	private LocalDateTime time;
	
	public Transaction(double amount,String transactionType) {
		
		this.amount=amount;
		this.transactionType=transactionType;
		this.time=LocalDateTime.now();
	}
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String appTime = transactionType.formatted(formatter);
		 return String.format("TransactionTime:"+appTime+" Tamount:"+amount+" TransactionType:"+transactionType);
	}
}