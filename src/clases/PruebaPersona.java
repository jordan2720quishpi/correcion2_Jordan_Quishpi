
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1=null;
        int edad=0;
        System.out.println("El objeto p1 contines : "+p1);
        p1 =new Persona();
        System.out.println("El objeto p1 contiene : "+p1);
        p1.verDatos();
        p1.nombres ="Juan Carlos";
        p1.sueldoBasico =400;
        p1.verDatos();
        edad = calcularEdad(edad);
        System.out.println("Edad : "+edad);
        cambiarDatosPersona(p1);
        System.out.println("Datos actualizados");
        p1.verDatos();
        
    }
    public static int calcularEdad( int arg1){
        System.out.println("La varaiable arg1 : "+arg1);
        arg1 = 2021-1994;
        return arg1;
        
    }
    public static void cambiarDatosPersona(Persona per){
        per.nombres= "Juancho";
        per.sueldoBasico = 800;
    }
}
