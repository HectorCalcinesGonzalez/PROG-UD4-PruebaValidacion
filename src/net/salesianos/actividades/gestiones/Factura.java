package net.salesianos.actividades.gestiones;

import net.salesianos.actividades.padre.Publicacion;

public class Factura extends Publicacion {
    public Factura(String titulo, int numeroDePaginas, String isbn, float precioDeDistribucion,
            float precioVentaPublico,
            String fechaDeEdicion) {
        super(titulo, numeroDePaginas, isbn, precioDeDistribucion, precioVentaPublico, fechaDeEdicion);
    }

    public double calcularIgic(Publicacion publicacion) {
        return publicacion.getPrecioDeDistribucion() * 1.07;
    }

    public double calcularIva(Publicacion publicacion) {
        return publicacion.getPrecioDeDistribucion() * 1.21;
    }
}
