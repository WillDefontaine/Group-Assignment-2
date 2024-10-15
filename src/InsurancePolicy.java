public abstract class InsurancePolicy {

    private String fullName;
    private int policyNumber;
    private static int totalPolicy = 0;
    private double premiumAccount = 0;

    public InsurancePolicy(String fullName) {
        this.fullName = fullName;
        this.totalPolicy++;
        this.policyNumber = this.totalPolicy;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public static int getTotalPolicy() {
        return totalPolicy;
    }

    public static void setTotalPolicy(int totalPolicy) {
        InsurancePolicy.totalPolicy = totalPolicy;
    }

    public double getPremiumAccount() {
        return premiumAccount;
    }

    public void setPremiumAccount(double premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    public abstract void calculatePremium();

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "fullName='" + fullName + '\'' +
                ", policyNumber=" + policyNumber +
                ", premiumAccount=" + premiumAccount +
                '}';
    }


}

