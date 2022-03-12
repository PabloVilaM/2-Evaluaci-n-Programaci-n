package boletin21b;


public class Alumno {
    private float nota;
    private String nome;

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "nota=" + nota + ", nome=" + nome;
    }
    
}
