package boletin23;


public class Strings {
    
    
    public static void Longitud(String frase){
        int i = 0;
        for(i = 0;i<frase.length();i++){
            
        }
        System.out.println("A lonxitude do texto é " + i);
    }
    
    public static void Desmenuzar(String frase){
        int i = 0;
        for(i = 0;i<frase.length();i++){
            char caracter = frase.charAt(i);
            System.out.println(caracter);
        }
    }
    
    public static void Invertir(String frase){
        StringBuilder strb = new StringBuilder(frase);
        frase = strb.reverse().toString();
        System.out.println(frase);
    }
    
    public static String eliminarEspacios(String frase){
        frase = frase.replace(" ", "");
        System.out.println(frase);
        return frase;
    }
    
    public static void contarConsonantesyVocales(String frase){
         frase = Strings.eliminarEspacios(frase);
        frase = frase.toLowerCase();
        int j=0;
        int z=0;

        for(int i = 0;i<frase.length();i++){
            char caracter = frase.charAt(i);
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'o' || caracter == 'u' || caracter == 'i'){
                j++;
            }
            else{
                z++;
            }
        }
        System.out.println("Número de vogales: "+ j + "\nNúmero de consonantes: " + z);
    }
    
    public static void dividiryConcatenar(String frase){
        String frase2 = "";
        frase2 = frase.substring(0, 10);
        frase = frase.substring(10, 21);
        System.out.println("La primera parte es: " + frase2 + "\nLa segunda parte es: "+ frase);
        frase = frase2.concat(frase);
        System.out.println("Frase entera:" + frase);
    }
    
    public static void mayusMinus(String frase){
        frase = frase.toUpperCase();
        System.out.println("Mayusculas: "+ frase);
        frase = frase.toLowerCase();
        System.out.println("Minusculas: "+ frase);
    }
    
    public static void comparar(String frase, String frase2){
        int res = frase.compareTo(frase2);
        if (res == 0){
            System.out.println("Es verdadero, son iguales");
        }
        else{
            System.out.println("Es falso");
        }
    }
    
    public static void sustituirVocales(String frase){
        System.out.println("Frase original: " + frase);
        frase = frase.replace('e', 'a');
        System.out.println("Frase arreglada: " + frase);
    }
    
    public static void codeAsci(String frase){
        for(int i = 0;i<frase.length();i++){
            char caracter = frase.charAt(i);
            int cara = (int)caracter;
            System.out.println("El caracter: " + caracter + " equivale a: " + cara);
            
            
        }
    }
    
    public static void contarConsonantesVocalesEspacios(String frase){
        frase = frase.toLowerCase();
        int j=0;
        int z=0;
        int y = 0;

        for(int i = 0;i<frase.length();i++){
            char caracter = frase.charAt(i);
            
            if (caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9' || caracter == '0'){
                j++;
            }
            else if(caracter == ' '){
                z++;
            }
            else if (caracter == ','){
                
            }
            else{
                y++;
            }
        }
        System.out.println("El número de letras es: " + y + "\nEl número de números que tiene es: " + j + "\nEl número de espacios en blanco que tiene es: " + z);
    }
    
}
