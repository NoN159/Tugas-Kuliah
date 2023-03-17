/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.*;

/**
 *
 * @author NoName
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran Lingkaran1 = new Lingkaran(10);
        PersegiPanjang PersegiPanjang1 = new PersegiPanjang(5, 10);
        Balok Balok1 = new Balok(3, 4, 5);
        Tabung Tabung1 = new Tabung(7, 10);
        
        //Lingkaran
        System.out.println("Luas Lingkaran: " + Lingkaran1.luas());
        System.out.println("Keliling Lingkaran: " + Lingkaran1.keliling());

        //Persegi Panjang
        System.out.println("Luas Persegi Panjang: " + PersegiPanjang1.luas());
        System.out.println("Keliling Persegi Panjang: " + PersegiPanjang1.keliling());
        
        //Balok
        System.out.println("Volume Balok: " + Balok1.volume());
        System.out.println("Luas Permukaan Balok: " + Balok1.luaspermukaan());
        
        //Tabung
        System.out.println("Volume Tabung: " + Tabung1.volume());
        System.out.println("Luas Permukaan Tabung: " + Tabung1.luaspermukaan());
    }
    
}
