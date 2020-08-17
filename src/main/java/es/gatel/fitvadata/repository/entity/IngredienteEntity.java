package es.gatel.fitvadata.repository.entity;

import lombok.Data;

import java.util.Collection;

@Data
public class IngredienteEntity extends AbstractEntity {

    private CantidadEntity cantidad;

    private ProductoEntity producto;
}
