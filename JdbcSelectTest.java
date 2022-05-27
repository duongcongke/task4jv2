import java.sql.*;
public class JdbcSelectTest{
    public static void main(String[]args){
        try(

                Connection conn=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop",
                             "root","");
                Statement stmt=conn.createStatement();
        ){

            String strSelect="select title,price,qty from books";
            System.out.println("The SQL statement is:"+strSelect+"\n");

            ResultSet reset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount=0;
            while(reset.next()){
                String title=reset.getString("title");
                double price=reset.getDouble("price");
                int qty= reset.getInt("qty");
                System.out.println(title+","+price+ "'"+ rowCount);
            }
            System.out.println("Total number of records="+rowCount);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}