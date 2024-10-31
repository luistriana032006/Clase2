import java.util.Scanner;

/**
 * CorrecionError 
 * 
 * En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen.
 * Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
 * ¿Crees que es correcto el precio?
En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       
         Scanner entrada = new Scanner (System.in);
        
        // variables 
        int kilos_comprados;
        double precio_gramo = 5.95, precio_final;

        System.out.println( "digite la cantidad de gramos que compro ");
        kilos_comprados = entrada.nextInt();

        // operacion
         
        precio_final = kilos_comprados * precio_gramo;
        // salida informacion
     System.out.println( "el precio final es " +precio_final+ "euros");

     entrada.close();
    }
}