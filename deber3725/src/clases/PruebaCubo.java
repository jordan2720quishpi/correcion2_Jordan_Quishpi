
package clases;


public class PruebaCubo {
    public static void main(String[] args) {
        Cubo ob1 =new Cubo();
        ob1.ancho=3;
        ob1.alto=2;
        ob1.profundo=6;
        ob1.volumen();
        Cubo ob2=new Cubo(3,2,6);
        ob2.volumen();
    }
    
    
}
