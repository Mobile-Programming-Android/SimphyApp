package org.v1nc3nz0.SimphyApp.managers;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.v1nc3nz0.SimphyApp.R;

public class ComponentManager
{

    public void setSwitchLayout(Button button, int layout_identifier, AppCompatActivity activity)
    {
        button.setOnClickListener((listener) -> activity.setContentView(layout_identifier));
    }

}
