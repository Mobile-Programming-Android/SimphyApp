package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;
import org.v1nc3nz0.SimphyApp.graphics.component.ButtonBuilder;
import org.v1nc3nz0.SimphyApp.graphics.component.LinearModifier;
import org.v1nc3nz0.SimphyApp.graphics.component.TextBuilder;
import org.v1nc3nz0.SimphyApp.utils.Converter;

public class WelcomeLayout implements LayoutConstructor
{
    private final LinearLayout linear;
    private final int welcome_id;

    public WelcomeLayout()
    {
        welcome_id = R.id.no_scroll_linear;
        linear = MainActivity.getInstance().findViewById(getLayoutId());
    }

    @Override
    public void changeSettings()
    {
        LinearModifier.setParams(linear,LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearModifier.setGravity(linear,Gravity.CENTER);
        LinearModifier.setOrientation(linear,LinearLayout.VERTICAL);
        MainActivity.debug().sendCompMsg("Impostazioni Linear Layout del Welcome Layout cambiate");
    }

    @Override
    public int getLayoutId()
    {
        return welcome_id;
    }

    @Override
    public void initialize()
    {
        Context context = linear.getContext();
        TextBuilder textbuilder = new TextBuilder(context)
                .setWidth(Converter.dpToPixels(512,context))
                .setHeight(Converter.dpToPixels(128,context))
                .setLinearMargin(0,0,0,Converter.dpToPixels(24,context))
                .setGravity(Gravity.CENTER)
                .setText(MainActivity.getInstance().getResources().getString(R.string.app_name))
                .setTextColor(R.color.white)
                .setTextSize(48)
                .setTextBold();

        ButtonBuilder buttonbuilder = new ButtonBuilder(context)
                .setWidth(200)
                .setHeight(Converter.dpToPixels(80,context))
                .setRelativeMargin(0,Converter.dpToPixels(24,context),0,0)
                .setBackground(R.drawable.gradient_app_buttons)
                .setGravity(Gravity.CENTER)
                .setText(MainActivity.getInstance().getString(R.string.welcome_button_text))
                .setTextColor(R.color.black)
                .switchLayout(MainActivity.getInstance().getHomeLayout(),false); //build: true

        linear.removeAllViewsInLayout();
        linear.addView(textbuilder.build(),0);
        linear.addView(buttonbuilder.build(),1);
        MainActivity.debug().sendCompMsg("Componenti del Welcome Layout inizializzati");
    }


    @Override
    public void show()
    {
        showOnly();
        changeSettings();
        initialize();
    }

    @Override
    public void showOnly()
    {
        if(MainActivity.getInstance().getCurrentFocus().getId() != getLayoutId())
        {
            MainActivity.getInstance().setContentView(getLayoutId());
        }
        MainActivity.debug().sendCompMsg("Mostrato il Welcome Layout");
    }
}
