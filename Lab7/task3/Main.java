public class Main {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);

        int comparisonResult = circle1.compareTo(circle2);

        if (comparisonResult > 0) {
            System.out.println("Circle 1 is larger.");
        } else if (comparisonResult < 0) {
            System.out.println("Circle 2 is larger.");
        } else {
            System.out.println("Both circles are of equal size.");
        }
    }
}
