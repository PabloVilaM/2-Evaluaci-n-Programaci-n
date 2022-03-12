package boletin25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin25 {
    
    public static void main(String[] args) {
        int respuesta;
        System.out.println("Bienvenido a la libreria que desea?");
        ArrayList<Libro> lista = new ArrayList();
        File fichero = new File("Esto.txt");
        FileWriter fich = null;
        try {
            fich = new FileWriter("Esto.txt",true);
        } catch (IOException ex) {
            System.out.println("Fallo de creacion");
        }
        do{
           String nums = JOptionPane.showInputDialog("Que  quieres hacer? \n1.Añadir un libro \n2.Consultar un libro. \n3.Visualizar toda la libreria. \n4.Borrar  libros con 0 unidades. \n5.Modificar el precio de un libro ");
            respuesta = Integer.parseInt(nums);
           switch(respuesta){
               case 1:
                   Libro libr = new Libro();
                   Libreria.Engadir(lista, libr, fich);
                   break;
               case 2:
                   Libreria.consultaDeterminada(lista);
                   break;
               case 3:
                   Libreria.amosarLibroEntero(lista, fichero);
                   break;
               case 4:
                   Libreria.eliminarLibro(lista);
                   break;
               case 5:
                  fich = Libreria.modificarPrecio(lista);
                   break;
               case 6:
                   System.out.println("Byeee");
                   break;
           }
        }while(respuesta != 6);
    }
    
}
