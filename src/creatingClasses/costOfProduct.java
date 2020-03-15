package creatingClasses;
public class costOfProduct {
    public static void main(String[] args) {
calculateCost(100.0, 18.0);
calculateCost(100.0, 18.0, 6.5);
    }

    public static void calculateCost(double base, double tax) {

        double cost = (base + tax) * 1.1;
        System.out.println("your cost is:" + cost);
    }

    public static void calculateCost(double base, double tax, double ship) {

        double cost = (base + tax) * 1.1 + ship;
        System.out.println("your cost with shipping is:" + cost);

    }
}