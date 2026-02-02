enum RoomType {
    STANDARD(2000),
    DELUXE(3500),
    SUITE(5000);
    //instance variables.
    private int pricePerNight;
    //constructor
    RoomType(int pricePerNight) {
    this.pricePerNight = pricePerNight;
}

public int getPrice() {
    return pricePerNight;
}
 // Method to calculate total cost
    public int calculateCost(int nights) {
        return pricePerNight * nights;
    }
}

public class two{
    public static void main(String args[]){
        RoomType room=RoomType.DELUXE;
        int nights=3;
        System.out.println("Room type: "+room);
        System.out.println("Price per night: "+room.getPrice());
        System.out.println("Number of nights: "+nights);
        System.out.println("Total Bill: "+(room.getPrice())*nights);
    }
}