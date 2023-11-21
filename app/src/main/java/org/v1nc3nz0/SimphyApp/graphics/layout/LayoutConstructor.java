package org.v1nc3nz0.SimphyApp.graphics.layout;

public interface LayoutConstructor
{
    /*
        Cambia le impostazioni del layout
     */
    void changeSettings();

    /*
        Ottieni l'id del layout
     */
    int getLayoutId();

    /*
        Inizializza i componenti del layout
     */
    void initialize();

    /*
        Mostra il layout modificandone
        il contenuto
        (chiama i metodi changeSettings()
        e initialize())
     */
    void show();

    /*
        Mostra il layout senza
        modificare il contenuto
        (non chiama i metodi changeSettings()
        e initialize())
     */
    void showOnly();
}
