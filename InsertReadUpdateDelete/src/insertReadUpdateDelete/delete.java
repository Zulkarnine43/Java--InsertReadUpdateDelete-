
package insertReadUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/firstdb";
        String username="root";
        String password="";
        String query="delete from student where id=5";
        
        
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
            
                System.out.println("Deleted records into the table...");
            }
          catch(SQLException e){
            e.printStackTrace();
        }
    }
}

