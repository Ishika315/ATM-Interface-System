package bank.management.system;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 725, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 725);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(360,450,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        Conn c = new Conn();
        int balance = 0;
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'"); 
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        JLabel text = new JLabel("Your Current Account Balance is Rs. "+balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170,260,400,30);
        image.add(text);        
        
        setSize(900,725);
        setUndecorated(true);
        setLocation(220,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new transactions(pinnumber).setVisible(true);
    }
    
    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}



/*

iss page pr hmne kya kiya hai ki hmne conn iss baar button mae nhi daala jaise hm aagae actionListener mae daalte hai
iss baar hmne usae constructor mae dala hai, taaki hme saara kuch phle hi dikh jaaye
agr aapko bina button pr click kre kuch bhi krna hai toh constructor mae daalna hai
*/