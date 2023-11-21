package org.v1nc3nz0.SimphyApp.graphics.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;

public class ButtonBuilder
{
    private Button button;

    public ButtonBuilder(Button button)  { this.button = button; }
    public ButtonBuilder(Context context)
    {
        button = new Button(context);
    }

    /*
        Ottieni il pulsante
     */
    public Button build()
    {
        return button;
    }

    /*
        Imposta il cambio di layout al click
        del pulsante
     */
    public ButtonBuilder switchLayout(int layout_identifier)
    {
        onClick((event) -> MainActivity.getInstance().setContentView(layout_identifier));
        return this;
    }

    /*
        Imposta l'evento di click sul pulsante
     */
    public ButtonBuilder onClick(View.OnClickListener listener)
    {
        button.setOnClickListener(listener);
        return this;
    }

    /*
        Imposta l'altezza del pulsante
     */
    public ButtonBuilder setHeight(int pixels)
    {
        button.setHeight(pixels);
        return this;
    }

    /*
        Imposta i margini del pulsante
        da mettere in un layout lineare
     */
    public ButtonBuilder setLinearMargin(int left, int top, int right, int bottom)
    {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(left,top,right,bottom);
        button.setLayoutParams(params);
        return this;
    }

    /*
        Imposta il testo
     */
    public ButtonBuilder setText(String text)
    {
        button.setText(text);
        return this;
    }

    /*
        Imposta il colore del testo
     */
    public ButtonBuilder setTextColor(int color)
    {
        button.setBackgroundColor(color);
        return this;
    }

    /*
        Imposta la dimensione del testo
     */
    public ButtonBuilder setTextSize(int pixels)
    {
        button.setTextSize(pixels);
        return this;
    }

    /*
        Imposta la larghezza del pulsante
     */
    public ButtonBuilder setWidth(int pixels)
    {
        button.setWidth(pixels);
        return this;
    }

}
