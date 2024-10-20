public class TermLifeInsurancePolicy extends InsurancePolicy {
    private String beneficiary;
    private int policyTerm;
    private double termPayout;

    public TermLifeInsurancePolicy(String policyHolderName, String beneficiary, int policyTerm, double termPayout) {
        super(policyHolderName);
        this.beneficiary = beneficiary;
        this.policyTerm = policyTerm;
        this.termPayout = termPayout;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary   
 = beneficiary;
    }

    public int   
 getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public double getTermPayout()   
 {
        return termPayout;
    }

    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }

    @Override
    public   
 void calculatePremium() {
        setPremiumAmount(termPayout / (12 * policyTerm));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Beneficiary: " + beneficiary +
                ", Policy Term: " + policyTerm +
                ", Term Payout: " + termPayout;
    }
}
