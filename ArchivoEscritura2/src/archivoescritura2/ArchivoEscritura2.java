package archivoescritura2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;

public class ArchivoEscritura2 {

    public static void main(String[] args) {

        String ruta="C://salida/salida2.txt";
        String codificacion="UTF-8";
        
        try{
            PrintWriter escritura = new PrintWriter(ruta,codificacion);
            escritura.println("Funciona con tílde");
            escritura.close();
            JOptionPane.showMessageDialog(null, "Archivo creado");
        }catch(FileNotFoundException | UnsupportedEncodingException e){
            JOptionPane.showMessageDialog(null, e);
        }


    }
    
}
