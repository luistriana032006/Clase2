import java.util.Scanner;

/**
 * 
 * Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, 
 * multiplicación y división con esos números. 
 * Muestra los resultados en la consola.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        System.out.println("CALCULADORA");
       
        // variables 

        double numero1, numero2, resultado_suma, resultado_resta, resultado_div, resultado_multi;

        System.out.println("digite el primer numero");
        numero1= entrada.nextDouble();

        System.out.println("digite el segundo numero ");

        numero2= entrada.nextDouble();

       // resultados

       resultado_suma = numero1 + numero2;
       resultado_resta = numero1 - numero2;
       resultado_multi = numero1 * numero2;
       resultado_div = numero1 / numero2;

       System.out.println("los resultados son suma "+ resultado_suma +" resultado resta "+ resultado_resta + 
       " resultado multiplicacion " + resultado_multi+ " resultado division "+ resultado_div);

       entrada.close();
    
    }
}
