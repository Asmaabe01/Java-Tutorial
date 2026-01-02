public class HourlyWorker extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyWorker(double hourlyWage, double hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPaid() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void display() {
        System.out.println("Hourly Worker with hourly wage: " + hourlyWage + " and hours worked: " + hoursWorked);
    }
}
