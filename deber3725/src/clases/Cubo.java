/*

 */
package clases;

/**
 *
 * @author asus
 */
public class Cubo {
    //Atributos
    int ancho;
    int alto;
    int profundo;
    //Metodos Constructor sin parametros
    public void metodo(){
        int resultado=this.ancho*this.alto*this.profundo;
        System.out.println("El Volumen de la Caja  es : "+resultado);
    }
    //Metodos Constructor con parametros
    public void metodo2(int ancho, int alto,int profundo) {
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
        System.out.println("El resultado con parametros es = "+(this.ancho*this.alto*this.profundo));
    }
}
