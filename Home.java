package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener{
    
    public Home(){
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/Icons/front.jpg"));
       JLabel image = new JLabel(i1);
       image.setBounds(0, 0, 1600, 800);
       add(image);
        
       
       JLabel heading = new JLabel("FLY WITH AIR INDIA");
       heading.setBounds(500, 40, 1000, 40);
       heading.setForeground(Color.BLUE);
       heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
       image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
         JMenuItem customerDetails = new JMenuItem("Add Customer Details");
         customerDetails.addActionListener(this);
        details.add(customerDetails);
        
         JMenuItem BookFlight = new JMenuItem("Book Flight ");
         BookFlight.addActionListener(this);
        details.add(BookFlight);
        
         JMenuItem JourneyDetails = new JMenuItem("Journey Details");
         JourneyDetails.addActionListener(this);
        details.add(JourneyDetails);
        
         JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
         ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
         JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        }
    }
    
    
    public static void main(String[] args) {
         new Home();
    }
}
