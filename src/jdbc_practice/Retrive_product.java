package jdbc_practice;

CREATE TABLE products ( product_id INT PRIMARY KEY, product_name VARCHAR(100), product_price DECIMAL(10, 2)
);

INSERT INTO products (product_id, product_name, product_price) VALUES
(1, 'Product A', 10.99),
(2, 'Product B', 19.99),
(3, 'Product C', 5.99),
(4, 'Product D', 15.49);

Java program to fetch data from the 'products' table:
package task;
import java.sql.*;

public class Retrive_product {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
String dbUrl = "jdbc:mysql://localhost:3306/ecommerce";
//connection string
String username="root"; String password = "root";
String query = "select * from product;"; Connection con = null;

try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection(dbUrl, username,
password); //connecting DB
Statement stmt = con.createStatement(); //Execute the query ResultSet rs = (stmt).executeQuery(query); //Save the
result after executing the query

while (rs.next()) {
System.out.print("product_ID: " + rs.getString("product_ID") + "\t");
System.out.print("product_Name: " +
rs.getString("product_name") + "\t\t" );
System.out.println("product_Price: " + rs.getString("product_Price")+ "\t");
}
}
catch(Exception e) { System.out.println(e.getMessage());
}

finally {
con.close();
}
}
}

public class Retrive_product {

}
