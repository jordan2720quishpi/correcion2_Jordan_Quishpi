
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1=null;
        System.out.println("El objeto p1 contines : "+p1);
        p1 =new Persona();
        System.out.println("El objeto p1 contiene : "+p1);
        p1.verDatos();
        p1.nombres ="Juan Carlos";
        p1.sueldoBasico =400;
        p1.verDatos();
    }
    
}
