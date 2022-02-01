package boletin22;
import ToolboxPablo.leerDatos;
import ToolboxPablo.tablas;
import ToolboxPablo.aarrays;

import java.util.Arrays;

public class Boletin22 {

    public static void main(String[] args) {
        //Ejercicio1
        int filas = leerDatos.leerInt("Numero de filas");
        int columnas = leerDatos.leerInt("NUmero de columnas");
        
        int[][] taboa = new int[filas][columnas];
        tablas.crearTabla(taboa);
        String [] nomes = {leerDatos.leerString("Equipo 1: "), leerDatos.leerString("Equipo 2: "), leerDatos.leerString("Equipo 3: ")};
        String [] jornadas = {"Equi/Xor","X1","X2", "X3"};
        
        //tablas.amosarTaboaCompleta(taboa, jornadas, nomes);
        
        //Ejercicio2
        /*int total [] = tablas.sumarPuntos(taboa);
        Arrays.sort(total);
        aarrays.amosarArray(total);*/
        
        //Ejercicio3 
        //3Funciones.sacarMayorValorJornada(taboa, nomes, jornadas);
        
        //Ejercicio4
        //Funciones.sacarMayorValor(taboa, nomes, jornadas);
        
        //Ejercicio5
        int goles = leerDatos.leerInt("Goles a consultar");
        Funciones.consultarViaGoles(taboa, nomes, jornadas, goles);
        
        
    }
    
}
