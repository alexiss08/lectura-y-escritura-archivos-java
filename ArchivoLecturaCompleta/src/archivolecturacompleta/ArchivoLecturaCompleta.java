package archivolecturacompleta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArchivoLecturaCompleta {

    public static void main(String[] args) {
   
    File doc = new File("C:\\salida\\archivo.txt");
    String salida="";
    
    Scanner obj;
        try {
            obj = new Scanner(doc);
             while (obj.hasNextLine()){
                 salida=obj.nextLine();
                 JOptionPane.showMessageDialog(null, salida);
             }
        } catch (FileNotFoundException ex) {
            System.out.println("Excepción: "+ex);
        }

        
    }
    
}
