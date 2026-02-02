//EIPA Always!
//January 5,2026
//Lab 1
//Q2.Create a base class named Room to represent general room details in a hotel. The class should contain data members such as room 
//number, room type, and base price. Implement multiple constructors (constructor overloading) in the Room class to initialize room 
//objects in different ways, such as:
//i.Initializing only the room number and type
//ii.Initializing room number, type, and base price
//iii.Create a derived class named DeluxeRoom that inherits from the Room class using single inheritance. The derived class should 
//include additional data members such as free Wi-Fi availability and complimentary breakfast. Implement appropriate constructors in 
//the derived class that invoke the base class constructors using the super keyword.
//iv.Create a main class to instantiate objects of both Room and DeluxeRoom using different constructors and display the room details. 
//This application should clearly illustrate constructor overloading and inheritance.
class Room
{
    int roomnumber;
    String roomtype;
    float baseprice;
    Room(int roomnumber,String roomtype) //Answer i.
    {
        this.roomnumber=roomnumber;
        this.roomtype=roomtype;
        System.out.println("The Room Number is "+roomnumber+".");
        System.out.println("The Room Type is "+roomtype+".");
    }
    Room(int roomnumber,String roomtype,float baseprice) //Answer ii.
    {
        this.roomnumber=roomnumber;
        this.roomtype=roomtype;
        this.baseprice=baseprice;
        System.out.println("The Room Number is "+roomnumber+".");
        System.out.println("The Room Type is "+roomtype+".");
        System.out.println("The Base Price of the Room is "+baseprice+" per night.");
    }
}
class DeluxeRoom extends Room //Answer iii.
{
    boolean FreeWiFi;
    boolean ComplementaryBreakfast;
    DeluxeRoom(int roomnumber,String roomtype,float baseprice,boolean FreeWiFi,boolean ComplementaryBreakfast)
    {
        super(roomnumber,roomtype,baseprice);
        this.FreeWiFi=FreeWiFi;
        this.ComplementaryBreakfast=ComplementaryBreakfast;
        if (FreeWiFi==true)
        {
            System.out.println("The Room has Free Wi-Fi.");
        }
        else
        {
            System.out.println("The Room does not have Free Wi-Fi.");
        }
        if (ComplementaryBreakfast==true)
        {
            System.out.println("The package includes Complementary Breakfast.");
        }
        else
        {
            System.out.println("The package does not include Complementary Breakfast.");
        }
        
    }
}
public class Lab1_Q2
{
    public static void main(String[] args)
    {
        System.out.println("The Standard Room Details are:");
        Room room1=new Room(101,"Standard",10000);
        System.out.print("\n");
        System.out.println("The Deluxe Room Details are:");
        DeluxeRoom deluxeroom1=new DeluxeRoom(201,"Deluxe",20000,true,true);
    }
}