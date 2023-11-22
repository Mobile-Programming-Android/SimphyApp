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
import org.v1nc3nz0.SimphyApp.graphics.component.TextBuilder;
import org.v1nc3nz0.SimphyApp.utils.Converter;
import org.v1nc3nz0.SimphyApp.utils.Placeholder;

public class WelcomeLayout extends LayoutConstructor {
    private LinearLayout linear;
    private final String layout_name;
    private final int welcome_layout_id;
    private final int welcome_linear_id;

    public WelcomeLayout() {
        welcome_layout_id = R.layout.no_scroll_template;
        welcome_linear_id = R.id.no_scroll_linear;
        layout_name = "Welcome";
        MainActivity.debug().sendInitMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_inizialized),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }

    @Override
    public void changeSettings() {
        linear = MainActivity.getInstance().findViewById(getLinearId());
        LinearModifier.setRelativeParams(linear, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearModifier.setGravity(linear, Gravity.CENTER);
        LinearModifier.setOrientation(linear, LinearLayout.VERTICAL);
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
        return welcome_layout_id;
    }

    @Override
    public String getLayoutName() {
        return layout_name;
    }

    @Override
    public int getLinearId() {
        return welcome_linear_id;
    }

    @Override
    public void initComponents() {
        if (linear == null) {
            //message
            return;
        }
        Context context = linear.getContext();
        TextBuilder textbuilder = new TextBuilder(context)
                .setWidth(Converter.dpToPixels(512, context))
                .setHeight(Converter.dpToPixels(128, context))
                .setLinearMargin(0, 0, 0, Converter.dpToPixels(24, context))
                .setGravity(Gravity.CENTER)
                .setText(MainActivity.getInstance().getResources().getString(R.string.app_name))
                .setTextColor(R.color.white)
                .setTextSize(Converter.dpToPixels(36, context))
                .setTextBold();

        ButtonBuilder buttonbuilder = new ButtonBuilder(context)
                .setWidth(Converter.dpToPixels(128, context))
                .setHeight(Converter.dpToPixels(64, context))
                .setRelativeMargin(0, Converter.dpToPixels(24, context), 0, 0)
                .setBackground(R.drawable.gradient_app_buttons)
                .setGravity(Gravity.CENTER)
                .setText(MainActivity.getInstance().getString(R.string.welcome_button_text))
                .setTextColor(R.color.black)
                .switchLayout(MainActivity.getInstance().getHomeLayout(), true); //build: true

        linear.removeAllViewsInLayout();
        LinearModifier.addComponent(linear, textbuilder.build());
        LinearModifier.addComponent(linear, buttonbuilder.build());

        MainActivity.debug().sendCompMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_component_initialized),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }
}
