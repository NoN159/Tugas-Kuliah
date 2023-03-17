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
public class Tabung extends MenghitungRuang {
    private float jari2;
    private float tinggi;
    
    public Tabung(float jari2, float tinggi){
        this.jari2 = jari2;
        this.tinggi = tinggi;        
    }
    
    @Override
    public float volume() {
        return phi*jari2*jari2*tinggi;
    }
    
    @Override
    public float luaspermukaan() {
        return phi*jari2*2;
    }
}
