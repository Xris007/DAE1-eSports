package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Tournament {
    private Integer IdTorneo;
    private String NomTorneo;
    private String OrgTorneo;
    private String PaisTorneo;
    private String LugarTorneo;
    private Date FechaInicioTorneo;
    private Date FechaFinTorneo;
    private Integer IdJuego;
}
