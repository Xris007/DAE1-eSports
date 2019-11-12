
package pe.isil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "torneo")
public class Tournament {

    @Id
    @Column(name = "idtorneo")
    private Integer IdTorneo;

    @Column(name = "nomtorneo")
    private String NomTorneo;

    @Column(name = "orgtorneo")
    private String OrgTorneo;

    @Column(name = "paistorneo")
    private String PaisTorneo;

    @Column(name = "lugartorneo")
    private String LugarTorneo;

    @Column(name = "fechainiciotorneo")
    private LocalDate FechaInicioTorneo;

    @Column(name = "fechafintorneo")
    private LocalDate FechaFinTorneo;

    @Column(name = "idjuego")
    private Integer IdJuego;



    public Tournament() {
    }

    public Tournament(Integer idTorneo, String nomTorneo, String orgTorneo, String paisTorneo, String lugarTorneo, LocalDate fechaInicioTorneo, LocalDate fechaFinTorneo, Integer idJuego) {
        IdTorneo = idTorneo;
        NomTorneo = nomTorneo;
        OrgTorneo = orgTorneo;
        PaisTorneo = paisTorneo;
        LugarTorneo = lugarTorneo;
        FechaInicioTorneo = fechaInicioTorneo;
        FechaFinTorneo = fechaFinTorneo;
        IdJuego = idJuego;
    }

    public Integer getIdTorneo() {
        return IdTorneo;
    }

    public void setIdTorneo(Integer idTorneo) {
        IdTorneo = idTorneo;
    }

    public String getNomTorneo() {
        return NomTorneo;
    }

    public void setNomTorneo(String nomTorneo) {
        NomTorneo = nomTorneo;
    }

    public String getOrgTorneo() {
        return OrgTorneo;
    }

    public void setOrgTorneo(String orgTorneo) {
        OrgTorneo = orgTorneo;
    }

    public String getPaisTorneo() {
        return PaisTorneo;
    }

    public void setPaisTorneo(String paisTorneo) {
        PaisTorneo = paisTorneo;
    }

    public String getLugarTorneo() {
        return LugarTorneo;
    }

    public void setLugarTorneo(String lugarTorneo) {
        LugarTorneo = lugarTorneo;
    }

    public LocalDate getFechaInicioTorneo() {
        return FechaInicioTorneo;
    }

    public void setFechaInicioTorneo(LocalDate fechaInicioTorneo) {
        FechaInicioTorneo = fechaInicioTorneo;
    }

    public LocalDate getFechaFinTorneo() {
        return FechaFinTorneo;
    }

    public void setFechaFinTorneo(LocalDate fechaFinTorneo) {
        FechaFinTorneo = fechaFinTorneo;
    }

    public Integer getIdJuego() {
        return IdJuego;
    }

    public void setIdJuego(Integer idJuego) {
        IdJuego = idJuego;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "IdTorneo=" + IdTorneo +
                ", NomTorneo='" + NomTorneo + '\'' +
                ", OrgTorneo='" + OrgTorneo + '\'' +
                ", PaisTorneo='" + PaisTorneo + '\'' +
                ", LugarTorneo='" + LugarTorneo + '\'' +
                ", FechaInicioTorneo=" + FechaInicioTorneo +
                ", FechaFinTorneo=" + FechaFinTorneo +
                ", IdJuego=" + IdJuego +
                '}';
    }
}