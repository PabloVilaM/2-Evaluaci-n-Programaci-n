package boletin24;

import ToolboxPablo.leerDatos;
import java.util.ArrayList;
import libreria.Libro;
import libreria.Libreria;


public class Boletin24 {


    public static void main(String[] args) {
        
        ArrayList<Libro> lista = new ArrayList();
        System.out.println("Bienvenido a la libreria Lago en Calma, que quieres hacer? \n1.Añadir libros. \n2.Vender libros. \n3.Enseñar los libros (ordenador por título). "
        + "\n4.Dar de baja los libros con cantidad de unidades = 0. \n5.Consultar un libro determinado(ISBN). \n6.Salir");
        int casos;
        do{
            casos = leerDatos.leerInt("Aprieta el numero de la función que quieres hacer");
            switch(casos){
            case 1:
                Libro libr = new Libro();
                try{
                    Libreria.Engadir(lista, libr);
                }
                catch(NullPointerException ex){
                    System.out.println("Error, la lista contiene un null");
                }
                break;
            case 2:
                try{
                    Libreria.reducirStock(lista);
                }
                catch(NullPointerException ex){
                    System.out.println("Error, la lista contiene un null");
                }

                break;
            case 3:
                try{
                    Libreria.amosarLibro(lista);
                }
                catch(NullPointerException ex){
                    System.out.println("Error, la lista contiene un null");
                }
                break;
            case 4:
                try{
                    Libreria.eliminarLibro(lista);
                }
                catch(NullPointerException ex){
                    System.out.println("Error, la lista contiene un null");
                }
                break;
            case 5:
                try{
                    Libreria.consultaDeterminada(lista);
                }
                catch(NullPointerException ex){
                    System.out.println("Error, la lista contiene un null");
                }
                break;
            case 6:
                System.out.println("Vuelva pronto :D");
                break;
           }
        }while(casos!=6);
        
    }
    
}
