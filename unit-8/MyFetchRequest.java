import java.sql.*;

class MyFetchRequest {
  public static void main(String args[]) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java_jdbc", "root", "root");

    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

    ResultSet rs = stmt.executeQuery("SELECT * FROM Persons");

    System.out.println(rs.absolute(1));
    System.out.println(rs.absolute(2));
    System.out.println(rs.absolute(3));
    con.close();
  }
}