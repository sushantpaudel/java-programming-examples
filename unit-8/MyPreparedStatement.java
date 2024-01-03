import java.sql.*;

class MyPreparedStatement {
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java_jdbc", "root", "root");

      PreparedStatement stmt = con.prepareStatement("INSERT INTRO Persons VALUES(?,?,?,?)");
      stmt.setInt(1, 101);
      stmt.setString(2, "First Name");
      stmt.setString(3, "Last Name");
      stmt.setString(4, "Address");

      int i = stmt.executeUpdate();
      System.out.println(i + " records inserted");

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
