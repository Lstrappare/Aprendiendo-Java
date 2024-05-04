public class Desciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = false;
        double notaPelicula = 8.2;
        String tipoPlan = "plus";

        /*
        Código que prueba los operadores relacionales
        */
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Peliculas Retro que aún vale la pena ver");
        }
        /*
        Codigo que prueba los operadores lógicos
        */
        if (incluidoEnPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
