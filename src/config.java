import java.sql.SQLException;

public class config {
    public FontConfig font;
    public ResolutionConfig resolution;
    public config(int font_id, int resolution_id) throws SQLException {
        this.font = new FontConfig(font_id);
        this.resolution = new ResolutionConfig(resolution_id);
    }
}
