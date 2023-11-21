package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;

public class HomeLayout implements LayoutConstructor
{

    private int home_layout;

    /*
        Cambia la impostazioni
        del linear layout
     */
    public void changeSettings()
    {

    }

    @Override
    public void initialize()
    {
        home_layout = R.layout.vertical_scroll_template;


    }

    @Override
    public void show()
    {
        MainActivity.getInstance().setContentView(home_layout);
    }
}
