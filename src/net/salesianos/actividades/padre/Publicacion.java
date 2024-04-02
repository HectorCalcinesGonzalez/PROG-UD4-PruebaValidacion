package net.salesianos.actividades.padre;

public class Publicacion {
    protected String titulo;
    protected int numeroDePaginas;
    protected String isbn;
    protected float precioDeDistribucion;
    protected double precioVentaPublico;
    protected String fechaDeEdicion;

    public Publicacion(String titulo, int numeroDePaginas, String isbn, float precioDeDistribucion,
            float precioVentaPublico,
            String fechaDeEdicion) {
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.isbn = isbn;
        this.precioDeDistribucion = precioDeDistribucion;
        this.precioVentaPublico = precioVentaPublico;
        this.fechaDeEdicion = fechaDeEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecioDeDistribucion() {
        return precioDeDistribucion;
    }

    public void setPrecioDeDistribucion(float precioDeDistribucion) {
        this.precioDeDistribucion = precioDeDistribucion;
    }

    public double getPrecioVentaPublico() {
        return precioVentaPublico;
    }

    public void setPrecioVentaPublico(double precioVentaPublico) {
        this.precioVentaPublico = precioVentaPublico;
    }

    public String getFechaDeEdicion() {
        return fechaDeEdicion;
    }

    public void setFechaDeEdicion(String fechaDeEdicion) {
        this.fechaDeEdicion = fechaDeEdicion;
    }

}
