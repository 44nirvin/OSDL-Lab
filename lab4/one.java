public class one {
    public static void main(String[] args){
        Hotel hotel= new Hotel(2);
        customer c1=new customer(hotel, "a");
        customer c2=new customer(hotel, "b");
        System.out.println("Number of rooms: "+ Hotel.rooms);
        c1.start();
        c2.start();
    }
}
