package org.v1nc3nz0.SimphyApp.logger;

import android.util.Log;

import org.v1nc3nz0.SimphyApp.MainActivity;
import org.v1nc3nz0.SimphyApp.R;

public class Logger
{

    private String debug_prefix;
    private String normal_msg_prefix;
    private String warn_msg_prefix;
    private String error_msg_prefix;

    public Logger()
    {
        debug_prefix = MainActivity.getInstance().getString(R.string.debug_prefix);
        normal_msg_prefix = MainActivity.getInstance().getString(R.string.normal_msg_prefix);
        warn_msg_prefix = MainActivity.getInstance().getString(R.string.warn_msg_prefix);
        error_msg_prefix = MainActivity.getInstance().getString(R.string.error_msg_prefix);
    }

    /*
        Invia un messagio nei log
     */
    public void send(String string)
    {
        Log.d(debug_prefix,normal_msg_prefix + " " + string);
    }

    /*
        Invia un messaggio di log
        Fase: Composizione
     */
    public void sendCompMsg(String string)
    {
        send(MainActivity.getInstance().getString(R.string.comp_phase_prefix) + " " + string);
    }

    /*
        Invia un messaggio di errore nei log
     */
    public void sendError(String string)
    {
        Log.e(debug_prefix,error_msg_prefix + " " + string);
    }

    /*
        Invia un messaggio di log
        Fase: Esecuzione
     */
    public void sendExecMsg(String string)
    {
        send(MainActivity.getInstance().getString(R.string.exec_phase_prefix) + " " + string);
    }

    /*
        Invia un messaggio di log
        Fase: Inizializzazione
     */
    public void sendInitMsg(String string)
    {
        send(MainActivity.getInstance().getString(R.string.init_phase_prefix) + " " + string);
    }

    /*
        Invia un messaggio di warn nei log
     */
    public void sendWarn(String string)
    {
        Log.w(debug_prefix,warn_msg_prefix + " " + string);
    }

}
