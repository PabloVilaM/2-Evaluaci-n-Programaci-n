package conversor_de_temperaturas;


public class ConversorTemperaturas {
    private final float excepcion = 80;
    
    public float centigradosAFharenheit(float tempcenti){
        float Fharen = (9.0f/5.0f*tempcenti+32.4f);
        return Fharen;
    }
    
    public float centígradosAReamur(float tempcenti){
        float Reamur = 4.0f/5.0f*tempcenti;
        return tempcenti;
    }
}
