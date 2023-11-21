package org.v1nc3nz0.SimphyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import org.v1nc3nz0.SimphyApp.graphics.component.ButtonBuilder;
import org.v1nc3nz0.SimphyApp.graphics.layout.HomeLayout;
import org.v1nc3nz0.SimphyApp.graphics.layout.LayoutConstructor;
import org.v1nc3nz0.SimphyApp.managers.FileManager;

public class MainActivity extends AppCompatActivity implements LayoutConstructor {

    /*
        Layouts
     */
    private HomeLayout homeLayout;

    /*
        Variables
     */
    private static MainActivity instance;
    private FileManager file_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.show();

        MainActivity.instance = this;
        file_manager = new FileManager();

        this.initialize();
        homeLayout = new HomeLayout();
    }

    public FileManager getFileManager() { return file_manager; }

    public static MainActivity getInstance() { return MainActivity.instance; }


    @Override
    public void changeSettings() { return; }

    @Override
    public void initialize()
    {
        ButtonBuilder builder = new ButtonBuilder(findViewById(R.id.welcome_button));
        builder.onClick((listener) -> {
           show();
           changeSettings();
           initialize();
        });
    }

    @Override
    public void show()
    {
        setContentView(R.layout.welcome_layout);
    }
}