import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreUsuario = "Adam Sandler";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        /*
        Datos del Usuario
        */
        System.out.println("\n**************************************");
        System.out.println("Nombre del cliente: " + nombreUsuario);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("**************************************");

        /*
        Menú
         */
        String menu = """
                \n*** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        /*
        Navegación
         */
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("saldo insuficiente");
                    } else {
                        saldo -= valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depósitar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("\nOpción no válida");
            }
        }
    }
}