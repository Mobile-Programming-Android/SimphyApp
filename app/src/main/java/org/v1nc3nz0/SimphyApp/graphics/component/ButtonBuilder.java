package org.v1nc3nz0.SimphyApp.graphics.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    /*
        Ottieni il pulsante
     */
    public Button build()
    {
        return button;
    }

    /*
        Imposta l'evento di click sul pulsante
     */
    public void onClick(View.OnClickListener listener)
    {
        button.setOnClickListener(listener);
    }

    /*
        Imposta il background del pulsante
     */
    public ButtonBuilder setBackground(int drawable)
    {
        button.setBackground(MainActivity.getInstance().getDrawable(drawable));
        return this;
    }

    public ButtonBuilder setGravity(int gravity)
    {
        button.setGravity(gravity);
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
    public ButtonBuilder setRelativeMargin(int left, int top, int right, int bottom)
    {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
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
        button.setTextColor(MainActivity.getInstance().getColor(color));
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
        Imposta il cambio di layout al click
        del pulsante
     */
    public ButtonBuilder switchLayout(LayoutConstructor layout,boolean build)
    {
        onClick((event) -> {
            if(build) layout.show();
            else layout.showOnly();
        });
        return this;
    }

}
