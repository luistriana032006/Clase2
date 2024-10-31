import java.util.Scanner;

/**
 * Crea un programa que calcule el área y el perímetro de un rectángulo.
 *  Solicita al usuario la longitud y el ancho del rectángulo.
 * 
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);

        System.out.println("BASE Y PERIMETRO DE UN RECTANGULO ");

        // VARIABLES 
        double base,longitud, result_area, result_perimetro;


        System.out.println("digite la base del rectangulo");
        base =entrada.nextDouble();

        System.out.println("digite la longitud del rectangulo");
        longitud = entrada.nextDouble();

        // operaciones base , perimetro 

        result_area= longitud * base;

        result_perimetro = 2*( base+longitud);

        System.out.println( "el valor del area es "+ result_area + " cm el valor del perimetro "+ result_perimetro +" cm ");

        entrada.close();




    }
}
