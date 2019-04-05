package Logica.CamposTexto;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.HashMap;
import java.util.Map;

public class Campo_autoCompleter {

    //Almacenara el objeto del autocompleter relacionado a su campo de tecto
    //relacionado.
    private static final Map autocompleterObjects = new HashMap();

    /**
     * Parametro que recibe un textField y un arrayList para asignarcelo como
     * autoCompletar, busca la palabra desde cualquier parte.
     *
     * @param campoDeTexto
     * @param elementos
     * @param nombreCampo Nombre del campo identificativo con el cual se va a 
     * identificar entro de esta clase, asi inizializar y/o recuperar el objeto
     * ligado a esa referencia.
     */
    public static void setAutoCompleterInfijo(javax.swing.JTextField campoDeTexto, java.util.ArrayList<String> elementos, String nombreCampo) {
        //Primero busco si el campo de texto 'nombreCampo' se encuentra almacenado
        //en el Map, si esta almacenado lo limpio y lo vuelvo a llenar.
        TextAutoCompleter autocompleterObject = (TextAutoCompleter) autocompleterObjects
                .get(nombreCampo);
        if (autocompleterObject != null) {
            autocompleterObject.removeAllItems();
            autocompleterObject.removeItem(campoDeTexto);
            fillElements(elementos, autocompleterObject);
        } else {
            //En caso de que el campo de texto ya no se haya inizializado, se
            // inisializa y se almacena en el map la referencia de su Autocompleter.
            TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(campoDeTexto);
            textAutoAcompleter.setMode(0);
            fillElements(elementos, textAutoAcompleter);
            autocompleterObjects.put(nombreCampo, textAutoAcompleter);
        }
    }

    //Llenar un autocompleter con los elementos pasados por parametro.
    private static void fillElements(java.util.ArrayList<String> elementos, TextAutoCompleter textAutoAcompleter) {
        elementos.forEach((tmp) -> {
            textAutoAcompleter.addItem(tmp);
        });
    }
}
