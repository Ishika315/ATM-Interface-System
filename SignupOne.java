package bank.management.system;
// how you connect your project to jdbc --> interview question
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;    // for actionlistener

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField namefield,fnamefield,emailfield,addfield,stfield,ctfield,pnfield;
    JButton next,back;
    JRadioButton male,fmale,others,other,married,unmarried;
    JDateChooser dateChooser;
    
    
    SignupOne(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/black.jpg"));
        Image i2 = i1.getImage().getScaledInstance(750,723, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,750,723);
        add(image);
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L) + 1000L);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,27));
        formno.setBounds(170, 10, 600, 40);
        formno.setForeground(Color.yellow);
        image.add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(250, 70, 400, 30);
        personDetails.setForeground(Color.WHITE);
        image.add(personDetails);
        
        JLabel name = new JLabel("First Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(120, 120, 150, 30);
        name.setForeground(Color.WHITE);
        image.add(name);
        
        namefield = new JTextField();
        namefield.setFont(new Font("Raleway",Font.BOLD,14));
        namefield.setBounds(300,120,300,30);
        image.add(namefield);
        
        JLabel fname = new JLabel("Last Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(120, 170, 200, 30);
        fname.setForeground(Color.WHITE);
        image.add(fname);
        
        fnamefield = new JTextField();
        fnamefield.setFont(new Font("Raleway",Font.BOLD,14));
        fnamefield.setBounds(300,170,300,30);
        image.add(fnamefield);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(120, 220, 200, 30);
        dob.setForeground(Color.WHITE);
        image.add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,220,300,30);
        image.add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(120, 270, 200, 30);
        gender.setForeground(Color.WHITE);
        image.add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,270,60,30);
        male.setBackground(Color.LIGHT_GRAY);
        image.add(male);
        fmale = new JRadioButton("Female");
        fmale.setBounds(400,270,80,30);
        fmale.setBackground(Color.LIGHT_GRAY);
        image.add(fmale);
        others = new JRadioButton("Others");
        others.setBounds(520,270,80,30);
        others.setBackground(Color.LIGHT_GRAY);
        image.add(others);
        
        ButtonGroup gp = new ButtonGroup();
        gp.add(male);
        gp.add(fmale);
        gp.add(others);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(120, 320, 200, 30);
        email.setForeground(Color.WHITE);
        image.add(email);
        
        emailfield = new JTextField();
        emailfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailfield.setBounds(300,320,300,30);
        image.add(emailfield);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(120, 370, 200, 30);
        marital.setForeground(Color.WHITE);
        image.add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,370,80,30);
        married.setBackground(Color.LIGHT_GRAY);
        image.add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(410,370,90,30);
        unmarried.setBackground(Color.LIGHT_GRAY);
        image.add(unmarried);
        other = new JRadioButton("Others");
        other.setBounds(530,370,70,30);
        other.setBackground(Color.LIGHT_GRAY);
        image.add(other);
        
        ButtonGroup gp1 = new ButtonGroup();
        gp1.add(married);
        gp1.add(unmarried);
        gp1.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(120, 420, 200, 30);
        address.setForeground(Color.WHITE);
        image.add(address);
        
        addfield = new JTextField();
        addfield.setFont(new Font("Raleway",Font.BOLD,14));
        addfield.setBounds(300,420,300,30);
        image.add(addfield);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(120, 470, 200, 30);
        state.setForeground(Color.WHITE);
        image.add(state);
        
        stfield = new JTextField();
        stfield.setFont(new Font("Raleway",Font.BOLD,14));
        stfield.setBounds(300,470,300,30);
        image.add(stfield);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(120, 520, 200, 30);
        city.setForeground(Color.WHITE);
        image.add(city);
        
        ctfield = new JTextField();
        ctfield.setFont(new Font("Raleway",Font.BOLD,14));
        ctfield.setBounds(300,520,300,30);
        image.add(ctfield);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(120, 570, 200, 30);
        pincode.setForeground(Color.WHITE);
        image.add(pincode);
        
        pnfield = new JTextField();
        pnfield.setFont(new Font("Raleway",Font.BOLD,14));
        pnfield.setBounds(300,570,300,30);
        image.add(pnfield);
        
        back = new JButton("Back");
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        back.setBounds(200,610,150,30);
        back.addActionListener(this);
        image.add(back);
        
        next = new JButton("Next");
        next.setBackground(Color.red);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBounds(400,610,150,30);
        next.addActionListener(this);
        image.add(next);
        
        
        
        
       
        setSize(750,723);
        setLocation(250,3);
        setVisible(true); 
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        // convert long into string
        
        String name = namefield.getText();  
        // fetch the text value
        // setText = put value in textfield
        // getText = fetch value
        
        String fname = fnamefield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected())
            gender = "Male";
        else if(fmale.isSelected())
            gender = "Female";
        else if(others.isSelected())
            gender = "Others";
        
        String email = emailfield.getText();
        
        String marital = null;
        if(married.isSelected())
            marital = "Married";
        else if(unmarried.isSelected())
            marital = "Unmarried";
        else if(other.isSelected())
            marital = "Others";
        
        String address = addfield.getText();
        String city = ctfield.getText();
        String state = stfield.getText();
        String pin = pnfield.getText();
        
        try{
            if(ae.getSource() == next){
            if(name.equals("") || fname.equals(""))
                JOptionPane.showMessageDialog(null, "Both first and last name Required\nPlease check!!");
            else{
                Conn c = new Conn();
                // mysql query
                String query = "Insert into signup1 values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                // to execute the query use c,s
                c.s.executeUpdate(query);
            }
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
          }
        }
        catch(Exception e){     // for database error
            System.out.println(e);
        }
        if(ae.getSource() == back){
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args){
        new SignupOne();
    }

    
}
