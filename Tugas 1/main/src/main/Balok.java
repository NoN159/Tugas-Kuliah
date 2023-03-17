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
public class Balok extends MenghitungRuang {
    private float panjang;
    private float lebar;
    private float tinggi;
    
    public Balok(float panjang, float lebar, float tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public float volume() {
        return panjang*lebar*tinggi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float luaspermukaan() {
       return 2*(panjang*lebar)+(panjang*tinggi)+(lebar*tinggi); //To change body of generated methods, choose Tools | Templates.
    }
    
}
