package org.v1nc3nz0.SimphyApp.graphics.component;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.v1nc3nz0.SimphyApp.MainActivity;

public class TextBuilder
{

    private final TextView text;


    public TextBuilder(TextView text) { this.text = text; }
    public TextBuilder(Context context)
    {
        text = new TextView(context);
    }

    /*
        Ottieni il testo modificato
     */
    public TextView build()
    {
        return text;
    }

    /*
        Imposta la posizione
        del testo
     */
    public TextBuilder setGravity(int gravity)
    {
        text.setGravity(gravity);
        return this;
    }

    /*
        Imposta la dimensione del
        container del testo
        (height)
     */
    public TextBuilder setHeight(int pixels)
    {
        text.setHeight(pixels);
        return this;
    }

    /*
        Imposta i margini del testo
        da mettere in un layout lineare
     */
    public TextBuilder setLinearMargin(int left, int top, int right, int bottom)
    {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(left,top,right,bottom);
        text.setLayoutParams(params);
        return this;
    }

    /*
        Imposta il testo
     */
    public TextBuilder setText(String text)
    {
        this.text.setText(text);
        return this;
    }

    /*
        Imposta il colore del testo
     */
    public TextBuilder setTextColor(int color)
    {
        text.setTextColor(MainActivity.getInstance().getColor(color));
        return this;
    }

    /*
        Imposta la dimensione del testo
     */
    public TextBuilder setTextSize(float size)
    {
        text.setTextSize(size);
        return this;
    }

    /*
        Imposta lo stile del testo
     */
    public TextBuilder setTextBold()
    {
        text.setTypeface(text.getTypeface(), Typeface.BOLD);
        return this;
    }

    /*
        Imposta la dimensione del
        container del testo
        (width)
     */
    public TextBuilder setWidth(int pixels)
    {
        text.setWidth(pixels);
        return this;
    }

}
