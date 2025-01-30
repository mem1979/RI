package com.tprps.ri.modelo;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import com.tprps.ri.Acciones.*;
import com.tprps.ri.Enums.*;

import lombok.*;

@View(members = "area, sector, responsable, prioridad; equiposInformaticos; calcularEquiposPorSector")
@Tab(
    rowStyles = @RowStyle(style = "row-highlight", property = "prioridad", value = "ALTA"),
    properties = "area, sector, responsable, prioridad, equiposPorSector"
)
@Entity
@Getter @Setter
public class Sectores extends Identifiable {

    // Nombre del sector
	//@Editor("EditableValidValues")
	//@OnChange(OnChangeSectorAction.class)
	private String sector;

    // Responsable del sector
    @Column(length = 30)
    @NotBlank(message = "El responsable del sector es obligatorio")
    private String responsable;

    // Prioridad del sector
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    @NotNull(message = "La prioridad es obligatoria")
    private Prioridad prioridad;

    // Área del sector
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    @NotNull(message = "El área es obligatoria")
    @OnChange(OnChangeSectorAction.class) // Controlador que actualiza el combo dinámico
    private Area area;

    // Equipos informáticos asociados al sector
    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ListProperties("usuarios, marca, modelo, numeroSerie, tipo, estado")
    private Collection<EquiposInformaticos> equiposInformaticos;
    
    

    // Número de equipos en el sector
    private int equiposPorSector;

    // Método para calcular el número de equipos por sector
    @Depends("equiposInformaticos")
    public int getCalcularEquiposPorSector() {
        if (equiposInformaticos.isEmpty()) {
           return 0;
        }else {
	        return equiposInformaticos.size();
        }
    }

    // Método de ciclo de vida de JPA que actualiza el número de equipos por sector antes de persistir o actualizar la entidad
    @PrePersist
    @PreUpdate
    public void actualizarEquiposPorSector() {
        this.equiposPorSector = equiposInformaticos.size();
    }
}


	    
	
	