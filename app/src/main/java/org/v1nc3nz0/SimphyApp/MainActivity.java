package org.v1nc3nz0.SimphyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import org.v1nc3nz0.SimphyApp.managers.ComponentManager;

public class MainActivity extends AppCompatActivity {

    private ComponentManager component_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        initialize();
    }

    private void createListeners()
    {
        Button button;

        button = (Button) findViewById(R.id.welcome_button);
        getComponentManager().setSwitchLayout(button,R.layout.home_layout,this);
    }

    public ComponentManager getComponentManager()
    {
        return component_manager;
    }

    private void initialize()
    {
        component_manager = new ComponentManager();
        createListeners();
    }

}