package pe.isil.model;

import java.util.Date;


public class Tournament {
    private Integer IdTorneo;
    private String NomTorneo;
    private String OrgTorneo;
    private String PaisTorneo;
    private String LugarTorneo;
    private Date FechaInicioTorneo;
    private Date FechaFinTorneo;
    private Integer IdJuego;

    public Tournament() {
    }

    public Tournament(Integer idTorneo, String nomTorneo, String orgTorneo, String paisTorneo, String lugarTorneo, Date fechaInicioTorneo, Date fechaFinTorneo, Integer idJuego) {
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

    public Date getFechaInicioTorneo() {
        return FechaInicioTorneo;
    }

    public void setFechaInicioTorneo(Date fechaInicioTorneo) {
        FechaInicioTorneo = fechaInicioTorneo;
    }

    public Date getFechaFinTorneo() {
        return FechaFinTorneo;
    }

    public void setFechaFinTorneo(Date fechaFinTorneo) {
        FechaFinTorneo = fechaFinTorneo;
    }

    public Integer getIdJuego() {
        return IdJuego;
    }

    public void setIdJuego(Integer idJuego) {
        IdJuego = idJuego;
    }
}
