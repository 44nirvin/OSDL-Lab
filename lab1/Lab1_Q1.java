//EIPA Always!
//January 5,2026
//Lab 1
//Q1.Create a Book class with private data members including book ID, book title, author name, price, and availability status.
//Provide public setter methods to assign values to these data members and public getter methods to retrieve their values.
//Include validation in setter methods to ensure that the price is a positive value.
class Book
{
    private int bookID;
    private String Title;
    private String Author;
    private float Price;
    private boolean Availability;
    public int setgetbookID(int bookID)
    {
        this.bookID=bookID;
        return bookID;
    }
    public String setgetTitle(String Title)
    {
        this.Title=Title;
        return Title;
    }
    public String setgetAuthor(String Author)
    {
        this.Author=Author;
        return Author;
    }
    public float setgetPrice(float Price)
    {
        if (Price<=0)
        {
            System.out.println("The Price must be a positive value.");
            return 0;
        }
        this.Price=Price;
        return Price;
    }
    public String setgetAvailability(boolean Availability)
    {
        this.Availability=Availability;
        if (Availability==true)
        {
            return "Available";
        }
        return "Not Available";
    }
}
public class Lab1_Q1
{
    public static void main(String[] args)
    {
        Book bookmark=new Book();
        System.out.println("The BookID is "+bookmark.setgetbookID(1)+".");
        System.out.println("The Book Title is "+bookmark.setgetTitle("October Junction")+".");
        System.out.println("The Book Author is "+bookmark.setgetAuthor("Divya Prakash Dubey")+".");
        System.out.println("The Book Price is "+bookmark.setgetPrice(150)+" .");
        System.out.println("The Book Status is:"+bookmark.setgetAvailability(false));
    }
}