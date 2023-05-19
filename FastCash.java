package bank.management.system;


import javax.swing.*;   // used for making jframe
import java.awt.*;
import java.awt.event.*;
import java.sql.*;  // used for resultSet 
import java.util.Date; // used for date package

public class FastCash extends JFrame implements ActionListener{

    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 725, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JLabel text = new JLabel("SELECT YOUR WITHDRAWL AMOUNT");
        text.setBounds(165,280,1000,35);
        image.add(text);
        text.setForeground(Color.yellow);
        text.setFont(new Font("System",Font.BOLD,18));
        
        deposit = new JButton("Rs 1000");
        deposit.setBounds(170,363,150,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Rs 5000");
        withdrawl.setBounds(347,363,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Rs 10000");
        fastcash.setBounds(170,393,150,25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Rs 20000");
        ministatement.setBounds(347,393,150,25);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Rs 50000");
        pinchange.setBounds(170,423,150,25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Rs 80000");
        balanceenquiry.setBounds(347,423,150,25);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("BACK");
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
             new transactions(pinnumber).setVisible(true);
         }
         else{
             String amount = ((JButton)ae.getSource()).getText().substring(3);
             Conn c = new Conn();
             try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'"); 
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return; 
                    // here we will write "return" so that you can't go ago until you have your withdraw amount > balance. 
                    //so stop here
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+" debitted successfully");
                
                setVisible(false);
                new transactions(pinnumber).setVisible(true);
                
             }catch(Exception e){
                 System.out.println(e);
             }
         }
    }   
    
    public static void main(String[] args){
        new FastCash("");
    }

    

}

