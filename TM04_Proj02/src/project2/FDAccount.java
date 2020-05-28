package project2;

public class FDAccount extends Account {

	private int noOfDays;
    private int ageOfACHolder;
    private double general,sCitizen;
    private double interest;
    @Override
    public double calculateInterest() {
        
      
        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) { 
                general = 0.0450;
                sCitizen=0.0500;}
             else if (noOfDays > 15 && noOfDays <= 29) { 
                general = 0.0475;
                sCitizen=0.0525;}
             else if (noOfDays >= 30 && noOfDays <= 45) { 
                general = 0.055;
                sCitizen=0.0600;}
             else if (noOfDays >= 46 && noOfDays <= 60) { 
                general = 0.0700;
                sCitizen=0.0750;}
             else if (noOfDays >= 61 && noOfDays <= 184) { 
                general = 0.0750;
                sCitizen=0.0800;}
             else if (noOfDays >= 185 && noOfDays <= 365) { 
                general = 0.0800;
                sCitizen=0.0850;}
            
        	interestRate = (ageOfACHolder < 50) ? general : sCitizen;
        }
        
    else{
            if (noOfDays >= 7 && noOfDays <= 14) 
            	interestRate = 0.065;
            else if (noOfDays >= 15 && noOfDays <= 29) 
               interestRate = 0.0675;
            else if (noOfDays >= 30 && noOfDays <= 45) 
               interestRate = 0.0675;
            else if (noOfDays >= 45 && noOfDays <= 60) 
               interestRate = 0.080;
            else if (noOfDays >= 61 && noOfDays <= 184) 
               interestRate = 0.0850;
            else if (noOfDays >= 185 && noOfDays <= 365) 
               interestRate = 0.10;
		}
            
        

        interest = amount * interestRate;

        return interest;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public int getAgeOfACHolder() {
        return ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
