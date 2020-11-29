import javax.swing.*;

public class RoomAvailability
{
    Queue not = new Queue();
    Queue temp = new Queue();
    int roomId = 1210;
    
    public void available()
    {
        roomId++;
        System.out.println("The room is available for booking!");
        not.enqueue(roomId);
    }
    
    public void NotAvailable()
    {
        if(not.isEmpty())
            System.out.println("Sorry, the room is not available for booking!");
        else
        {
            Object data = not.dequeue();
            System.out.println(" ");
        }
    }
}
