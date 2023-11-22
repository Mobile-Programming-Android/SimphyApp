package org.v1nc3nz0.SimphyApp.enums;

import org.v1nc3nz0.SimphyApp.utils.Placeholder;

public enum AppPlaceholders
{
    APP_NAME;

    @Override
    public String toString(){ return Placeholder.toPlaceholder(name().toLowerCase()); }

}
