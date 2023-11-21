package org.v1nc3nz0.SimphyApp.graphics.component;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TextBuilder
{

    private TextView text;


    public TextBuilder(TextView text) { this.text = text; }
    public TextBuilder(Context context)
    {
        text = new TextView(context);
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
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
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
        text.setTextColor(color);
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
