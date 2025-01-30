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
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores v�lidos
            getView().addValidValue("sector", "Direccion", "Direcci�n");
            getView().addValidValue("sector", "Informatica", "Inform�tica");
            getView().addValidValue("sector", "Estudios_Proyectos", "Estudios y Proyectos");
        } else if (Area.ADMINISTRACION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores v�lidos
            getView().addValidValue("sector", "Compras_Cantrataciones", "Compras y Contrataciones");
            getView().addValidValue("sector", "Recursos_Humanos", "Recursos Humanos");
            getView().addValidValue("sector", "Facturaciones", "Facturaciones");
            getView().addValidValue("sector", "SubDireccion_Administracion", "SubDirecci�n de Administraci�n");
        } else if (Area.PRODUCCION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores v�lidos
            getView().addValidValue("sector", "SubDireccion_Produccion", "SubDirecci�n de Producci�n");
            getView().addValidValue("sector", "TP_N1_COSTURERO", "TP N1 Costurero");
            getView().addValidValue("sector", "TP_N2_METALURGIA", "TP N2 Metalurgia");
            getView().addValidValue("sector", "TP_N3_HERRERIA", "TP N3 Herrer�a");
            getView().addValidValue("sector", "TP_N4_LABORATORIO", "TP N4 Laboratorio");
            getView().addValidValue("sector", "TP_N5_CARPINTERIA", "TP N5 Carpinter�a");
            getView().addValidValue("sector", "TP_N6_IMPRENTA", "TP N6 Imprenta");
            getView().addValidValue("sector", "TP_N17_ADAPTACION", "TP N17 Adaptaci�n");
            getView().addValidValue("sector", "TP_N18_SERVICIOS_GRAL", "TP N18 Servicios Generales");
            getView().addValidValue("sector", "TP_N19_SERVICIOS_GRAL", "TP N19 Servicios Generales");
        } else if (Area.REHABILITACION.equals(selectedArea)) {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores v�lidos
            getView().addValidValue("sector", "SubDireccion_Rehabilitacion", "SubDirecci�n de Rehabilitaci�n");
            getView().addValidValue("sector", "Psicologia", "Psicolog�a");
            getView().addValidValue("sector", "Psiquiatria", "Psiquiatr�a");
            getView().addValidValue("sector", "Servicios_Sociales", "Servicios Sociales");
            getView().addValidValue("sector", "Terapia_Ocupacional", "Terapia Ocupacional");
        } else {
        	getView().clearValidValues("sector");  // Primero, limpiar todos los valores v�lidos
            getView().addValidValue("sector", "SA", "Seleccionar_Area");
        }

        System.out.println("�rea seleccionada: " + selectedArea);
        System.out.println("Sectores disponibles: " + getView().getValidValues("sector"));
    }
}


    /*    getView().clear();
        
       
        
     // Usar un switch-case para agregar los sectores seg�n el �rea seleccionada
        switch (selectedArea) {
            case DIRECCION:
                getView().addValidValue("sector", "Direcion", "Direcci�n");
                getView().addValidValue("sector", "Informatica", "Inform�tica");
                getView().addValidValue("sector", "Estudios_Proyectos", "Estudios y Proyectos");
                break;
            case ADMINISTRACION:
                getView().addValidValue("sector", "Compras_Cantrataciones", "Compras y Contrataciones");
                getView().addValidValue("sector", "Recursos_Humanos", "Recursos Humanos");
                getView().addValidValue("sector", "Facturaciones", "Facturaciones");
                getView().addValidValue("sector", "SubDireccion_Administracion", "SubDirecci�n de Administraci�n");
                break;
            case PRODUCCION:
                getView().addValidValue("sector", "SubDireccion_Produccion", "SubDirecci�n de Producci�n");
                getView().addValidValue("sector", "TP_N1_COSTURERO", "TP N1 Costurero");
                getView().addValidValue("sector", "TP_N2_METALURGIA", "TP N2 Metalurgia");
                getView().addValidValue("sector", "TP_N3_HERRERIA", "TP N3 Herrer�a");
                getView().addValidValue("sector", "TP_N4_LABORATORIO", "TP N4 Laboratorio");
                getView().addValidValue("sector", "TP_N5_CARPINTERIA", "TP N5 Carpinter�a");
                getView().addValidValue("sector", "TP_N6_IMPRENTA", "TP N6 Imprenta");
                getView().addValidValue("sector", "TP_N17_ADAPTACION", "TP N17 Adaptaci�n");
                getView().addValidValue("sector", "TP_N18_SERVICIOS_GRAL", "TP N18 Servicios Generales");
                getView().addValidValue("sector", "TP_N19_SERVICIOS_GRAL", "TP N19 Servicios Generales");
                break;
            case REHABILITACION:
                getView().addValidValue("sector", "SubDireccion_Rehabilitacion", "SubDirecci�n de Rehabilitaci�n");
                getView().addValidValue("sector", "Psicologia", "Psicolog�a");
                getView().addValidValue("sector", "Psiquiatria", "Psiquiatr�a");
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