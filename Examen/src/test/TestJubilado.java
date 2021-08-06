
package test;

import dominio.Jubilado;
import dominio.Vejez;
import java.util.Scanner;

public class TestJubilado {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Jubilado jub=null;
        Jubilado vejez=null;
        Jubilado patronal=null;
        Jubilado discapacida=null;
        int op=0;
        String nombre;
        String cedula;
        double salario=0.0;
        int anio=0;
        do{
            System.out.println("MENU DE OPCIONES ");
            System.out.println("1.Jubilacion por Vejez ");
            System.out.println("2.Jubilacion por Discapacida");
            System.out.println("3.Jubilacion Patronal");
            System.out.println("4.Salir");
            System.out.print("Ingrse una opcion:");
            op=entrada.nextInt();
         
            switch(op){
                case 1:
                    entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre=entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula=entrada.nextLine();
                    System.out.println("Salio Base: ");
                    salario=entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio=entrada.nextInt();
                    vejez= new Jubilado(cedula, nombre, salario, anio);
                    System.out.println(vejez.verDatos());
                    break;
                case 2:
                     entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre=entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula=entrada.nextLine();
                    System.out.println("Salario Base: ");
                    salario=entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio=entrada.nextInt();
                    discapacida=new Jubilado(cedula, nombre, salario,anio);
                    System.out.println(discapacida.verDatos());
                    break;
                    
                case 3:
                    entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre=entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula=entrada.nextLine();
                    System.out.println("Salario Base: ");
                    salario=entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio=entrada.nextInt();
                    patronal= new Jubilado(cedula, nombre, salario,anio);
                    System.out.println(patronal.verDatos());
                    break;
                   
                case 4: 
                    
                    
            }
      
        }while(op!=4);
        
    }
   
}
