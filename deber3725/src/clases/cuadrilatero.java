/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
public class cuadrilatero {
    //Atributos
    int lado1;
    int lado2;
    
    //Constructorres
    public cuadrilatero(int lado1,int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public cuadrilatero(int lado1 ){
        this.lado1=this.lado2=lado1;
    }
    //Metodos
    public void area(){
        int resultado=this.lado1*this.lado1;
        System.out.println("El Area del caudrilatero es ="+resultado);
    }
    public void perimetro(){
        int resultado=2*(this.lado1+this.lado2);
        System.out.println("El Perimetro del caudrilatero es ="+resultado);
        
    }    
}
