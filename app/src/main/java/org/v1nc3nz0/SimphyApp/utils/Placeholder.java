package org.v1nc3nz0.SimphyApp.utils;

public class Placeholder
{

    /*
        Converte il nome enumerato
        nella placeholder
     */
    public static String toPlaceholder(String enum_value)
    {
        return "%"+enum_value+"%";
    }

    /*
        Rimpiazza il valore alla sua
        placeholder
     */
    public static String replacePH(String str,String ph, String value)
    {
        if(str.contains(ph)) str = str.replace(ph,value);
        return str;
    }

}
