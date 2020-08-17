package es.gatel.fitvadata.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Data
public class ProductoEntity extends AbstractEntity{

    private String nombre;

    private PreparadoEntity preparado;
    private PasoEntity preparacion;

    private InformacionNutricionalEntity informacionNutricional;


}
