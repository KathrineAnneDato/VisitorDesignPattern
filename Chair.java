public class Chair implements Furniture {
    private double size;

    public Chair(double size) {
        this.size = size;
    }

    @Override
    public double accept(ShippingFee visitor, double distance) {
        return visitor.computeShippingCost("Chair", distance, size);
    }
}
