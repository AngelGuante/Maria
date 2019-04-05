package Logica.CamposTexto;

public class Campo_seleccionarTodoTexto extends java.awt.event.FocusAdapter {

    //Selecciona todo el texto contenido en un campo
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        Object o = evt.getSource();
        if (o instanceof javax.swing.JTextField) {
            javax.swing.JTextField txt = (javax.swing.JTextField) o;
            txt.setSelectionStart(0);
            txt.setSelectionEnd(txt.getText().length());
        }
    }
}
