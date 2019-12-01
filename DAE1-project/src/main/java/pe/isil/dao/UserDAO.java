package pe.isil.dao;

import pe.isil.model.Usuario;
import pe.isil.model.Usuario;
import pe.isil.util.DatabaseUtil;

import java.sql.*;

public class UserDAO extends DaoContext {

    public static Usuario isValidLogin(String username, String password) {
        try (Connection connection = DatabaseUtil.getConnection()) {

            String sql = "SELECT * FROM usuario WHERE username=? AND password=?";

            try (PreparedStatement ps = connection.prepareStatement(sql)) {

                ps.setString(1, username);
                ps.setString(2, password);

                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {

                        return new Usuario(
                                rs.getInt("userid"),
                                rs.getString("username"),
                                rs.getString("password")
                        );

                    } else {
                        return null;
                    }

                }

            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }


        return null;
    }


}
