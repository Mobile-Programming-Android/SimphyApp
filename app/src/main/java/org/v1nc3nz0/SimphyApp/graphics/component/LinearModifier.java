package org.v1nc3nz0.SimphyApp.graphics.component;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LinearModifier
{

    /*
        Cambia l'attributo gravity
        di un linear layout
     */
    public static LinearLayout setGravity(LinearLayout layout, int gravity)
    {
        layout.setGravity(gravity);
        return layout;
    }

    /*
        Cambia l'orientazione di un layout
     */
    public static LinearLayout setOrientation(LinearLayout layout, int orientation)
    {
        layout.setOrientation(orientation);
        return layout;
    }

    /*
        Cambia i parametri di layout
        di un linear layout
     */
    public static LinearLayout setParams(LinearLayout layout, int width, int height)
    {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width,height);
        layout.setLayoutParams(params);
        return layout;
    }

}
