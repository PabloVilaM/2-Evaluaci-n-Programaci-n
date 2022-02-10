package libreria;

import java.util.ArrayList;
import ToolboxPablo.leerDatos;
import java.util.Arrays;
import ToolboxPablo.aarrays;
import java.util.Collections;
import java.util.Comparator;

public class Libreria {
    
    public static ArrayList<Libro> Engadir (ArrayList<Libro> lista, Libro libr){
        boolean a = false;
       libr.setISBN(leerDatos.leerString("Que ISBN va a tener el producto?"));
       int st = leerDatos.leerInt("Cuanto stock de ese producto vas a añadir?");
       for(int i = 0; i<lista.size();i++){
           if(libr.equals(lista.get(i))){
               Libro libr2 = lista.get(i);                         
               libr2.setUnidades(libr2.getUnidades()+st);
            a = true;
          } 
           
       }
         if (a == false){
             libr.setTítulo(leerDatos.leerString("El título del libro es?"));
             libr.setPrezo(leerDatos.leerFloat("Cuanto vale el producto?"));
             libr.setAutor(leerDatos.leerString("El nombre del autor es?"));
             libr.setUnidades(libr.getUnidades()+st);
             lista.add(libr);
         }
            
       return lista;
             
    }
    
    public static void reducirStock(ArrayList<Libro> lista){
       int st = leerDatos.leerInt("Stock vendido");
       String code = leerDatos.leerString("Dime el ISBN del producto");
        for(int i = 0; i<lista.size();i++){
           Libro lib = lista.get(i);
           String code2 = lib.getISBN();
           if(code.equals(code2)){
               lib.setUnidades(lib.getUnidades()-st);

           }
        }
    }
    
    public static void amosarLibro (ArrayList<Libro> lista){
        
        Collections.sort(lista);
        lista.iterator();
        System.out.println(lista);
             
    }
            
    
    public static void consultaDeterminada (ArrayList<Libro> lista){
        String code = leerDatos.leerString("Dime el ISBN del libro que buscas");
        
        for(int i = 0; i<lista.size();i++){
           Libro libr = lista.get(i);
           String code2 = libr.getISBN();
           if(code.equals(code2)){
               System.out.println(lista.get(i));
           }
        }
    }
    
    public static void eliminarLibro (ArrayList<Libro> lista){
        
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i).getUnidades() == 0){
                lista.remove(i);
            }
        }
    }
    
    
}
