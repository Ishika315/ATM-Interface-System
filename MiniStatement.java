package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame{
    
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel mini = new JLabel();
        add(mini);
        
        JLabel bank = new JLabel("Sky Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin_Number = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("card_Number").substring(0,4)+"XXXXXXXX"+rs.getString("card_Number").substring(12));
            } 
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText()+rs.getString("date"));
            }
        }catch(Exception e){
            System.out.println(e); 
        }
        
        
        
        
        setSize(400,620);
        setLocation(450,40);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new MiniStatement("");
    }
}
