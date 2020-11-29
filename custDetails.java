import javax.swing.*;
import java.util.*;
public class custDetails
{
    private String name, ic, email, date, roomType;
    private int hour, numPeople;
    private double price;
    
    public custDetails()
    {
        name = null;
        ic = null;
        email = null;
        date = null;
        roomType = null;
        hour = ' ';
        numPeople = ' ';
    }
    
    public custDetails(String newName, String newIc, String newEmail, String newRoomType, int newNumPeople, String newDate,  int newHour)
    {
        name = newName;
        ic = newIc;
        email = newEmail;
        date = newDate;
        roomType = newRoomType;
        hour = newHour;
        numPeople = newNumPeople;
    }
    
    public String getName()
    {   
        return name;  
    }
    
    public String getIc()
    {   
        return ic;  
    }
    
    public String getEmail()
    {   
        return email; 
    }
    
    public String getDate()
    {   
        return date; 
    }
    
    public String getRoomType()
    {   
        return roomType; 
    }
    
    public int getHour()
    {   
        return hour; 
    }
    
    public int getNumPeople()
    {   
        return numPeople; 
    }
    
    public void calcPrice()
    {
        if(roomType.equalsIgnoreCase("D")){
            if(hour == 3)
                price = (20*numPeople);
            else if(hour == 4)
                price = (25*numPeople);
            else
                price = (30*numPeople);
        }
        else{
            if(hour == 3)
                price = (40*numPeople);
            else if(hour == 4)
                price = (45*numPeople);
            else
                price = (50*numPeople);
        }
        
        double tax = price*0.06;
        price = price + tax;
    }
    
    //output : Name, IC, Email, Date Reservation, Room Type, Hours of Reservation, Booking No, Total Price
    public String toString()
    {
        return("Name: " + name + "\nIC No: " + ic + " \nEmail: " + email  + "\nDate of Reservation: " + date + "\nRoom Type (Deluxe / Master): " + roomType + "\nHours of Reservation (Min 3hrs): " + hour + "\nNo of People: " + numPeople + "\n\nTotal Price: RM " + price);    
    }
}

   