package pe.isil;

import pe.isil.dao.DetalleEquipoDAO;
import pe.isil.dao.TeamDAO;
import pe.isil.dao.TournamentDAO;
import pe.isil.model.DetalleEquipo;
import pe.isil.model.Team;
import pe.isil.model.Tournament;
import pe.isil.util.DatabaseUtil;

import java.sql.SQLException;
import java.util.List;

import static pe.isil.dao.TournamentDAO.findAllTournament;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TeamDAO.create(new Team(1180,"Power Rangers","Gringolandia"));
    }
}
