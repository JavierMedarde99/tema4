/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tema.pkg4;

import static proyecto.tema.pkg4.productos.Bolsa1;
import static proyecto.tema.pkg4.productos.Bolsa2;
import static proyecto.tema.pkg4.productos.Bolsa3;
import static proyecto.tema.pkg4.productos.Bolsa4;
import static proyecto.tema.pkg4.productos.Bolsa5;
import java.util.Scanner;


/**
 *
 * @author javie
 */
public class MAIN {

    
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         //aqui preguntamos cual quiere elegir
        System.out.println("inserte el numero de la bolsa que quiere \n"
                + "bolsa 1: bolsita de chucherías, red bull, coca-cola, 2 barras de pan, botella de oxígeno activo, lays sabor campesinas, botella de monster \n"
                + "bolsa 2: bolsa de patatas fritas, pack de latas de coca-cola, bolsa de papa-delta, gusanitos RISI, paquete de medianoches \n"
                + "bolsa 3: bolsa de patatas fritas, pack de latas de coca-cola, paquete de donuts, bolsa de palomitas sabor ketchup, judías de lata merca-power, azúcar.\n"
                + "bolsa 4: pack de latas de coca-cola, bolsita de chucherías, red bull, coca-cola, 2 barras de pan, botella de oxígeno activo, lays sabor campesinas \n"
                + "bolsa 5: configurable pero no tendrá descuento. ");
         int eleccion = teclado.nextInt();
         
         //aqui es para que poner el proceso que necesita cada bolsa y el dinero final que tiene que pagar
         
         switch (eleccion){
             case 1 :
                 System.out.println("El precio de este producto es de "+Bolsa1());
                 break;
                  case 2 :
                 System.out.println("El precio de este producto es de "+Bolsa2());
                 break;
                  case 3 :
                 System.out.println("El precio de este producto es de "+Bolsa3());
                 break;
                  case 4 :
                 System.out.println("El precio de este producto es de "+Bolsa4());
                 break;
                  case 5 :
                 System.out.println("El precio de este producto es de "+Bolsa5());
                 break;
                  
         }
    }

   

}
