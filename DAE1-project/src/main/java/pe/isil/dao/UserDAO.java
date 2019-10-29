package pe.isil.dao;

import pe.isil.model.User;
import pe.isil.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends DaoContext {

    public static User isValidLogin(String username, String password) {
        try (Connection connection = DatabaseUtil.getConnection()) {

            String sql = "SELECT * FROM users WHERE login=? AND password=?";

            try (PreparedStatement ps = connection.prepareStatement(sql)) {

                ps.setString(1, username);
                ps.setString(2, password);

                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {

                        return new User(
                                rs.getInt("userid"),
                                rs.getString("login"),
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
