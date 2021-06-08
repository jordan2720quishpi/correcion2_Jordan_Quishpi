/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Cubo {
    //Atributos
    int ancho;
    int alto;
    int profundo;
    //Constructores
    public Cubo(){
        System.out.println("llamando al metodo");
    }
    public Cubo(int ancho,int alto,int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    //Metodo
    public void volumen(){
        int resultado =this.ancho*this.alto*this.profundo;
        System.out.println("EL Volumen del Cubo es = "+resultado);
    }
}
