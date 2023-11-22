package org.v1nc3nz0.SimphyApp.graphics.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.graphics.layout.LayoutConstructor;

public class ButtonBuilder
{
    private final Button button;

    public ButtonBuilder(Button button)  { this.button = button; }
    public ButtonBuilder(Context context)
    {
        button = new Button(context);
    }

    /**
     * Ottieni il pulsante
     *
     * @return Ritorna il bottone creato
     */
    public Button build()
    {
        return button;
    }

    /**
     * Imposta l'evento di click sul pulsante
     *
     * @param listener Azioni che vengono eseguite al click del pulsante
     */
    public void onClick(View.OnClickListener listener)
    {
        button.setOnClickListener(listener);
    }

    /**
     * Imposta il background del pulsante
     *
     * @param drawable Componente disegnabile
     * @return Ritorna il builder
     */
    public ButtonBuilder setBackground(int drawable)
    {
        button.setBackground(MainActivity.getInstance().getDrawable(drawable));
        return this;
    }

    /**
     * Imposta l'attributo gravity
     * del pulsante
     *
     * @param gravity Posizione componenti nel pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setGravity(int gravity)
    {
        button.setGravity(gravity);
        return this;
    }

    /**
     * Imposta l'altezza del pulsante
     *
     * @param pixels Altezza pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setHeight(int pixels)
    {
        button.setHeight(pixels);
        return this;
    }

    /**
     * Imposta i margini del pulsante
     *         da mettere in un layout frame
     *
     * @param left paddingLeft
     * @param top paddingTop
     * @param right paddingRight
     * @param bottom paddingBottom
     * @return Ritorna il builder
     */
    public ButtonBuilder setFrameMargin(int left, int top, int right, int bottom)
    {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(left,top,right,bottom);
        button.setLayoutParams(params);
        return this;
    }

    /**
     * Imposta i margini del pulsante
     * da mettere in un layout relativo
     *
     * @param left paddingLeft
     * @param top paddingTop
     * @param right paddingRight
     * @param bottom paddingBottom
     * @return Ritorna il builder
     */
    public ButtonBuilder setRelativeMargin(int left, int top, int right, int bottom)
    {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(left,top,right,bottom);
        button.setLayoutParams(params);
        return this;
    }

    /**
     * Imposta il testo
     *
     * @param text Testo pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setText(String text)
    {
        button.setText(text);
        return this;
    }

    /**
     * Imposta il colore del testo
     *
     * @param color Color testo pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setTextColor(int color)
    {
        button.setTextColor(MainActivity.getInstance().getColor(color));
        return this;
    }

    /**
     * Imposta la dimensione del testo
     *
     * @param pixels Dimensione testo pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setTextSize(int pixels)
    {
        button.setTextSize(pixels);
        return this;
    }

    /**
     * Imposta la larghezza del pulsante
     *
     * @param pixels Larghezza pulsante
     * @return Ritorna il builder
     */
    public ButtonBuilder setWidth(int pixels)
    {
        button.setWidth(pixels);
        return this;
    }

    /**
     * Imposta il cambio di layout al click
     * del pulsante
     *
     * @param layout_identifier Id layout
     * @return Ritorna il builder
     */
    public ButtonBuilder switchLayout(int layout_identifier)
    {
        onClick((event) -> MainActivity.getInstance().setContentView(layout_identifier));
        return this;
    }

    /**
     * Imposta il cambio di layout al click
     * del pulsante
     *
     * @param layout Layout
     * @param build Inserisci gli elementi
     * @return Ritorna il builder
     */
    public ButtonBuilder switchLayout(LayoutConstructor layout,boolean build)
    {
        onClick((event) -> {
            layout.show();
            if(build) layout.build();
        });
        return this;
    }

}