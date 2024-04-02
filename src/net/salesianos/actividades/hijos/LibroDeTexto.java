package net.salesianos.actividades.hijos;

import net.salesianos.actividades.padre.Publicacion;

public class LibroDeTexto extends Publicacion {
    protected String asignatura;
    protected String[] temas;

    public LibroDeTexto(String titulo, int numeroDePaginas, String isbn, float precioDeDistribucion,
            float precioVentaPublico,
            String fechaDeEdicion, String asignatura, String[] temas) {
        super(titulo, numeroDePaginas, isbn, precioDeDistribucion, precioVentaPublico, fechaDeEdicion);
        this.asignatura = asignatura;
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "\n --------------------------------------=== " + this.titulo
                + " ===------------------------------------ \n" +
                "* Asignatura: " + this.asignatura + "\n" +
                "* Lista de temas: \n" + this.temas + "\n" +
                "* Precio de distribución: " + this.precioDeDistribucion + "\n" +
                "*Precio de venta al público: " + this.precioVentaPublico + "\n" +
                "========================================================\n";
    }
}
