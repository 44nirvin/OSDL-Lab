class roomService implements Runnable {

    String service;
    int duration;

    roomService(String service, int duration) {
        this.service = service;
        this.duration = duration;
    }

    @Override
    public void run() {
        try {
            System.out.println(service + " started");

            // Remaining processing time
            Thread.sleep(duration);

            System.out.println(service + " completed in "+duration/1000+" minutes");

        } catch (InterruptedException e) {
            System.out.println(service + " was interrupted.");
        }
    }
}

public class one{
        public static void main(String[] args) {

        Thread cleaning = new Thread(new roomService("Room Cleaning", 15000));
        Thread foodDelivery = new Thread(new roomService("Food Delivery", 20000));
        Thread maintenance = new Thread(new roomService("Maintenance Service", 5000));

        System.out.println("Hotel services initiated...\n");

        cleaning.start();
        foodDelivery.start();
        maintenance.start();

        System.out.println("\nAll service requests are being processed concurrently.");
    }
}
