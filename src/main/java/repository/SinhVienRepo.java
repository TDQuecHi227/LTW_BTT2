package repository;

import config.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SinhVienRepo {
    private final ConnectionMySQL connMySQL = new ConnectionMySQL();

    public void getSinhVien() throws SQLException {
        PreparedStatement stmt1;
        try (Connection conn = connMySQL.getConnection()) {
//        String query = "insert into sinhvien values(?, ?, ?)";
//        PreparedStatement stmt = conn.prepareStatement(query);
//        stmt.setInt(1, 1);
//        stmt.setString(2, "be");
//        stmt.setString(3, "be");
//        stmt.execute();
            String query1 = "select * from sinhvien";
            stmt1 = conn.prepareStatement(query1);
        }
        ResultSet rs1 = stmt1.executeQuery();
        while (rs1.next()) {
            System.out.println(rs1.getInt("idSinhVien") + rs1.getString("username") + rs1.getString("email"));
        }
    }
}
