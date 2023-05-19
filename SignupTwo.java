package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;    


public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField namefield,fnamefield,emailfield,addfield,stfield,ctfield,pnfield,occufield;
    JButton next;
    JComboBox religion,category,income,education;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/neon.png"));
        Image i2 = i1.getImage().getScaledInstance(750,723, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,750,723);
        add(image);
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,28));
        additionalDetails.setBounds(220, 70, 350, 30);
        additionalDetails.setForeground(Color.WHITE);
        image.add(additionalDetails);
        
        JLabel acname = new JLabel("Account Type:");
        acname.setFont(new Font("Raleway",Font.BOLD,20));
        acname.setBounds(120, 120, 150, 30);
        acname.setForeground(Color.WHITE);
        image.add(acname);
        
        String valReligion[] = {"Savings","Current"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,120,300,30);
        religion.setBackground(Color.white);
        image.add(religion);
        
        
        JLabel worktype = new JLabel("Work Type:");
        worktype.setFont(new Font("Raleway",Font.BOLD,20));
        worktype.setBounds(120, 170, 200, 30);
        worktype.setForeground(Color.WHITE);
        image.add(worktype);
        
        String valcategory[] = {"Salaried","Self-Employed","Business","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,170,300,30);
        category.setBackground(Color.white);
        image.add(category);
        
        
        JLabel yrincome = new JLabel("Yearly Income:");
        yrincome.setFont(new Font("Raleway",Font.BOLD,20));
        yrincome.setBounds(120, 220, 200, 30);
        yrincome.setForeground(Color.WHITE);
        image.add(yrincome);
        
        String incomeCategory[] = {"< 1,50,000","< 4,50,000","< 8,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,220,300,30);
        income.setBackground(Color.white);
        image.add(income);
        
        JLabel educ = new JLabel("Educational:");
        educ.setFont(new Font("Raleway",Font.BOLD,20));
        educ.setBounds(120, 270, 200, 30);
        educ.setForeground(Color.WHITE);
        image.add(educ);
        
        String eduCategory[] = {"Undergraduate","Graduate","Postgraduate"};
        education = new JComboBox(eduCategory);
        education.setBounds(300,270,300,30);
        education.setBackground(Color.white);
        image.add(education);
        
        JLabel qualifi = new JLabel("Qualification:");
        qualifi.setFont(new Font("Raleway",Font.BOLD,20));
        qualifi.setBounds(120, 320, 200, 30);
        qualifi.setForeground(Color.WHITE);
        image.add(qualifi);
        
        emailfield = new JTextField();
        emailfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailfield.setBounds(300,320,300,30);
        image.add(emailfield);
        
        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway",Font.BOLD,20));
        occu.setBounds(120, 370, 200, 30);
        occu.setForeground(Color.WHITE);
        image.add(occu);
        
        occufield = new JTextField();
        occufield.setFont(new Font("Raleway",Font.BOLD,14));
        occufield.setBounds(300,370,300,30);
        add(occufield);
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(120, 420, 200, 30);
        pan.setForeground(Color.WHITE);
        image.add(pan);
        
        addfield = new JTextField();
        addfield.setFont(new Font("Raleway",Font.BOLD,14));
        addfield.setBounds(300,420,300,30);
        add(addfield);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(120, 470, 200, 30);
        aadhar.setForeground(Color.WHITE);
        image.add(aadhar);
        
        stfield = new JTextField();
        stfield.setFont(new Font("Raleway",Font.BOLD,14));
        stfield.setBounds(300,470,300,30);
        add(stfield);
        
        JLabel mobile = new JLabel("Mobile Number:");
        mobile.setFont(new Font("Raleway",Font.BOLD,20));
        mobile.setBounds(120, 520, 200, 30);
        mobile.setForeground(Color.WHITE);
        image.add(mobile);
        
        ctfield = new JTextField();
        ctfield.setFont(new Font("Raleway",Font.BOLD,14));
        ctfield.setBounds(300,520,300,30);
        add(ctfield);
        
        JLabel existacc = new JLabel("Existing Account:");
        existacc.setFont(new Font("Raleway",Font.BOLD,20));
        existacc.setBounds(120, 570, 200, 30);
        existacc.setForeground(Color.WHITE);
        image.add(existacc);
        
        pnfield = new JTextField();
        pnfield.setFont(new Font("Raleway",Font.BOLD,14));
        pnfield.setBounds(300,570,300,30);
        add(pnfield);
        
        next = new JButton("NEXT");
        next.setBackground(Color.blue);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(530,610,100,30);
        next.addActionListener(this);
        image.add(next);
        
        
        
        
       
        setSize(750,723);
        setLocation(250,3);
        setVisible(true); 
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String acname = (String) religion.getSelectedItem();
        String worktype = (String) category.getSelectedItem();
        String yrincome = (String) income.getSelectedItem();
        String educ = (String) education.getSelectedItem();
        
        
        String qualifi = emailfield.getText();
        String occu = occufield.getText();
        String pan = addfield.getText();
        String aadhar = stfield.getText();
        String mobile = ctfield.getText();
        String existacc = pnfield.getText();
        
        
        
        
        try{
            Conn c = new Conn();
            String query = "Insert into signupApp values('"+formno+"', '"+acname+"', '"+worktype+"', '"+yrincome+"', '"+educ+"', '"+qualifi+"', '"+occu+"', '"+pan+"', '"+aadhar+"', '"+mobile+"', '"+existacc+"'  )";
            c.s.executeUpdate(query);
            
            // signup 3 object
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
        }
        catch(Exception e){     // for database error
            System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args){
        new SignupTwo("");
    }

    
}
