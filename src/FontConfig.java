import java.sql.SQLException;

public class FontConfig {
    String name;
    int style;
    int size;
    public FontConfig(int font_id) throws SQLException {
        main.sqldb.getFont(font_id, this);
    }
}
