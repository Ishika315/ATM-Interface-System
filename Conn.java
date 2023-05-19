package bank.management.system;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        // mysql is external entity so, there may be runtime errors
        // so we use try catch block here
        try{
            // register     
            /*
            Class.forName(com.mysql.cj.jdbc.Driver);
            for register this is the line but now we add a connector-jar library
            so we donot need to write this line.
            */
            //create connection
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Ishika@12345");  
            // create statement
            s = c.createStatement();
        
        
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args){
        
    }
}


// make jdbc connection with database
/*
Steps for connection of jdbc
1. Register the driver
2. create connection
3. create statement
4. Execute query
5. Close connection

*/


