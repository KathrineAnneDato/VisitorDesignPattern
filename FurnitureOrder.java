import java.util.Scanner;

public class FurnitureOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance for shipping: ");
        double distance = scanner.nextDouble();

        Furniture[] furnitureItems = { new Chair(1.5), new Table(3.0), new Sofa(5.0) };
        ShippingFee costCalculator = new StandardShippingFee();

        for (Furniture item : furnitureItems) {
            double shippingCost = item.accept(costCalculator, distance);
            System.out.println(item.getClass().getSimpleName() + " shipping cost: $" + shippingCost);
        }
    }
}
