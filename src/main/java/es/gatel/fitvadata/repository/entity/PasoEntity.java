package es.gatel.fitvadata.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class PasoEntity extends AbstractEntity{


    private Collection<IngredienteEntity> ingredientes;

    private ProcesoEntity proceso;


    private ProductoEntity producto;

}
