package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;

public class HomeLayout implements LayoutConstructor
{

    private LinearLayout linear;
    private int home_layout;

    public HomeLayout()
    {
        home_layout = R.layout.vertical_scroll_template;
    }

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

    }

    @Override
    public void show()
    {
        MainActivity.getInstance().setContentView(home_layout);
    }
}
