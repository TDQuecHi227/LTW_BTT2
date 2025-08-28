import config.ConnectionMySQL;
import repository.SinhVienRepo;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        SinhVienRepo repo = new SinhVienRepo();
        repo.getSinhVien();
    }
}
