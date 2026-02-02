//EIPA Always!
//January 5,2026
//Lab 1
//Q3.Design and implement a Java application to simulate a Hotel Room Booking System that demonstrates the object-oriented concepts
//of inheritance and runtime polymorphism.
//i.Create a base class named Room that represents a general hotel room. The class should contain data members such as room number 
//and base tariff, and a method calculateTariff() to compute the room cost.
//ii.Create derived classes such as StandardRoom and LuxuryRoom that inherit from the Room class. Each derived class should override 
//the calculateTariff() method to compute the tariff based on room-specific features such as air conditioning, additional amenities,
//or premium services.
//iii.In the main class, create a base class reference of type Room and assign it to objects of different derived 
//classes (StandardRoom, LuxuryRoom). Invoke the calculateTariff() method using the base class reference to demonstrate
//runtime polymorphism, where the method call is resolved at runtime based on the actual object type.
class Room
{
    int roomnumber;
    float basetariff;
    int noofdays;
    Room(int roomnumber,int noofdays,float basetariff)
    {
        this.roomnumber=roomnumber;
        this.noofdays=noofdays;
        this.basetariff=basetariff;
    }
    float calculateTariff(int noofdays)
    {
        return basetariff*noofdays;
    }
}
class StandardRoom extends Room
{
    int AirConditioningCharge=200;
    int RoomServiceCharge=150;
    StandardRoom(int roomnumber,int noofdays,float basetariff)
    {
        super(roomnumber,noofdays,basetariff);
    }
    float calculateTariff(int noofdays)
    {
        System.out.println("The Room Number is "+roomnumber+".");
        System.out.println("The Room Type is Standard.");
        System.out.println("The Total Air Conditioning Charge is "+AirConditioningCharge*noofdays+".");
        System.out.println("The Total Room Service Charge is "+RoomServiceCharge*noofdays+".");
        return (basetariff+RoomServiceCharge+AirConditioningCharge)*noofdays;
    }
}
class LuxuryRoom extends Room
{
    int SpaCharge=1500;
    int PrivatePoolCharge=1000;
    LuxuryRoom(int roomnumber,int noofdays,float basetariff)
    {
        super(roomnumber,noofdays,basetariff);
    }
    float calculateTariff(int noofdays)
    {
        System.out.println("The Room Number is "+roomnumber+".");
        System.out.println("The Room Type is Luxury.");
        System.out.println("The Total Spa Charge is "+SpaCharge*noofdays+".");
        System.out.println("The Total Private Pool Charge is "+PrivatePoolCharge*noofdays+".");
        return (basetariff+SpaCharge+PrivatePoolCharge)*noofdays;
    }
}
public class Lab1_Q3
{
    public static void main(String args[])
    {
        Room room=new StandardRoom(101,5,5000);
        Room room1=new LuxuryRoom(201,5,7000);
        System.out.println("The Room charges are:");
        System.out.println("The Total Room Charge is "+room.calculateTariff(5)+" .");
        System.out.println("The Room charges are:");
        System.out.println("The Total Room Charge is "+room1.calculateTariff(5)+" .");
    }
}
