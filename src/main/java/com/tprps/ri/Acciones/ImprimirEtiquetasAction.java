package com.tprps.ri.Acciones;

import java.util.*;

import org.openxava.actions.*;
import org.openxava.jpa.*;

import com.tprps.ri.modelo.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;

/**
 * Acci�n para generar un informe de etiquetas usando JasperReports.
 */

public class ImprimirEtiquetasAction extends JasperReportBaseAction {

	@Override
    public Map<String, Object> getParameters() throws Exception {
        // Si decides usar un filtro, puedes agregar la validaci�n aqu�.
        // Por ahora, lo dejamos vac�o.
        Map<String, Object> parametros = new HashMap<>();
        return parametros;
    }

    @Override
    protected JRDataSource getDataSource() throws Exception {
        // Obtener la lista de equipos inform�ticos desde la base de datos
        List<EquiposInformaticos> equipos = XPersistence.getManager()
            .createQuery("from EquiposInformaticos", EquiposInformaticos.class)
            .getResultList();

        // Crear y devolver el JRBeanCollectionDataSource con la lista de equipos
        return new JRBeanCollectionDataSource(equipos);
    }

    @Override
    protected String getJRXML() {
        // Devolver la ruta del archivo JRXML
        return "reports/etiquetas.jrxml"; // Aseg�rate de que este archivo est� en src/main/resources/reports
    }
}