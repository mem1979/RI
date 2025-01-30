package com.tprps.ri.Enums;




public enum Area {
	     
		 	DIRECCION,
	        ADMINISTRACION,
	        REHABILITACION,
	        PRODUCCION;
	
	
public enum Sector {
			Direcion(Area.DIRECCION),
			Informatica(Area.DIRECCION),
			Estudios_Proyectos(Area.DIRECCION),
			Compras_Cantrataciones(Area.ADMINISTRACION),
			Recursos_Humanos (Area.ADMINISTRACION),
			Facturaciones(Area.ADMINISTRACION),
			SubDireccion_Administracion(Area.ADMINISTRACION),
			SubDireccion_Produccion(Area.PRODUCCION),
			TP_N1_COSTURERO(Area.PRODUCCION),
			TP_N2_METALURGIA(Area.PRODUCCION),
			TP_N3_HERRERIA(Area.PRODUCCION),
			TP_N4_LABORATORIO(Area.PRODUCCION),
			TP_N5_CARPINTERIA(Area.PRODUCCION),
			TP_N6_IMPRENTA(Area.PRODUCCION),
			TP_N17_ADAPTACION(Area.PRODUCCION),
			TP_N18_SERVICIOS_GRAL(Area.PRODUCCION),
			TP_N19_SERVICIOS_GRAL(Area.PRODUCCION),
			SubDireccion_Rehabilitacion(Area.REHABILITACION),
			Psicologia(Area.REHABILITACION),
			Psiquiatria(Area.REHABILITACION),
			Servicios_Sociales(Area.REHABILITACION),
			Terapia_Ocupacional(Area.REHABILITACION)
			;
		
		
	    private Area area;
	    
	    private Sector(Area area) {
	        this.area = area;
	    }
	    
	    public Area getArea() {
	        return area;
	    }
	}

}
