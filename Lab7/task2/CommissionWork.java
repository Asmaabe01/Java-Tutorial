public class CommissionWork extends Employee {
    private double baseSalary;
    private double salesAmount;
    private double commissionRate;

    public CommissionWork(double baseSalary, double salesAmount, double commissionRate) {
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaid() {
        return baseSalary + (salesAmount * commissionRate);
    }

    @Override
    public void display() {
        System.out.println("Commission Worker with base salary: " + baseSalary + ", sales amount: " + salesAmount + ", and commission rate: " + commissionRate);
    }
}
