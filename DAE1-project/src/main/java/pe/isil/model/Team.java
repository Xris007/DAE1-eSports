package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Team {
    private Integer IdEquipo;
    private String NomEquipo;
    private String PaisEquipo;
}
