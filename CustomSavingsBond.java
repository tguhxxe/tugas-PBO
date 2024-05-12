
public class CustomSavingsBond {
	private double balance;
    private int term_months;
    private double interestRate;

    public CustomSavingsBond(int month) {
        setTermMonths(month);
    }

    public void setTermMonths(int month) {
        this.term_months = month;
        this.interestRate = computeInterestRate();
    }
    
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    
    public double hitungKenaikan(){
        double uangTotal = balance;
        for (int i = 0; i < term_months; i++) {
            double bungaBulanIni = uangTotal * (interestRate/100);
            uangTotal += bungaBulanIni; 
        }
        return uangTotal;
    }

    private double computeInterestRate() {
        if (term_months >= 0 && term_months <= 11) {
            return 0.5;
        } else if (term_months >= 12 && term_months <= 23) {
            return 1.0;
        } else if (term_months >= 24 && term_months <= 35) {
            return 1.5;
        } else if (term_months >= 36 && term_months <= 47) {
            return 2.0;
        } else if (term_months >= 48 && term_months <= 60) {
            return 2.5;
        } else {
            throw new IllegalArgumentException("Anda hanya bisa membeli dari 1 hingga 60 bulan");
        }
    }

    public double calculateInterest() {
        return interestRate / 100 * term_months;
    }

    public int getTerm() {
        return term_months;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
