public interface Furniture {
    double accept(ShippingFee visitor, double distance);
}
