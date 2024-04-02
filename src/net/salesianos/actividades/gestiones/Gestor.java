package net.salesianos.actividades.gestiones;

import java.util.Scanner;

import net.salesianos.actividades.hijos.Revista;
import net.salesianos.actividades.hijos.LibroDeTexto;
import net.salesianos.actividades.hijos.Novela;

public class Gestor {
    private final Scanner SCANNER;
    private Revista[] listaRevistas = new Revista[10];
    private LibroDeTexto[] listaLibros = new LibroDeTexto[10];
    private Novela[] listaNovelas = new Novela[10];

    public Gestor(Scanner scanner) {
        this.SCANNER = scanner;
    }

    public void añadirRevista(Revista nuevaRevista) {

    }

    public void añadirLibroDeTexto(LibroDeTexto nuevoLibro) {
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] == null) {
                listaLibros[i] = nuevoLibro;
                break;
            }
        }
    }

    public void añadirNovela(Novela nuevaNovela) {
        for (int i = 0; i < listaNovelas.length; i++) {
            if (listaNovelas[i] == null) {
                listaNovelas[i] = nuevaNovela;
                break;
            }
        }
    }

    public void mostrarPublicaciones() {
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaRevistas != null) {
                System.out.println(listaRevistas[i].toString());
            }
        }
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros != null) {
                System.out.println(listaLibros[i].toString());
            }
        }
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaNovelas != null) {
                System.out.println(listaNovelas[i].toString());
            }
        }
    }

}
