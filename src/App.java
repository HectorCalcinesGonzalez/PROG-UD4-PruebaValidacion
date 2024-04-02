import java.util.Scanner;

import net.salesianos.actividades.gestiones.Gestor;
import net.salesianos.actividades.hijos.LibroDeTexto;
import net.salesianos.actividades.hijos.Novela;
import net.salesianos.actividades.hijos.Revista;
import net.salesianos.actividades.menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner SCANNER = new Scanner(System.in);
        final Menu Menu = new Menu();
        boolean seguir = true;
        String opcion;
        Gestor gestor = new Gestor(SCANNER);
        while (seguir) {
            Menu.mostrarMenu();
            opcion = SCANNER.nextLine();
            switch (opcion) {
                case "a":
                    System.out.println("Escriba el titulo de la revista: ");
                    String titulo = SCANNER.nextLine();
                    System.out.println("Introduzca el numero de paginas:");
                    int numeroDePaginas = SCANNER.nextInt();
                    System.out.println("Introduzca el isbn:");
                    String isbn = SCANNER.nextLine();
                    System.out.println("Introduzca el precio de distribución:");
                    float precioDeDistribucion = SCANNER.nextFloat();
                    System.out.println("Introduzca el precio de la venta al público:");
                    float precioVentaPublico = SCANNER.nextFloat();
                    System.out.println("Introduzca la fecha de edición:");
                    String fechaDeEdicion = SCANNER.nextLine();
                    System.out.println("Indique el numero de revista:");
                    int numeroDeRevistas = SCANNER.nextInt();
                    System.out.println("Introduzca el nombre de los artículo separados por comas:");
                    String nombreArticulos = SCANNER.nextLine();
                    String[] listaArticulos = nombreArticulos.split(",");

                    Revista revista = new Revista(titulo, numeroDePaginas, isbn, precioDeDistribucion,
                            precioVentaPublico, fechaDeEdicion, numeroDeRevistas, listaArticulos);

                    gestor.añadirRevista(revista);

                    break;
                case "b":
                    System.out.println("Escriba el titulo de la libro: ");
                    String tituloLibro = SCANNER.nextLine();
                    System.out.println("Introduzca el numero de paginas:");
                    int numeroDePaginasLibro = SCANNER.nextInt();
                    System.out.println("Introduzca el isbn:");
                    String isbnLibro = SCANNER.nextLine();
                    System.out.println("Introduzca el precio de distribución:");
                    float precioDeDistribucionLibro = SCANNER.nextFloat();
                    System.out.println("Introduzca el precio de la venta al público:");
                    float precioVentaPublicoLibro = SCANNER.nextFloat();
                    System.out.println("Introduzca la fecha de edición:");
                    String fechaDeEdicionLibro = SCANNER.nextLine();
                    System.out.println("Intoduzca la asignatura del libro:");
                    String asignatura = SCANNER.nextLine();
                    System.out.println("Introduzca los temas separados por comas:");
                    String temas = SCANNER.nextLine();
                    String[] listaTemas = temas.split(",");
                    LibroDeTexto libroDeTexto = new LibroDeTexto(tituloLibro, numeroDePaginasLibro, isbnLibro,
                            precioDeDistribucionLibro, precioVentaPublicoLibro, fechaDeEdicionLibro, asignatura,
                            listaTemas);

                    gestor.añadirLibroDeTexto(libroDeTexto);

                    break;
                case "c":
                    System.out.println("Escriba el titulo de la novela: ");
                    String tituloNovela = SCANNER.nextLine();
                    System.out.println("Introduzca el numero de paginas:");
                    int numeroDePaginasNovela = SCANNER.nextInt();
                    System.out.println("Introduzca el isbn:");
                    String isbnNovela = SCANNER.nextLine();
                    System.out.println("Introduzca el precio de distribución:");
                    float precioDeDistribucionNovela = SCANNER.nextFloat();
                    System.out.println("Introduzca el precio de la venta al público:");
                    float precioVentaPublicoNovela = SCANNER.nextFloat();
                    System.out.println("Introduzca la fecha de edición:");
                    String fechaDeEdicionNovela = SCANNER.nextLine();
                    System.out.println("Intoduzca la temática de la novela:");
                    String tematica = SCANNER.nextLine();
                    System.out.println("Introduzca el nombre del autor:");
                    String autor = SCANNER.nextLine();

                    Novela novela = new Novela(tituloNovela, numeroDePaginasNovela, isbnNovela,
                            precioDeDistribucionNovela, precioVentaPublicoNovela, fechaDeEdicionNovela, tematica,
                            autor);

                    gestor.añadirNovela(novela);

                    break;
                case "d":

                    break;
                case "e":

                    break;
                case "f":

                    break;

                default:
                    break;
            }
        }
    }
}
