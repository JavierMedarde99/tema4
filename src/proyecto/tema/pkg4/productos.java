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

}
