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
public class PersegiPanjang implements MenghitungBidang
{
    private float panjang;
    private float lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    };
    
    @Override
    public float luas() {
        return panjang*lebar; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float keliling() {
        return (panjang+lebar)*2; //To change body of generated methods, choose Tools | Templates.
    }
    
}
