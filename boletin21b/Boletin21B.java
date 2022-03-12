package boletin21b;
import ToolboxPablo.aarrays;
import ToolboxPablo.leerDatos;
import java.lang.reflect.Array;

public class Boletin21B {

    public static void main(String[] args) {
        String nombres[];
        //Ejercicio1
       int numeros[] = Funciones.sacarListaRandom(6,51);
       aarrays.amosarArray(numeros);
       Funciones.RevertirValores(numeros);
       aarrays.amosarArray(numeros);
       //Ejercicio2 y Ejercio 3 a medias
       Alumno[] alumnos = new Alumno[30];
       Funciones.aprobadosSuspensos(alumnos);
       Funciones.notaMedia(alumnos);
       Funciones.visualizarAlta(alumnos);
       
         
       //Ejercicio4
       double dn = leerDatos.leerDouble("Dime el número del DNI");
       double letra = Math.round(dn%23);
       switch ((int)letra){
           case 0: System.out.println("T"); break;
           case 1: System.out.println("R"); break;
           case 2: System.out.println("W"); break;
           case 3: System.out.println("A"); break;
           case 4: System.out.println("G"); break;
           case 5: System.out.println("M"); break;
           case 6: System.out.println("Y"); break;
           case 7: System.out.println("F"); break;
           case 8: System.out.println("P"); break;
           case 9: System.out.println("D"); break;
           case 10: System.out.println("X"); break;
           case 11: System.out.println("B"); break;
           case 12: System.out.println("N"); break;
           case 13: System.out.println("J"); break;
           case 14: System.out.println("Z"); break;
           case 15: System.out.println("S"); break;
           case 16: System.out.println("Q"); break;
           case 17: System.out.println("V"); break;
           case 18: System.out.println("H"); break;
           case 19: System.out.println("L"); break;
           case 20: System.out.println("C"); break;
           case 21: System.out.println("K"); break;
           case 22: System.out.println("E"); break;
           
           
           
           
               
       }
    }
    
}
