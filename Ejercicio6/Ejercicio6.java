/**
 * En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo. 
 *Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes de septiembre.
Para aprovechar la temporada de rebajas he salido de compras. 
He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("VALOR ANTES DE DESCUENTO");

        // variables 
        double precio_antes_descuento, precio_con_descuento=34,valor_descuento;

        // operaciones

        valor_descuento = precio_con_descuento *15/100;

        precio_antes_descuento= precio_con_descuento + valor_descuento;

        System.out.println(" el valor de la camiseta fue " +precio_antes_descuento);
        
    }
}
