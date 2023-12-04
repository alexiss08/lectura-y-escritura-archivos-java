package archivolectura1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Lectura {
        public String leer(String ruta){     
        String texto="";
        String temporal="";
        
        try{
            BufferedReader memoria = new BufferedReader(new FileReader(ruta));
            temporal="";
            while ((temporal=memoria.readLine())!=null){
                texto=texto+temporal;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return texto;
    }
    
    
}
