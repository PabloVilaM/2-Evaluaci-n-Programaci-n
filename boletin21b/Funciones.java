package boletin21b;
import ToolboxPablo.aarrays;


public class Funciones {
    
    public static int[] sacarListaRandom(int longitudLista, int longitudValores){
        int[] randoms = new int[longitudLista];
        for(int i = 0;i<randoms.length;i++){
            double random = Math.random()*longitudValores;
            int random2 = (int)random;
            randoms[i] = random2; 
        }
       
        return randoms;
    }
    
    public static int[] RevertirValores(int[] lista){
       int j=lista.length-1;
       int aux;
       for(int i=0;i<lista.length/2;i++){
          aux = lista[i];
          lista[i]=lista[j];
          lista[j] = aux;
          
           j--;
       }
       
      
      return lista;
   }
    
    public static void aprobadosSuspensos (Alumno[] alumnos){
        
        for(int i = 0; i<alumnos.length;i++){
            double random = Math.random()*31;
            float random2 = (float)random;
            random2 = Math.round(random2*100)/100;
            alumnos[i].setNota(random2);
            aarrays.amosarArrayObjeto(alumnos);
            alumnos[i].setNome(aarrays.listaNombresAleatorios(31));
        }
    }
    
    public static void notaMedia (Alumno[] alumnos){
        float media = 0;
        for(int i = 0; i<alumnos.length;i++){
           media =  alumnos[i].getNota() + media;
        }
        System.out.println("Nota media: " + media);
    }
    
    public static void visualizarAlta (Alumno[] alumnos){
        float aux = 0;
        for(int i = 0; i<alumnos.length;i++){
            float nota1 = alumnos[i].getNota();
            float nota2 = alumnos[i-1].getNota();
            if(nota1 > aux){
                aux = nota1;
                System.out.println(aux);
            }
        }
    }
    
        
}
