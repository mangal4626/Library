   

import java.sql.*;
   import java.util.*;
   public class ExhibitionDAO {
   public Exhibition getExhibition(String name) throws ClassNotFoundException, SQLException {
   Exhibition exhibition= null;
   List<Stall> stallList = new ArrayList<Stall>();
   PreparedStatement stmt2 = DBConnection.getConnection().prepareStatement("SELECT * FROM exhibition WHERE name = ?");
    stmt2.setString(1, name);
   ResultSet rs2 = stmt2.executeQuery();
   while (rs2.next()) {
   Long id = rs2.getLong(1);
   String x_name = rs2.getString(2);
   PreparedStatement stmt = DBConnection.getConnection().prepareStatement("SELECT * FROM stall WHERE exhibition_id = ?");
   stmt.setLong(1, id);
   ResultSet rs = stmt.executeQuery();
   while (rs.next()) {
   stallList.add(new Stall(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), new Exhibition(id, x_name)));
   exhibition = new Exhibition(id, x_name, stallList);
   }
   }
  return exhibition;
  }
  }