public class Table implements Furniture {
    private double size;

    public Table(double size) {
        this.size = size;
    }

    @Override
    public double accept(ShippingFee visitor, double distance) {
        return visitor.computeShippingCost("Table", distance, size);
    }
}
