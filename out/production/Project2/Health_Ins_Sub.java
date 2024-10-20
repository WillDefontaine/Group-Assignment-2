public class HealthInsurancePolicy extends InsurancePolicy implements Deductible {
    private double deductible;
    private double totalDeductiblePaid;
    private double coPayment;
    private double totalCoPaymentPaid;
    private double outOfPocket;

    public HealthInsurancePolicy(String policyHolderName, double deductible, double coPayment, double outOfPocket) {
        super(policyHolderName);
        this.deductible = deductible;
        this.coPayment = coPayment;
        this.outOfPocket = outOfPocket;
        this.totalDeductiblePaid = 0;
        this.totalCoPaymentPaid = 0;
    }

    public double getDeductible() {
        return deductible;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    public double getTotalDeductiblePaid()   
 {
        return totalDeductiblePaid;
    }

    public void setTotalDeductiblePaid(double totalDeductiblePaid) {
        this.totalDeductiblePaid = totalDeductiblePaid;
    }

    public double getCoPayment() {
        return coPayment;
    }

    public void setCoPayment(double coPayment) {
        this.coPayment = coPayment;
    }

    public double getTotalCoPaymentPaid() {
        return totalCoPaymentPaid;
    }

    public void setTotalCoPaymentPaid(double totalCoPaymentPaid) {
        this.totalCoPaymentPaid = totalCoPaymentPaid;
    }

    public double getOutOfPocket()   
 {
        return outOfPocket;
    }

    public void setOutOfPocket(double outOfPocket) {
        this.outOfPocket = outOfPocket;
    }

    @Override
    public void calculatePremium() {
        setPremiumAmount(deductible / 12);
    }

    @Override
    public boolean isDeductibleMet() {
        return totalDeductiblePaid >= deductible;
    }

    @Override
    public boolean isOutOfPocketMet() {
        return (totalDeductiblePaid + totalCoPaymentPaid) >= outOfPocket;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Deductible: " + deductible +
                ", Total Deductible Paid: " + totalDeductiblePaid +
                ", Co-Payment: " + coPayment +
                ", Total Co-Payment Paid: " + totalCoPaymentPaid +
                ", Out of Pocket: " + outOfPocket;
    }
}
