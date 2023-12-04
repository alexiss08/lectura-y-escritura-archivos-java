package archivos;

import java.io.File;

public class Archivos {
   
    public static void main(String[] args) {
               
        File archivo = new File("C:\\salida\\archivo.txt");
        java.util.Date fechaModificacion =  new java.util.Date(archivo.lastModified());
        System.out.println("**Informaci�n del archivo**");
        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("�ltima modificaci�n: "+fechaModificacion); 
        System.out.println("Tama�o: "+archivo.length()+" Bytes");        
        System.out.println("Directorio: "+archivo.getPath());
        System.out.println("Directorio absoluto: "+archivo.getAbsolutePath());
        System.out.println("Directorio padre: "+archivo.getParent());
        System.out.println("**Evaluaci�n del archivo**");
        System.out.println((archivo.exists()==true)?"Existe":"No existe");
        System.out.println((archivo.canWrite()==true)?"Editable":"No editable");
        System.out.println((archivo.canRead()==true)?"Leible":"No leible");
        System.out.println((archivo.isDirectory()==true)?"Es directorio":"No es directorio");
        System.out.println((archivo.isFile()==true)?"Archivo normal":"Puede ser un enlace");
        System.out.println((archivo.isAbsolute()==true)?"Absoluto":"No absoluto");     

    }
    
    

    
}
