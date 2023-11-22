package org.v1nc3nz0.SimphyApp.graphics.component;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LinearModifier
{

    /**
     * Aggiunge un componente a un linear layout
     *
     * @param layout Layout da modificare
     * @param view Componente da aggiungere
     */
    public static void addComponent(LinearLayout layout, View view)
    {
        LinearModifier.addComponent(layout,view,-1);
    }

    /**
     * Aggiunge un componente a un linear layout
     *
     * @param layout Layout da modificare
     * @param view Componente da aggiungere
     * @param index Posizione componente rispetto agli altri
     */
    public static void addComponent(LinearLayout layout, View view, int index)
    {
        layout.removeView(view);
        if(index < 0) layout.addView(view);
        else layout.addView(view,index);
    }

    /**
     * Cambia l'attributo gravity
     *         di un linear layout
     *
     * @param layout Layout da modificare
     * @param gravity Posizione componenti
     */
    public static void setGravity(LinearLayout layout, int gravity)
    {
        layout.setGravity(gravity);
    }

    /**
     * Cambia l'orientazione di un layout
     *
     * @param layout Layout da modificare
     * @param orientation Orientazione Layout
     */
    public static void setOrientation(LinearLayout layout, int orientation)
    {
        layout.setOrientation(orientation);
    }

    /**
     * Cambia i parametri
     * di un frame layout
     *
     * @param layout Layout da modificare
     * @param width Larghezza
     * @param height Altezza
     */
    public static void setFrameParams(LinearLayout layout,int width,int height)
    {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layout.setLayoutParams(params);
    }

    /**
     * Cambia i parametri
     * di un linear layout
     *
     * @param layout Layout da modificare
     * @param width Larghezza
     * @param height Altezza
     */
    public static void setLinearParams(LinearLayout layout,int width,int height)
    {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layout.setLayoutParams(params);
    }

    /**
     * Cambia i parametri di layout
     * di un linear layout
     * basati su un relative layout
     *
     * @param layout Layout da modificare
     * @param width Larghezza
     * @param height Altezza
     */
    public static void setRelativeParams(LinearLayout layout, int width, int height)
    {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width,height);
        layout.setLayoutParams(params);
    }

}
