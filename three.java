class RoomChargeCalculator<T extends Number> {

    private T price;
    private T discount;

    public RoomChargeCalculator(T price, T discount) {
        this.price = price;
        this.discount = discount;
    }

    public double totalPrice() {
        return price.doubleValue();
    }

    public double discountedPrice() {
        return price.doubleValue() - discount.doubleValue();
    }
}

public class three {
    public static void main(String[] args) {

        RoomChargeCalculator<Double> room1 =
                new RoomChargeCalculator<>(5000.0, 500.0);

        System.out.println("Total Price: " + room1.totalPrice());
        System.out.println("Discounted Price: " + room1.discountedPrice());

        // Compilation error:
        // RoomChargeCalculator<String> room2 =
        //        new RoomChargeCalculator<>("5000", "500");
    }
}