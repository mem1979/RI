package com.tprps.ri.Enums;

import org.openxava.model.*;

public enum Prioridad  implements IIconEnum { 

    BAJA("transfer-down"), 
    MEDIA("square-medium"), 
    ALTA("transfer-up");

    private String icon;

    private Prioridad(String icon) {
        this.icon = icon;
    }

    @Override
    public String getIcon() {
        return icon;
    } 
}