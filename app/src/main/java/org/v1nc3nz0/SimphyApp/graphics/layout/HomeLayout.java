package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;

public class HomeLayout implements LayoutConstructor
{

    private LinearLayout linear;
    private final int home_layout;

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
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void initialize()
    {

    }

    @Override
    public void show()
    {

    }

    @Override
    public void showOnly()
    {
        MainActivity.getInstance().setContentView(home_layout);
    }
}
