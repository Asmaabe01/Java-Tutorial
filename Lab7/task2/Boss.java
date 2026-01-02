public class Boss extends Employee {
    private double salary;

    public Boss(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaid() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Boss with fixed salary: " + salary);
    }
}
