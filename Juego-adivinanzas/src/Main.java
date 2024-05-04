import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatoreo = new Random().nextInt(100);
        int numeroUsuario = 0;
        int numeroIntentos = 5;

        System.out.println("Bienvenido al juego de adivinanzas, trata de adivinar el numero");
        System.out.println("Primero, ingresa un número del 0 al 100");

        while (numeroIntentos > 0) {
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario > numeroAleatoreo) {
                System.out.println("El numero secreto es menor al que has puesto, vuelve a intentarlo");
            } else if (numeroUsuario < numeroAleatoreo) {
                System.out.println("El numero secreto es mayor al que has puesto, vuelve a intentarlo");
            } else {
                System.out.println("¡Felicidades has acertado!");
                break;
            }
            if (numeroIntentos == 1) {
                System.out.println("Lo siento, has perdido, el número era: " + numeroAleatoreo);
            }
            numeroIntentos --;
        }
    }
}