package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.net.LinkAddress;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;
import org.v1nc3nz0.SimphyApp.graphics.component.LinearModifier;
import org.v1nc3nz0.SimphyApp.graphics.component.TextBuilder;

public class WelcomeLayout implements LayoutConstructor
{
    private LinearLayout linear;
    private int welcome_id;

    public WelcomeLayout()
    {
        welcome_id = R.layout.no_scroll_template;
        linear = MainActivity.getInstance().findViewById(getLayoutId());
    }

    @Override
    public void changeSettings()
    {
        linear = LinearModifier.setParams(linear,LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linear = LinearModifier.setGravity(linear,Gravity.CENTER);
        linear = LinearModifier.setGravity(linear,LinearLayout.VERTICAL);
    }

    @Override
    public int getLayoutId()
    {
        return welcome_id;
    }

    @Override
    public void initialize()
    {
        TextBuilder builder = new TextBuilder(linear.getContext());
        builder.set
    }


    @Override
    public void show()
    {
        changeSettings();
        initialize();
        showOnly();
    }

    @Override
    public void showOnly()
    {
        MainActivity.getInstance().setContentView(getLayoutId());
    }
}
