
package insertReadUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class read {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/firstdb";
        String username="root";
        String password="";
        String query="select* from student";
        
        
         try{
           Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
          try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            
            int count=0;
            while(rs.next()){
                 String first=rs.getString("first");
                 String last=rs.getString("last");
                 String age=rs.getString("age");
//                int age=rs.getInt("age");
                count++;
                System.out.println("No="+count+"\t First Name is="+first+"\t Last Name is="+last+"\t Age is="+age);
            }
          }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
