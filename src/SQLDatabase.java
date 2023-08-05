import java.sql.*;

public class SQLDatabase {
    String connectionUrl;
    Connection conn;

    static SQLDatabase instance = null;

    static public SQLDatabase getInstance() {
        if (instance == null) instance = new SQLDatabase();
        return instance;
    }

    private SQLDatabase(){
        try {
            Class cls = Class.forName("com.mysql.cj.jdbc.Driver");
            this.connectionUrl = "jdbc:mysql://localhost:3306/herogame?serverTimezone=UTC";
            conn = DriverManager.getConnection(connectionUrl, "root", "Diablozaur9387!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("Connection was not created.\n");
        }
    }

    public void getFont(int font_id, FontConfig font_object) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM fonts WHERE id = " + font_id);
        ResultSet rs = ps.executeQuery(); {
            while (rs.next()) {
                font_object.name = rs.getString("name");
                font_object.style = rs.getInt("style");
                font_object.size = rs.getInt("size");
            }
        }
    }

    public void getResolution(int resolution_id, ResolutionConfig res_object) throws SQLException{
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM resolution WHERE id = " + resolution_id);
        ResultSet rs = ps.executeQuery();
        {
            while (rs.next()) {
                res_object.width = rs.getInt("width");
                res_object.length = rs.getInt("length");
            }
        }
    }
}
