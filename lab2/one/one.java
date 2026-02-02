class HotelBilling {

    public static Double calculateRoomCharge(Double tariff, Integer days) {
        return tariff*days;
    }

    public static Double calculateTotalBill(Double roomCharge, Double service) {
        // Unboxing
        return roomCharge + service;
    }

    public static void displayBill(Double tariff, Integer days, Double service, Double total) {

        System.out.println("----- Hotel Bill Details -----");
        System.out.println("Room Tariff per Day : " + tariff);
        System.out.println("Number of Days      : " + days);
        System.out.println("Service Charges     : " + service);
        System.out.println("Final Bill Amount   : " + total);
    }
}
public class one {

    public static void main(String[] args) {


        double roomTariff = 3000.00;
        int daysStayed = 4;
        double serviceCharges = 1500.50;

        // Autoboxing
        Double roomTariffObj = roomTariff;
        Integer daysStayedObj = daysStayed;
        Double serviceChargesObj = serviceCharges;

        Double roomCharge = HotelBilling.calculateRoomCharge(
                roomTariffObj, daysStayedObj);

        Double totalBill = HotelBilling.calculateTotalBill(
                roomCharge, serviceChargesObj);

        HotelBilling.displayBill(
                roomTariffObj, daysStayedObj, serviceChargesObj, totalBill);
    }
}
