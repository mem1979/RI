package com.tprps.ri.Formateadores;

import javax.servlet.http.*;

import org.apache.commons.text.*;
import org.openxava.formatters.*;

public class CapitalizaFormateador implements IFormatter {

	    @Override
	    public String format(HttpServletRequest request, Object string) {
	        if (string == null) return "";
	        return WordUtils.capitalizeFully(string.toString());
	    }

	    @Override
	    public Object parse(HttpServletRequest request, String string) {
	        return string == null ? "" : WordUtils.capitalizeFully(string);
	    }
	}



