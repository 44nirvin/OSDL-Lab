/*1. Develop a Java application that uses a generic class with two type parameters
to store hotel room information. The generic class should be capable of holding
different data types for room identifiers and room attributes.
• Create a generic class Room<T, U>
• T represents Room Number or Room ID
• U represents Room Type or Price
• Demonstrate usage with different data types (e.g., Integer, String, Double)
• Display stored room details */

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


class Room<T, U> {
    private T roomId;
    private U roomAttribute;

    public Room(T roomId, U roomAttribute) {
        this.roomId = roomId;
        this.roomAttribute = roomAttribute;
    }

    public void displayRoom() {
        System.out.println("Room ID: " + roomId);
        System.out.println("Room Attribute: " + roomAttribute);
        System.out.println();
    }
}

public class one {
    public static void main(String[] args) {

        // Integer room number, String room type
        Room<Integer, String> room1 = new Room<>(101, "Deluxe");
        room1.displayRoom();

        // String room ID, Double price
        Room<String, Double> room2 = new Room<>("A-202", 3500.50);
        room2.displayRoom();

        // Integer room number, Double price
        Room<Integer, Double> room3 = new Room<>(303, 5000.00);
        room3.displayRoom();
    }
}

