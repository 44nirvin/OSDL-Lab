//EIPA Always!
//January 5,2026
//Lab 1
//Q4.Create an abstract class named Room that represents a generic hotel room. The abstract class should contain common data
//members such as room number and base price, and include an abstract method calculateTariff() that must be implemented by all 
//subclasses. It may also include concrete methods such as displayRoomDetails().
//i.Create derived classes such as StandardRoom and LuxuryRoom that extend the abstract Room class and provide concrete 
//implementations for the calculateTariff() method based on room-specific features.
//ii.Create an interface named Amenities that declares methods such as provideWifi() and provideBreakfast(). The derived room 
//classes should implement this interface to define the amenities offered for each room type.
//iii.Create a main class to instantiate different room objects using a base class reference and invoke the implemented methods
//to demonstrate abstraction and interface-based design.
abstract class Room
{
    int roomnumber;
    String roomtype;
    float baseprice;
    Room(int roomnumber,String roomtype,float baseprice)
    {
        this.roomnumber=roomnumber;
        this.roomtype=roomtype;
        this.baseprice=baseprice;
    }
    abstract float calculateTariff(int noofdays);
    void displayRoomDetails()
    {
        System.out.println("The Room Number is "+roomnumber+".");
        System.out.println("The Room Type is "+roomtype+".");
        System.out.println("The Base Price of the Room is "+baseprice+" per night.");
    }
}
interface Amenities
{
    abstract void provideWiFi();
    abstract void provideBreakfast();
}
class StandardRoom extends Room implements Amenities
{
    int AirConditioningCharge=200;
    int RoomServiceCharge=150;
    StandardRoom(int roomnumber,float basetariff)
    {
        super(roomnumber,"Standard",basetariff);
    }
    @Override
    public void provideWiFi()
    {
        System.out.println("This Room provides Complementary Wi-Fi Service.");
    }
    @Override
    public void provideBreakfast()
    {
        System.out.println("This Room does not provide Complementary Breakfast Service.");
    }
    @Override
    float calculateTariff(int noofdays)
    {
        displayRoomDetails();
        provideWiFi();
        provideBreakfast();
        System.out.println("The Total Air Conditioning Charge is "+AirConditioningCharge*noofdays+".");
        System.out.println("The Total Room Service Charge is "+RoomServiceCharge*noofdays+".");
        return (baseprice+RoomServiceCharge+AirConditioningCharge)*noofdays;
    }
}
class LuxuryRoom extends Room implements Amenities
{
    int SpaCharge=1500;
    int PrivatePoolCharge=1000;
    LuxuryRoom(int roomnumber,float basetariff)
    {
        super(roomnumber,"Luxury",basetariff);
    }
    @Override
    public void provideWiFi()
    {
        System.out.println("This Room provides Complementary Wi-Fi Service.");
    }
    @Override
    public void provideBreakfast()
    {
        System.out.println("This Room provides Complementary Breakfast Service.");
    }
    @Override
    float calculateTariff(int noofdays)
    {
        displayRoomDetails();
        provideWiFi();
        provideBreakfast();
        System.out.println("The Total Spa Charge is "+SpaCharge*noofdays+".");
        System.out.println("The Total Private Pool Charge is "+PrivatePoolCharge*noofdays+".");
        return (baseprice+SpaCharge+PrivatePoolCharge)*noofdays;
    }
}
public class Lab1_Q4
{
    public static void main(String args[])
    {
        Room room=new StandardRoom(101,5000);
        Room room1=new LuxuryRoom(201,7000);
        System.out.println("The Room charges and facilities are:");
        System.out.println("The Total Room Charge is "+room.calculateTariff(5)+" .");
        System.out.println("The Room charges and facilities are:");
        System.out.println("The Total Room Charge is "+room1.calculateTariff(5)+" .");
    }    
}
