package net.salesianos.actividades.menu;

public class Menu {
    public void mostrarMenu() {
        String menu = """
                Menú de publicaciones:
                a. Añadir una nueva revista.
                b. Añadir un nuevo libro de texto.
                c. Añadir una nueva novela.
                d. Mostrar el listado de todas las publicaciones.
                e. Selección de una publicación y cálculo de su precio en Canarias y en Península.
                f. Salir del programa.
                """;
        System.out.println(menu);
    }
}
