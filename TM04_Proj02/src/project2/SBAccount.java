package project2;

public class SBAccount extends Account {
	String accountType="Normal";
	@Override
	public double calculateInterest() {
		
		if(accountType.equals("Normal"))
			setInterestRate(4);
		amount=getAmount();
		interestRate=getInterestRate();
		double interest=amount*interestRate/100.0;
		return interest;
	}
	
	
	public double getInterestRate() {
		return interestRate;}
	
	public void setInterestRate(int irate) {
		this.interestRate=irate;
	} 
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amt) {
		this.amount=amt;
	}

}
