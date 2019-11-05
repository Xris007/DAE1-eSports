package pe.isil;

import pe.isil.dao.DetalleEquipoDAO;
import pe.isil.dao.TeamDAO;
import pe.isil.dao.TournamentDAO;
import pe.isil.dao.UserDAO;
import pe.isil.model.DetalleEquipo;
import pe.isil.model.Team;
import pe.isil.model.Tournament;
import pe.isil.service.TornamentService;
import pe.isil.util.DatabaseUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static pe.isil.dao.TournamentDAO.findAllTournament;

public class Main {



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eSportsPU");


        Tournament t1 = new Tournament();
        t1.setIdTorneo(30);
        t1.setNomTorneo("The International 2019");
        t1.setOrgTorneo("Valve");
        t1.setPaisTorneo("China");
        t1.setLugarTorneo("Mercedes-Benz Arena");
        t1.setFechaInicioTorneo(LocalDate.of(2019, 8, 20));
        t1.setFechaFinTorneo(LocalDate.of(2019, 8, 25));
        t1.setIdJuego(5);

        TornamentService tornamentService = new TornamentService(emf);

        tornamentService.create(t1);
        List<Tournament> tournamentList = tornamentService.findAll();
        System.out.println("Tournament List: " + tournamentList);

        TornamentService tornamentService1 = new TornamentService(emf);
        tornamentService1.findById(20);
        System.out.println("Tournament: " + tornamentService1);


        tornamentService.delete(20);






    }
}
