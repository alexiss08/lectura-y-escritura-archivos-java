package archivoescritura1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class ArchivoEscritura1 {
    public static void main(String[] args) {
        String ruta="C:/salida/archivo.txt";
        String contenido="Saludos!!";
        try{
            File archivo = new File(ruta);
            if (archivo.exists()==false){
                archivo.createNewFile();
                FileWriter escritura = new FileWriter(archivo);
                try (BufferedWriter datos = new BufferedWriter(escritura)){
                    datos.write(contenido);
                    JOptionPane.showMessageDialog(null, "Archivo creado");
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error: "+e);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }



    }
    
}
