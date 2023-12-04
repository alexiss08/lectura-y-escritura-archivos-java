package directorios;

import java.io.File;
import javax.swing.JOptionPane;

public class Directorios {
    public static void main(String[] args) {
        String ruta="C:\\ClinicaVetPet\\";
        String carpeta;
        
        do{
            carpeta=JOptionPane.showInputDialog("Nombre del paciente");
        }while(carpeta.length()<2 || carpeta.isEmpty() || carpeta.isBlank());
        File directorio = new File(ruta+carpeta);
        if (directorio.exists()==false){
            if (directorio.mkdirs()==true){
                JOptionPane.showMessageDialog(null, "Carpeta: "+carpeta+" creada");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al crear la carpeta");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La carpeta "+carpeta+" ya existe");
        }
        
    }    
}
