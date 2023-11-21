package org.v1nc3nz0.SimphyApp.utils;

import android.content.Context;

public class Converter
{

    public static int dpToPixels(int dp, Context context)
    {
        return dp*(context.getResources().getDisplayMetrics().densityDpi/160);
    }

}
