class OrderProcessing implements Runnable {

    String orderId;

    OrderProcessing(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Order " + orderId + ": Validation started");
            Thread.sleep(1000);
            System.out.println("Order " + orderId + ": Validation completed");

            System.out.println("Order " + orderId + ": Payment processing");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.println("Order " + orderId + ": Processing .");
            }

            System.out.println("Order " + orderId + ": Shipment initiated");
            Thread.sleep(1000);
            System.out.println("Order " + orderId + ": Order shipped");

        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " was interrupted.");
        }
    }
}

public class two {

    public static void main(String[] args) {

        Thread order1 = new Thread(new OrderProcessing("ORD101"));
        Thread order2 = new Thread(new OrderProcessing("ORD102"));
        Thread order3 = new Thread(new OrderProcessing("ORD103"));

        System.out.println("Online order processing started...\n");

        order1.start();
        order2.start();
        order3.start();

        System.out.println(
                "\nMultiple customer orders are being processed concurrently."
        );
    }
}
