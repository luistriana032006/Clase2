import java.util.Scanner;

/**
 * Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
 * 
 * 
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float temperatura_celsius, resultado_farenheit, resultado_kelvin;
        System.out.println("digite la temperatura en Celsius");
        temperatura_celsius = entrada.nextFloat();

        // operaciones 
        resultado_kelvin = temperatura_celsius + 273.15f;
        resultado_farenheit = temperatura_celsius * 9/5f + 32f;

        System.out.println( " los resultados de la temperatura son  para kelvin "+ resultado_kelvin + " grados kelvin para farenheit " +resultado_farenheit + " grados farenheit ");
 
        entrada.close();
    }
}
