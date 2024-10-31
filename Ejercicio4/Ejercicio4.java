/**
 * La posibilidad de ir al cine entre semana pagando un precio reducido es una tradición en las salas de cine españolas, 
 * lo que se conoce como El día del espectador. 
 * En algunos cines, el día del espectador suele ser los miércoles y las entradas se reducen hasta en un 70%. 
 * La única pega es que suele ir mucha más gente...
Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€. 
Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
 * 
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("ejercicio 4 cuanto se ha gastado carmen");

        System.out.println("carmen se fue con 23 euros y regreso son 12.75 euros");

         double dinero_total, dinero_de_salida = 23, dinero_regreso=12.75;

        // operacion 
        dinero_total= dinero_de_salida - dinero_regreso;

        System.out.println("el dinero que gasto fue "+dinero_total+ "euros");


    }
}
