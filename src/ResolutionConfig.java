import java.sql.SQLException;

public class ResolutionConfig {
    int width;
    int length;
    public ResolutionConfig(int resolution_id) throws SQLException {
        main.sqldb.getResolution(resolution_id, this);
    }
}
