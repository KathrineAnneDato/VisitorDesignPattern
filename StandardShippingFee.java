public class StandardShippingFee implements ShippingFee {
    @Override
    public double computeShippingCost(String itemName, double distance, double size) {
        switch (itemName) {
            case "Chair": return (10.0 + (distance * 0.5)) * size;
            case "Table": return (25.0 + (distance * 0.7)) * size;
            case "Sofa": return (50.0 + (distance * 1.0)) * size;
            default: return 0.0;
        }
    }
}
