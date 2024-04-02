package net.salesianos.actividades.hijos;

import net.salesianos.actividades.padre.Publicacion;

public class Novela extends Publicacion {
    protected String tematica;
    protected String autor;

    public Novela(String titulo, int numeroDePaginas, String isbn, float precioDeDistribucion,
            float precioVentaPublico,
            String fechaDeEdicion, String tematica, String autor) {
        super(titulo, numeroDePaginas, isbn, precioDeDistribucion, precioVentaPublico, fechaDeEdicion);
        this.tematica = tematica;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\n --------------------------------------=== " + this.titulo
                + " ===------------------------------------ \n" +
                "* Temática: " + this.tematica + "\n" +
                "* Autor: \n" + this.autor + "\n" +
                "Número de páginas: " + this.numeroDePaginas + "\n" +
                " Precio de distribución: " + this.precioDeDistribucion + "\n" +
                "*Precio de venta al público: " + this.precioVentaPublico + "\n" +
                "========================================================\n";
    }
}
