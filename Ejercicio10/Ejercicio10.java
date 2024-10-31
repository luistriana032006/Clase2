
import java.util.Scanner;
/**
 * Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
 */

public class Ejercicio10 {
    public static void main(String[] args) {

       Scanner entrada = new Scanner ( System.in);

        double numero0 , numero1, numero2, denominador=3,Rta; 

        System.out.println(" digite los 3 numeros ");
 
        numero0 = entrada.nextDouble();
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();

        // OPERACIONES 

        Rta =  ( numero0+numero1+numero2 ) / denominador;
        System.out.println( " la  media de los numero es "+Rta);

       entrada.close();
    }

}
