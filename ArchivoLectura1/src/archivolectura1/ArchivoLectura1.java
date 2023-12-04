package archivolectura1;

import javax.swing.JOptionPane;

public class ArchivoLectura1 {

    public static void main(String[] args) {

        Lectura leer1 = new Lectura();
        JOptionPane.showMessageDialog(null, leer1.leer("C:\\salida\\archivo.txt"));
        
    }
    
}
