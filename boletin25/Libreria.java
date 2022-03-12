package boletin25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Libreria {
    
    public static ArrayList<Libro> Engadir (ArrayList<Libro> lista, Libro libr, FileWriter fich){
        boolean a = false;
        PrintWriter escribir = new PrintWriter(fich);
       int st = Libreria.leerInt("Cuanto stock de ese producto vas a añadir?");
       for(int i = 0; i<lista.size();i++){
           if(libr.equals(lista.get(i))){
               Libro libr2 = lista.get(i);                         
               libr2.setUnidades(libr2.getUnidades()+st);
            a = true;
          } 
           
       }
         if (a == false){
             libr.setTitulo(Libreria.leerString("El título del libro es?"));
             libr.setPrecio(Libreria.leerFloat("Cuanto vale el producto?"));
             libr.setAutor(Libreria.leerString("El nombre del autor es?"));
             libr.setUnidades(libr.getUnidades()+st);
             lista.add(libr);
             
             escribir.println(libr.toString());
             
         }
            
       return lista;
             
    }
    
    public static FileWriter modificarPrecio (ArrayList<Libro> lista){
        String code = Libreria.leerString("Dime el titulo del libro que buscas");
        Float precio = Libreria.leerFloat("Dime el nuevo precio");
        FileWriter file2 = null;
        PrintWriter escribir2 = new PrintWriter(file2);
        try {
                   file2 = new FileWriter("Esto2.txt",true);
                } catch (IOException ex) {
                    System.out.println("Error de escritura 2");
                }
        
        for(int i = 0; i<lista.size();i++){
            if (code.equals(lista.get(i).getTitulo())){
                lista.get(i).setPrecio(precio);
                
            }
            escribir2.println(lista.get(i));
        }
        
        try {
            file2.close();
        } catch (IOException ex) {
            Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return file2;
    }
    
    public static void amosarLibroEntero (ArrayList<Libro> lista, File fichero){
        Scanner sc = null;
        String nom;
        try {
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                nom = sc.nextLine();
                System.out.println(nom);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 " + ex.toString());
        }
        finally{
            sc.close();
        }
             
    }
            
    
    public static void consultaDeterminada (ArrayList<Libro> lista){
        String code = Libreria.leerString("Dime el titulo del libro que buscas");
        
        for(int i = 0; i<lista.size();i++){
           Libro libr = lista.get(i);
           String code2 = lista.get(i).getTitulo();
           if(code.equals(code2)){
               System.out.println(lista.get(i));
           }
        }
    }
    
    public static void eliminarLibro (ArrayList<Libro> lista){
        
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i).getUnidades() == 0){
                lista.remove(i);
                PrintWriter escribir = null;
                escribir.println(lista.get(i).toString());
            }
        }
    }
    
        public static String leerString(String mensaxe){
       String lect = JOptionPane.showInputDialog(mensaxe);
       return lect;
    }
    
    public static float leerFloat(String mensaxe){
       String lect = JOptionPane.showInputDialog(mensaxe);
       float a = Float.parseFloat(lect);
       return a;
    }
    public static int leerInt(String mensaxe){
       String lect = JOptionPane.showInputDialog(mensaxe);
       int a = Integer.parseInt(lect);
       return a;
    }
}
    
