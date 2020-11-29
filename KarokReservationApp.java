import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class KarokReservationApp
{
    public static void main (String args[])
    {
        //Welcome message
        JOptionPane.showMessageDialog(null,"                              WELCOME TO ORANGE BOX KARAOKE RESERVATION!\n\nPlease insert your details in the following input dialog box to reserve our karaoke room.");
        
        //Declaration of variables
        custDetails C[] = new custDetails[5]; //declare arraylist for customer details
        int choice=1;
        
        
        //User insert details (use of arrayList)
        while(choice == 1)
        {
            if(choice==1)
            {
                int i=0;
               String name = JOptionPane.showInputDialog("Enter Name: ");
               
               String ic = JOptionPane.showInputDialog("Enter NRIC (without '-'): ");
               
               String email = JOptionPane.showInputDialog("Enter Email: ");
               
               //Display menu
               System.out.println("\n\t\t\t  ORANGE BOX KARAOKE");
               System.out.println("\t\t    Opening hour: 10:00 AM - 4:00 AM");
               System.out.println("\n\n  Pricing (Per Person)");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("  ROOM TYPE/HOUR |   3 HOURS   |   4 HOURS   |   5 HOURS   ");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("  [D] Deluxe \t |    RM 20    |    RM 25    |    RM 30    ");
               System.out.println("  [M] Master \t |    RM 40    |    RM 45    |    RM 50    ");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("*Price not include 6% govt. tax");
               
               String roomType = JOptionPane.showInputDialog("Type of Room (D/M): ");
               
               int numPeople = Integer.parseInt(JOptionPane.showInputDialog("Number of People: "));
               
               String date = JOptionPane.showInputDialog("Enter Date of Reservation (dd/mm/yyyy): ");
               
               int hour = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours of Reservation (Min 3 hours): "));
               
               while(hour < 3 || hour > 5)
               {
                   JOptionPane.showMessageDialog(null,"Sorry, minimum hour is 3 and maximum hour is 5!");
                   hour = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours of Reservation (Min 3 hours): "));
                }
               C[i] = new custDetails(name,ic,email,roomType,numPeople,date,hour);
               C[i].calcPrice();
               System.out.println("\nYour Reservation Details: ");
               System.out.println("-----------------------------");
               System.out.println(C[i].toString());
               i++;
               choice = Integer.parseInt(JOptionPane.showInputDialog("Continue next reservation+? (1-Yes / 2-No: )"));
            }
        }
        
        //search for available rooms
        
        //output
        
        
    }
}
