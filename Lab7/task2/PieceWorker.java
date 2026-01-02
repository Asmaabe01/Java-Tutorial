public class PieceWorker extends Employee {
    private double wagePerProduct;
    private int numberOfProducts;

    public PieceWorker(double wagePerProduct, int numberOfProducts) {
        this.wagePerProduct = wagePerProduct;
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public double getPaid() {
        return wagePerProduct * numberOfProducts;
    }

    @Override
    public void display() {
        System.out.println("Piece Worker with wage per product: " + wagePerProduct + " and number of products: " + numberOfProducts);
    }
}
