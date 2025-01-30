package com.tprps.ri.Enums;

import org.openxava.model.*;

public enum Estado implements IIconEnum { 
	
	  BUENO("emoticon-happy-outline"), 
	  REGULAR("emoticon-neutral-outline"), 
	  MALO("emoticon-sad-outline"),
	  EN_REPARACION("emoticon-sick-outline"),
	  FUERA_SERVICIO("monitor-off");
	  
	  private String icon;

	    private Estado(String icon) {
	        this.icon = icon;
	    }

	    @Override
	    public String getIcon() {
	        return icon;
	    } 
	}