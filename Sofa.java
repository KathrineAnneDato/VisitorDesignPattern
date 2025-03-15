public class Sofa implements Furniture {
    private double size;

    public Sofa(double size) {
        this.size = size;
    }

    @Override
    public double accept(ShippingFee visitor, double distance) {
        return visitor.computeShippingCost("Sofa", distance, size);
    }
}
