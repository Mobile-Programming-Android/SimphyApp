package org.v1nc3nz0.SimphyApp.graphics.layout;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;
import org.v1nc3nz0.SimphyApp.enums.DebugPlaceholders;
import org.v1nc3nz0.SimphyApp.utils.Placeholder;

public abstract class LayoutConstructor
{

    /*
        Inserisci i componenti
        nel layout mostrato
        con la showOnly()
     */
    public void build()
    {
        changeSettings();
        initComponents();
        MainActivity.debug().sendCompMsg(
                Placeholder.replacePH(
                        MainActivity.getInstance().getString(R.string.layout_built),
                        DebugPlaceholders.LAYOUT_NAME.toString(),
                        getLayoutName()
                )
        );
    }

    /*
        Cambia le impostazioni del layout
     */
    abstract void changeSettings();

    /*
        Ottieni l'id del layout
     */
    abstract int getLayoutId();

    /*
        Ottieni il nome del layout
     */
    abstract String getLayoutName();

    /*
        Ottiene l'id del linear
        layout con i componenti
     */
    abstract int getLinearId();

    /*
        Inizializza i componenti del layout
     */
    abstract void initComponents();

    /*
        Mostra il layout
     */
    public void show()
    {
        try
        {
            MainActivity.getInstance().setContentView(getLayoutId());
            MainActivity.debug().sendCompMsg(
                    Placeholder.replacePH(
                            MainActivity.getInstance().getString(R.string.layout_show),
                            DebugPlaceholders.LAYOUT_NAME.toString(),
                            getLayoutName()
                    )
            );
        }
        catch(NullPointerException e1)
        {
            MainActivity.debug().sendError(
                    Placeholder.replacePH(
                            MainActivity.getInstance().getString(R.string.error_layout_null),
                            DebugPlaceholders.LAYOUT_NAME.toString(),
                            getLayoutName()
                    )
            );
        }
        catch(Exception e2)
        {
            MainActivity.debug().sendError(
                    Placeholder.replacePH(
                            MainActivity.getInstance().getString(R.string.error_layout_already_show),
                            DebugPlaceholders.LAYOUT_NAME.toString(),
                            getLayoutName()
                    )
            );
        }
    }
}