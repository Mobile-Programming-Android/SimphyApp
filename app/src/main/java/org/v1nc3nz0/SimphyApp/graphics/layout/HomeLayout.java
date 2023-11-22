package org.v1nc3nz0.SimphyApp.graphics.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;
import org.v1nc3nz0.SimphyApp.enums.DebugPlaceholders;
import org.v1nc3nz0.SimphyApp.graphics.component.ButtonBuilder;
import org.v1nc3nz0.SimphyApp.graphics.component.LinearModifier;
import org.v1nc3nz0.SimphyApp.utils.Converter;
import org.v1nc3nz0.SimphyApp.utils.Placeholder;

public class HomeLayout extends LayoutConstructor
{

    private final String[] button_text;
    private LinearLayout linear;
    private final String layout_name;
    private final int home_layout_id;
    private final int home_linear_id;

    public HomeLayout()
    {
        home_layout_id = R.layout.vertical_scroll_template;
        home_linear_id = R.id.vertical_linear;
        layout_name = "Home";
        button_text = new String[]{"Nozioni Teoriche","Esercizi","Brani Musicali","Mettimi alla prova","Impostazioni","Tutorial App","Riconoscimenti"};
        MainActivity.debug().sendInitMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_inizialized),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }

    @Override
    public void changeSettings()
    {
        linear = MainActivity.getInstance().findViewById(getLinearId());
        LinearModifier.setFrameParams(linear,ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearModifier.setGravity(linear, Gravity.CENTER);
        LinearModifier.setOrientation(linear,LinearLayout.VERTICAL);
        MainActivity.debug().sendCompMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_settings_changed),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }

    @Override
    public int getLayoutId() {
        return home_layout_id;
    }

    @Override
    public String getLayoutName() { return layout_name; }

    @Override
    public int getLinearId() { return home_linear_id; }

    @Override
    public void initComponents()
    {
        Context context = linear.getContext();
        ButtonBuilder builder;

        linear.removeAllViewsInLayout();
        for (String str : button_text) {
            builder = new ButtonBuilder(context)
                    .setWidth(Converter.dpToPixels(512, context))
                    .setHeight(Converter.dpToPixels(88, context))
                    .setRelativeMargin(0, 10, 0, 10)
                    .setBackground(R.drawable.gradient_app_buttons)
                    .setText(str)
                    .setTextColor(R.color.black);

            LinearModifier.addComponent(linear, builder.build());
        }

        MainActivity.debug().sendCompMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_component_initialized),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }

}
