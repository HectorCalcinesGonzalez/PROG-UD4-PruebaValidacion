package net.salesianos.actividades.hijos;

import net.salesianos.actividades.padre.Publicacion;

public class Revista extends Publicacion {

    protected int numeroDeRevistas;
    protected String[] nombreArticulos;

    public Revista(String titulo, int numeroDePaginas, String isbn, float precioDeDistribucion,
            float precioVentaPublico,
            String fechaDeEdicion, int numeroDeRevistas, String[] nombresArticulos) {
        super(titulo, numeroDePaginas, isbn, precioDeDistribucion, precioVentaPublico, fechaDeEdicion);
        this.numeroDeRevistas = numeroDeRevistas;
        this.nombreArticulos = nombresArticulos;
    }

    @Override
    public String toString() {
        return "\n --------------------------------------===<" + this.titulo
                + "===------------------------------------ \n" +
                "* Número de la revista: " + this.numeroDeRevistas + "\n" +
                "* Lista de artículos: \n" + this.nombreArticulos + "\n" +
                "* Precio de distribución: " + this.precioDeDistribucion + "\n" +
                "*Precio de venta al público: " + this.precioVentaPublico + "\n" +
                "========================================================\n";
    }
}
