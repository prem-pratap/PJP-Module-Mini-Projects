package project2;

public class RDAccount extends Account {
	private int noOfMonths;
	private double monthlyAmount;
	private double general,sCitizen;
	int ageOfACHolder;
	@Override
	public double calculateInterest() {
		 if (noOfMonths >= 0 && noOfMonths <= 6) {
        general = .0750;
        sCitizen = 0.080;
    } else if (noOfMonths >= 7 && noOfMonths <= 9) {
        general = .0775;
        sCitizen = 0.0825;
    } else if (noOfMonths >= 10 && noOfMonths <= 12) {
        general = .0800;
        sCitizen = 0.0850;
    } else if (noOfMonths >= 13 && noOfMonths <= 15) {
        general = .0825;
        sCitizen = 0.0875;
    } else if (noOfMonths >= 16 && noOfMonths <= 18) {
        general = .0850;
        sCitizen = 0.0900;
    } else if (noOfMonths >= 22) { 
        general = .0875;
        sCitizen = 0.0925;}
	interestRate = (ageOfACHolder < 50) ? general : sCitizen;
		return monthlyAmount*interestRate;
	}
	
	public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return monthlyAmount;
    }

    public void setAmount(double amount) {
        this.monthlyAmount = amount;
    }

    public int getNoOfMonth() {
        return noOfMonths;
    }

    public void setNoOfMonth(int noOfMonth) {
        this.noOfMonths = noOfMonth;
    }

    public int getAgeOfACHolder() {
        return ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }


}
