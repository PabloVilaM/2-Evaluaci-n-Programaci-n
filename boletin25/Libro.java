package boletin25;


public class Libro {
    private String titulo;
    private String autor;
    private float precio;
    private int unidades;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
}
