/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class productos {

    //atributos 
    private static final double mounster = 4;
    private static final double patatasFritas = 2;
    private static final double Packcocacola = 3;
    private static final double papaDelta = 1;
    private static final double RISI = 1.5;
    private static final double medianoche = 1.5;
    private static final double donucts = 1.5;
    private static final double palomistasKetchup = 1.5;
    private static final double judias = 1.5;
    private static final double azucar = 1.5;
    private static final double chucherias = 2;
    private static final double redBull = 2;
    private static final double cocacola = 1.7;
    private static final double BarraPan = 1.5;
    private static final double oxigenoActivo = 2;
    private static final double laysCampesinas = 2;

    //el descuento de todas las bolsas menos la ultima
    private static final double descuento = 1.5;

    
    // todos los getters
    public double getMounster() {
        return mounster;
    }

    public double getPatatasFritas() {
        return patatasFritas;
    }

    public double getPackcocacola() {
        return Packcocacola;
    }

    public double getPapaDelta() {
        return papaDelta;
    }

    public double getRISI() {
        return RISI;
    }

    public double getMedianoche() {
        return medianoche;
    }

    public double getDonucts() {
        return donucts;
    }

    public double getPalomistasKetchup() {
        return palomistasKetchup;
    }

    public double getJudias() {
        return judias;
    }

    public double getAzucar() {
        return azucar;
    }

    public double getChucherias() {
        return chucherias;
    }

    public double getRedBull() {
        return redBull;
    }

    public double getCocacola() {
        return cocacola;
    }

    public double getBarraPan() {
        return BarraPan;
    }

    public double getOxigenoActivo() {
        return oxigenoActivo;
    }

    public double getLaysCampesinas() {
        return laysCampesinas;
    }
//proceso para el dinero de la bolsa 1
    public static double Bolsa1() {
        double total = chucherias + redBull + cocacola + BarraPan + oxigenoActivo + laysCampesinas + mounster;
        total = total - descuento;
        return total;
    }
   
    //proceso para el dinero de la bolsa 2
    public static double Bolsa2() {
        double total = patatasFritas + Packcocacola + papaDelta + RISI + medianoche;
        total = total - descuento;
        return total;
    }
    
      //proceso para el dinero de la bolsa 3
    public static double Bolsa3() {
        double total = patatasFritas + Packcocacola + donucts + palomistasKetchup + judias + azucar;
        total = total - descuento;

        return total;
    }

    //proceso para el dinero de la bolsa 4
    public static double Bolsa4() {
        double total = Packcocacola + chucherias + redBull + cocacola + BarraPan + oxigenoActivo + laysCampesinas;
        total = total - descuento;
        return total;
    }
    
     //proceso para el dinero de la bolsa 5
    public static double Bolsa5() {
        double total = 0;
        Scanner teclado = new Scanner(System.in);
        //aqui vemos el numero de veces que va a tener que elegit un producto
        System.out.println("Cuantos productos quiere");
        int tamanoBolsa = teclado.nextInt();
        
        //aqui un bucle para que pueda elegir mas de un productos
        for (int i = 1; i <= tamanoBolsa; i++) {
            System.out.println("Inserte numero del producto\n"
                    + "1.botella de monster \n"
                    + "2. bolsa de patatas fritas \n"
                    + "3.  pack de latas de coca-cola \n"
                    + "4. bolsa de papa-delta \n"
                    + "5. gusanitos RISI \n"
                    + "6. paquete de medianoches \n"
                    + "7. paquete de donuts \n"
                    + "8.  bolsa de palomitas sabor ketchup \n"
                    + "9. judías de lata merca-power \n"
                    + "10. azúcar \n"
                    + "11. bolsita de chucherías \n"
                    + "12. red bull \n"
                    + "13. coca-cola \n"
                    + "14. 2 barras de pan \n"
                    + "15. botella de oxígeno activo  \n"
                    + "16.  lays sabor campesinas \n");
            int numProducto = teclado.nextInt();
            switch (numProducto) {
                case 1:
                    total = total + mounster;
                    break;
                case 2:
                    total = total + patatasFritas;
                    break;
                case 3:
                    total = total + Packcocacola;
                    break;
                case 4:
                    total = total + papaDelta;
                    break;
                case 5:
                    total = total + RISI;
                    break;
                case 6:
                    total = total + medianoche;
                    break;
                case 7:
                    total = total + donucts;
                    break;
                case 8:
                    total = total + palomistasKetchup;
                    break;
                case 9:
                    total = total + judias;
                    break;
                case 10:
                    total = total + azucar;
                    break;
                case 11:
                    total = total + chucherias;
                    break;
                case 12:
                    total = total + redBull;
                    break;
                case 13:
                    total = total + cocacola;
                    break;
                case 14:
                    total = total + BarraPan;
                    break;
                case 15:
                    total = total + oxigenoActivo;
                    break;
                case 16:
                    total = total + laysCampesinas;
                    break;

            }
        }
        
        return total;

    }
}
