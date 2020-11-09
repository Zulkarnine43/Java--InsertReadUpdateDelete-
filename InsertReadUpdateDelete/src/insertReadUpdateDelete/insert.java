package insertReadUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class insert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/firstdb";
        String username="root";
        String password="";
        
           Scanner sc =new Scanner(System.in);

           System.out.println("Enter  firstName");
           String first=sc.next();
           System.out.println("Enter  lastName");
           String last=sc.next();
           System.out.println("Enter  age");
           int age=sc.nextInt();

           String query="insert into student(first,last,age) values('"+first+"','"+last+"','"+age+"')";
           
       try{
           Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
       
       try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            st.executeUpdate(query);
             System.out.println("Inserted records into the table...");
       }  
       catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
