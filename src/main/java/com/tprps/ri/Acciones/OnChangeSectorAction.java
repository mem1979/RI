package com.tprps.ri.Acciones;

import org.openxava.actions.*;

import com.tprps.ri.Enums.*;

public class OnChangeSectorAction extends OnChangePropertyBaseAction {

    @Override
    public void execute() throws Exception {
    	
    	getView().addValidValue("sector", "SA", "Seleccionar_Area");
    	
        Area selectedArea = (Area) getNewValue();
        getView().setValueNotifying("area", selectedArea);

       

        if (Area.DIRECCION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores válidos
            getView().addValidValue("sector", "Direccion", "Dirección");
            getView().addValidValue("sector", "Informatica", "Informática");
            getView().addValidValue("sector", "Estudios_Proyectos", "Estudios y Proyectos");
        } else if (Area.ADMINISTRACION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores válidos
            getView().addValidValue("sector", "Compras_Cantrataciones", "Compras y Contrataciones");
            getView().addValidValue("sector", "Recursos_Humanos", "Recursos Humanos");
            getView().addValidValue("sector", "Facturaciones", "Facturaciones");
            getView().addValidValue("sector", "SubDireccion_Administracion", "SubDirección de Administración");
        } else if (Area.PRODUCCION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores válidos
            getView().addValidValue("sector", "SubDireccion_Produccion", "SubDirección de Producción");
            getView().addValidValue("sector", "TP_N1_COSTURERO", "TP N1 Costurero");
            getView().addValidValue("sector", "TP_N2_METALURGIA", "TP N2 Metalurgia");
            getView().addValidValue("sector", "TP_N3_HERRERIA", "TP N3 Herrería");
            getView().addValidValue("sector", "TP_N4_LABORATORIO", "TP N4 Laboratorio");
            getView().addValidValue("sector", "TP_N5_CARPINTERIA", "TP N5 Carpintería");
            getView().addValidValue("sector", "TP_N6_IMPRENTA", "TP N6 Imprenta");
            getView().addValidValue("sector", "TP_N17_ADAPTACION", "TP N17 Adaptación");
            getView().addValidValue("sector", "TP_N18_SERVICIOS_GRAL", "TP N18 Servicios Generales");
            getView().addValidValue("sector", "TP_N19_SERVICIOS_GRAL", "TP N19 Servicios Generales");
        } else if (Area.REHABILITACION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores válidos
            getView().addValidValue("sector", "SubDireccion_Rehabilitacion", "SubDirección de Rehabilitación");
            getView().addValidValue("sector", "Psicologia", "Psicología");
            getView().addValidValue("sector", "Psiquiatria", "Psiquiatría");
            getView().addValidValue("sector", "Servicios_Sociales", "Servicios Sociales");
            getView().addValidValue("sector", "Terapia_Ocupacional", "Terapia Ocupacional");
        } else {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores válidos
            getView().addValidValue("sector", "SA", "Seleccionar_Area");
        }

        System.out.println("Área seleccionada: " + selectedArea);
        System.out.println("Sectores disponibles: " + getView().getValidValues("sector"));
    }
}


    /*    getView().clear();
        
       
        
     // Usar un switch-case para agregar los sectores según el área seleccionada
        switch (selectedArea) {
            case DIRECCION:
                getView().addValidValue("sector", "Direcion", "Dirección");
                getView().addValidValue("sector", "Informatica", "Informática");
                getView().addValidValue("sector", "Estudios_Proyectos", "Estudios y Proyectos");
                break;
            case ADMINISTRACION:
                getView().addValidValue("sector", "Compras_Cantrataciones", "Compras y Contrataciones");
                getView().addValidValue("sector", "Recursos_Humanos", "Recursos Humanos");
                getView().addValidValue("sector", "Facturaciones", "Facturaciones");
                getView().addValidValue("sector", "SubDireccion_Administracion", "SubDirección de Administración");
                break;
            case PRODUCCION:
                getView().addValidValue("sector", "SubDireccion_Produccion", "SubDirección de Producción");
                getView().addValidValue("sector", "TP_N1_COSTURERO", "TP N1 Costurero");
                getView().addValidValue("sector", "TP_N2_METALURGIA", "TP N2 Metalurgia");
                getView().addValidValue("sector", "TP_N3_HERRERIA", "TP N3 Herrería");
                getView().addValidValue("sector", "TP_N4_LABORATORIO", "TP N4 Laboratorio");
                getView().addValidValue("sector", "TP_N5_CARPINTERIA", "TP N5 Carpintería");
                getView().addValidValue("sector", "TP_N6_IMPRENTA", "TP N6 Imprenta");
                getView().addValidValue("sector", "TP_N17_ADAPTACION", "TP N17 Adaptación");
                getView().addValidValue("sector", "TP_N18_SERVICIOS_GRAL", "TP N18 Servicios Generales");
                getView().addValidValue("sector", "TP_N19_SERVICIOS_GRAL", "TP N19 Servicios Generales");
                break;
            case REHABILITACION:
                getView().addValidValue("sector", "SubDireccion_Rehabilitacion", "SubDirección de Rehabilitación");
                getView().addValidValue("sector", "Psicologia", "Psicología");
                getView().addValidValue("sector", "Psiquiatria", "Psiquiatría");
                getView().addValidValue("sector", "Servicios_Sociales", "Servicios Sociales");
                getView().addValidValue("sector", "Terapia_Ocupacional", "Terapia Ocupacional");
                break;
            default:
            	getView().addValidValue("sector", "SA", "Seleccionar_Area");
                break;
        }
        
      //  getView().setValue("sector", null);  // Limpiar el sector seleccionado
        System.out.println("Area: " + selectedArea + " - Sector: " + getView().getValue("sector"));
    }
}
*/