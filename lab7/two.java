/*2. Create a Java program for a hotel room management system that uses a generic
method to display room-related data of different types such as room numbers,
room types, prices, and booking status.
• Implement a generic method <T> void display(T data)
• Call the method with:
1. Room number (Integer)
2. Room type (String)
3. Price per night (Double)
4. Booking status (Boolean)
• Ensure type safety without explicit casting
 */

class RoomDisplay {

    public static <T> void display(String label, T data) {
        System.out.println(label + ": " + data);
    }

    public static void main(String[] args) {
        display("Room Number", 101);
        display("Room Type", "Suite");
        display("Price per Night", 4500.75);
        display("Booking Status", true);
    }
}
