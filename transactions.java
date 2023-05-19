package bank.management.system;

import javax.swing.*;   // used for making jframe
import java.awt.*;
import java.awt.event.*;

public class transactions extends JFrame implements ActionListener{

    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    transactions(String pinnumber){
        this.pinnumber = pinnumber;
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 725, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JLabel text = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        text.setBounds(165,280,1000,35);
        image.add(text);
        text.setForeground(Color.yellow);
        text.setFont(new Font("System",Font.BOLD,18));
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,363,150,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(347,363,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,393,150,25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(347,393,150,25);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,423,150,25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(347,423,150,25);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(170,454,328,25);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,725);
        setLocation(220,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
         if(ae.getSource() == exit){
             //System.exit(0);
             setVisible(false);
             new Login().setVisible(true);
         }
         else if(ae.getSource() == deposit){
             setVisible(false);
             new Deposit(pinnumber).setVisible(true);
         }
         else if(ae.getSource() == withdrawl){
             setVisible(false);
             new Withdrawl(pinnumber).setVisible(true);
         }
         else if(ae.getSource() == fastcash){
             setVisible(false);
             new FastCash(pinnumber).setVisible(true);
         }
         else if(ae.getSource() == pinchange){
             setVisible(false);
             new PinChange(pinnumber).setVisible(true);
         }
         else if(ae.getSource() == balanceenquiry){
             setVisible(false);
             new BalanceEnquiry(pinnumber).setVisible(true);
         }
         
    }   
    
    public static void main(String[] args){
        new transactions("");
    }

    

}
