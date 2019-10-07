package pe.isil.dao;

import pe.isil.model.Team;
import pe.isil.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO {
    public static Team create(Team team){
        try (Connection connection = DatabaseUtil.getConnection()){
            String sql = "INSERT INTO EQUIPO(IdEquipo, NomEquipo, PaisEquipo) values (?, ?, ?) ";
            try (PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1, team.getIdEquipo());
                statement.setString(2, team.getNomEquipo());
                statement.setString(3, team.getPaisEquipo());

                int id = statement.executeUpdate();
                team.setIdEquipo(id);
                return team;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Team> findAllTeams(){
        List<Team> teams = new ArrayList<Team>();
        try (Connection connection = DatabaseUtil.getConnection()){
            String sql = "SELECT * FROM EQUIPO";
            try (Statement statement = connection.createStatement()){
                try (ResultSet resultSet = statement.executeQuery(sql)){
                    while (resultSet.next()){
                        Team team = getTeam(resultSet);
                        teams.add(team);
                    }
                }
            }
        } catch (Exception exception){
            throw new RuntimeException(exception);
        }
        return teams;
    }

    private static Team getTeam(ResultSet resultSet) throws SQLException {
        Team team = new Team(
                resultSet.getInt("IdEquipo"),
                resultSet.getString("NomEquipo"),
                resultSet.getString("PaisEquipo")
        );
        return team;
    }
    public static Team findById (Integer id) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            String sql = "SELECT * FROM EQUIPO WHERE IdEquipo=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        Team team = getTeam(resultSet);
                        return team;
                    } else {
                        System.err.println("No se ha encontrado registros");
                        return null;
                    }
                }
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
