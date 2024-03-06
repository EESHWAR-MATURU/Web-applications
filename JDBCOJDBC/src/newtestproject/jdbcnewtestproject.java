package newtestproject;

import java.sql.*;

public class jdbcnewtestproject {

    public static void main(String args[]) {

        try {
            // Step 1: Load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eeshwar",
                    "Eeshwar123");

            // Step 3: Create the statement object
            Statement stmt = con.createStatement();

            // Step 4: Execute query
            System.out.println("Before Operations");
            ResultSet bs = stmt.executeQuery("select * from studentgrouping");
            while (bs.next())
                System.out.println(bs.getInt(1) + " " + bs.getString(2) + " " + bs.getInt(3));

            // Update Operation
            String updateQuery = "UPDATE studentgrouping SET name = 'shreya' WHERE id = 0569";
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            System.out.println("Rows updated: " + rowsUpdated);

            // Delete Operation
            String deleteQuery = "DELETE FROM studentgrouping WHERE id = 718";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println("Rows deleted: " + rowsDeleted);

            // Insert Operation
            String insertQuery = "INSERT INTO studentgrouping VALUES (1156, 'Vibhakar', 20)";
            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println("Rows inserted: " + rowsInserted);
            
            System.out.println("After Operations");
            ResultSet rs = stmt.executeQuery("select * from studentgrouping");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            // Step 5: Close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
