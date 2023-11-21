package org.v1nc3nz0.SimphyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.v1nc3nz0.SimphyApp.graphics.component.ButtonBuilder;
import org.v1nc3nz0.SimphyApp.graphics.layout.HomeLayout;
import org.v1nc3nz0.SimphyApp.graphics.layout.LayoutConstructor;
import org.v1nc3nz0.SimphyApp.graphics.layout.WelcomeLayout;
import org.v1nc3nz0.SimphyApp.managers.FileManager;

public class MainActivity extends AppCompatActivity {

    /*
        Layouts
     */
    private HomeLayout homeLayout;
    private WelcomeLayout welcomeLayout;

    /*
        Variables
     */
    private static MainActivity instance;
    private FileManager file_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_scroll_template);

        MainActivity.instance = this;
        file_manager = new FileManager();

        welcomeLayout = new WelcomeLayout();
        welcomeLayout.show();
        homeLayout = new HomeLayout();
    }

    public FileManager getFileManager() { return file_manager; }

    public static MainActivity getInstance() { return MainActivity.instance; }
}