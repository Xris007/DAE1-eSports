package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DetalleEquipo {
    private Integer IdEquipo;
    private Integer IdTorneo;
    private Integer Victorias;
    private Integer Derrotas;
    private Integer Puesto;
}
