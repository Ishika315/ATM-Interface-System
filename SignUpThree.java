/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignUpThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/blakkfrm.png"));
        Image i2 = i1.getImage().getScaledInstance(750,723, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,750,723);
        add(image);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        l1.setForeground(Color.yellow);
        l1.setBounds(220,50,400,40);
        image.add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setForeground(Color.yellow);
        type.setBounds(100,110,200,30);
        image.add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,150,155,20);
        image.add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,150,240,20);
        image.add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,190,155,20);
        image.add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,190,240,20);
        image.add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,230,200,30);
        card.setForeground(Color.yellow);
        image.add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.ITALIC,22));
        number.setForeground(Color.white);
        number.setBounds(330,230,300,30);
        image.add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(102,260,300,20);
        carddetail.setForeground(Color.pink);
        image.add(carddetail);
        
        JLabel pin = new JLabel("PIN Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,300,200,30);
        pin.setForeground(Color.yellow);
        image.add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.ITALIC,22));
        pnumber.setForeground(Color.white);
        pnumber.setBounds(330,300,300,30);
        image.add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,330,300,20);
        pindetail.setForeground(Color.pink);
        image.add(pindetail);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,370,200,30);
        services.setForeground(Color.yellow);
        image.add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420,170,25);
        image.add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,420,180,25);
        image.add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,460,170,25);
        image.add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,460,180,25);
        image.add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,500,170,25);
        image.add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,500,180,25);
        image.add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above details are true, complete and correct to the best of my knowledge !!");
        c7.setBackground(Color.pink);
        c7.setForeground(Color.black);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(63,550,623,20);
        image.add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.red);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,620,100,30);
        submit.addActionListener(this);
        image.add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(400,620,100,30);
        cancel.addActionListener(this);
        image.add(cancel);
        
        
        setSize(750,723);
        setLocation(250,3);
        setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected())
                accountType = "Saving Account";
            else if(r2.isSelected())
                   accountType = "Fixed Deposit Account";
            else if(r3.isSelected())
                    accountType = "Current Account";
            else if(r4.isSelected())
                    accountType = "Reccuring Deposit Account";
            
            // generate card number by using random function
            
            Random random = new Random();
            
            String cardnumber = ""+ Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected())
                facility = facility + " ATM Card";
            else if(c2.isSelected())
                facility = facility + " Internet Banking";
            else if(c3.isSelected())
                facility = facility + " Mobile Banking";
            else if(c4.isSelected())
                facility = facility + " EMAIL & SMS Alerts";
            else if(c5.isSelected())
                facility = facility + " Cheque Book";
            else if(c6.isSelected())
                facility = facility + " E-Statement";
            
            try{
                if(accountType.equals(""))
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                else{
                    Conn conn = new Conn();
                    String query1 = "Insert into signup3 values ('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"' )";
                    String query2 = "Insert into login values ('"+formno+"', '"+cardnumber+"', '"+pinnumber+"' )";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber );
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                    
                }
            }   
            catch(Exception e){
                System.out.println();
            }
            
        }
        else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignUpThree("");
    }

    

    

}

