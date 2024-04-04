public class Main {
    public static void main(String[] args) {
        int temperatura = 16;
        double conversionFahrenheit = (temperatura * 1.8) + 32;
        int redondeoFahrenheit = (int) (conversionFahrenheit);

        System.out.println(String.format("La temperatura en grados Celcius es de %d y en grados Fahrenheit es de %f y redondeado es de %d", temperatura, conversionFahrenheit, redondeoFahrenheit));
    }
}