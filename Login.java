package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JTextField cardTextField;
    JPasswordField pinTextField;
    JButton login, signup, clear, exit;   
    // globally define so that we can use them outside the constructor
    // class ka object bnate hi frame aa jaye
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/bank1.jpg"));
        Image i6 = i5.getImage().getScaledInstance(850,630, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel image = new JLabel(i7);
        image.setBounds(0,0,680,440);
        add(image);
 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        
        // to change the image location
        label.setBounds(50,5,50,100); // custom layout
        
        image.add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setForeground(Color.yellow);
        text.setBounds(130,35,400,40);
        image.add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setForeground(Color.yellow);
        cardno.setBounds(40,140,130,30);
        image.add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(250,140,300,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        image.add(cardTextField);
        
        JLabel pin = new JLabel("Pin No:");
        pin.setFont(new Font("Osward", Font.BOLD,28));
        pin.setForeground(Color.yellow);
        pin.setBounds(40,220,250,30);
        image.add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(250,220,300,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        image.add(pinTextField);
        
        login = new JButton("LOGIN");
        login.setBounds(250,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.yellow);
        login.addActionListener(this);
        image.add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(40,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.yellow);
        clear.addActionListener(this);
        image.add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(450,300,100,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.yellow);
        signup.addActionListener(this);
        image.add(signup);
        
        setUndecorated(true);
        
        exit = new JButton("EXIT");
        exit.setBounds(40,350,510,30);
        exit.setBackground(Color.black);
        exit.setForeground(Color.yellow);
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.addActionListener(this);
        image.add(exit);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(600,400);
        setVisible(true);   // by default frame visible is hidden from user
        setLocation(370,130);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == exit){
             System.exit(0);
         }
        else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            
            // here we will fetch the data from login table from mysql jdbc earlier we will fetch the data from
            // .java class and present it in mysql.
            
            String query = "select * from login where card_Number = '"+cardnumber+"' and pin_Number = '"+pinnumber+"'";
            try{
                // here the type of data is result set in which we have the result of query.
                // result set is in the sql package so we have to import it here
                ResultSet rs = conn.s.executeQuery(query);
                // the query which is executed here is stored in the resultSet
                
                
                if(rs.next()){  // kya data yha nikl kr aaya hai ?
                    // mtlb yha user login correct hua hai toh hme iss frame ko close krke
                    // transaction frame open krna hai, toh hm issiliye yha object bnayenge
                    setVisible(false);
                    new transactions(pinnumber).setVisible(true);
                }
                // agr yha data match na hua then we have to show a dialogue box here
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin Number\nPlease Check It !!");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup){
            // very important interview question that how we connect it to next page and database
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();   // class ka anonymous object
    }
}
