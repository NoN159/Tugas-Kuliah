/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author NoName
 */
public class Lingkaran implements MenghitungBidang {
    private float jari2;
    
    public Lingkaran(float jari2){
        this.jari2 = jari2;
    }
    
    @Override
    public float luas() {
        return phi*jari2*jari2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float keliling() {
        return phi*(jari2*2); //To change body of generated methods, choose Tools | Templates.
    }
    
}
