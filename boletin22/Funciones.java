package boletin22;
import ToolboxPablo.tablas;


public class Funciones {
    
    public static void sacarMayorValorJornada(int[][] taboa, String[] equipo, String[] jornada){
        int auxiliar = 0;
        int auxiliar2 = 0;
        int auxiliar3 = 0;
        int auxiliar4 = 0;
        int fila = 0;
        taboa = tablas.invertirTabla(taboa);
        
        for (fila = 0; fila<taboa.length;fila++){
            auxiliar4 = 0;
            for (int columna=0;columna<taboa[fila].length;columna++){       
                
                if (taboa[fila][columna]> auxiliar){
                    auxiliar = taboa[fila][columna];
                    auxiliar2 = columna;
                }
                else if(taboa[fila][columna] == auxiliar) {
                    
                    auxiliar4= columna;
                }
                
                auxiliar3 = fila;
            }
            
            if(auxiliar4==0){
              System.out.println("De la " + jornada[auxiliar3+1] + " el que mas goles tuvo fue el " + equipo[auxiliar2]);  
            }
            else{
                System.out.println("De la " + jornada[auxiliar3+1] + " el que mas goles tuvo fue el " + equipo[auxiliar2] + "+" + equipo[auxiliar4]);
            }
            
        }
        
        

    }
    
    public static void sacarMayorValor(int[][] taboa, String[] equipo, String[] jornada){
        int fila = 0;
        int auxiliar = 0;
         int auxiliar2 = 0;
         int auxiliar3 = 0;
        for (fila = 0; fila<taboa.length;fila++){
            
            for (int columna=0;columna<taboa[fila].length;columna++){
                if (taboa[fila][columna]> auxiliar){
                    auxiliar = taboa[fila][columna];
                    auxiliar2 = columna;
                    auxiliar3 = fila;
                }
                
            }
        }
        System.out.println("De la " + jornada[auxiliar2+1] + " el que mas goles tuvo fue el " + equipo[auxiliar3] + " rexistrandose " + auxiliar + " goles ");
    }
    
    public static void consultarViaGoles(int[][] taboa, String[] equipo, String[] jornada, int goles){
        int fila = 0;
        int auxiliar = 0;
         int auxiliar2 = 0;
        for (fila = 0; fila<taboa.length;fila++){
            
             for (int columna=0;columna<taboa[fila].length;columna++){
                if (taboa[fila][columna] == goles){
                    auxiliar = columna;
                    auxiliar2 = fila;
                    System.out.println("Tuvieron " + goles + " goles en la jornada " + jornada[auxiliar+1] + " el equipo " + equipo[auxiliar2]);
                }
            }
        }
            
    }
}
