/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3725;

/**
 *
 * @author asus
 */
public class Cubo {
    
    int ancho;
    int alto;
    int profundo;
    public void volumen(){
        int resultado = this.ancho * this.alto*this.profundo;
        System.out.println("El resultado es  "+ resultado);
    }
    
    
}
