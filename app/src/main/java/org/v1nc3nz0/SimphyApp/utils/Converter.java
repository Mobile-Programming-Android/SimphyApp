package org.v1nc3nz0.SimphyApp.utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class Converter
{
    /*
        Converte i dp in pixels
     */
    public static int dpToPixels(int dp, Context context)
    {
        return dp*(context.getResources().getDisplayMetrics().densityDpi/ DisplayMetrics.DENSITY_DEFAULT);
    }
}
