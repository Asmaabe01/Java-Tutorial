package task2;
public class Main {
    public static void main(String[] args) {
        Employee boss = new Boss(5000);
        Employee commissionWorker = new CommissionWork(2000, 5000, 0.1);
        Employee pieceWorker = new PieceWorker(5, 100);
        Employee hourlyWorker = new HourlyWorker(15, 160);

        System.out.println("Boss's salary: " + boss.getPaid());
        boss.display();

        System.out.println("\nCommission Worker salary: " + commissionWorker.getPaid());
        commissionWorker.display();

        System.out.println("\nPiece Worker salary: " + pieceWorker.getPaid());
        pieceWorker.display();

        System.out.println("\nHourly Worker salary: " + hourlyWorker.getPaid());
        hourlyWorker.display();
    }
}
