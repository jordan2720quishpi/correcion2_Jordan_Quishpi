
package test;

import dominio.Estudiantes;
import java.util.Scanner;

public class PruebaEstudiante {
    
    

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        int nroHombres;
        System.out.println("Cuantos estudiantes desea Ingresar");
        int n =datos.nextInt();
        Estudiantes [] estudiantes = new Estudiantes[n];
        llenaDatos(estudiantes);
        //porGenero(estudiantes);
        nroHombres=porGenero(estudiantes);
        System.out.println("El %x de hombres por encima del promedio"+porcentajePromedio(estudiantes,nroHombres ,'m' ));
        System.out.println("El % x de mujeres por encima del promedio"+porcentajePromedio(estudiantes,nroHombres ,'f' ));
        //estudiante=notaAlta(estudiantes);
       // System.out.println("El estudiantes con la mas altaa nkotas"+);
    }
    public static void llenaDatos(Estudiantes est[]) {
        
        String nombre;
        double notas;
        char sexo;
        for (int i = 0; i < est.length; i++) {
            datos.nextLine();
            System.out.println("Estudiante No :"+(i+1));
            System.out.print("Nombre :");
            nombre = datos.nextLine();
            System.out.println("Sexo <<m>><<f>> :");
            sexo = datos.next().charAt(0);
            System.out.print("Notas :");
            notas = datos.nextDouble();
            est[i] = new Estudiantes(nombre, sexo, notas);
            
        }
    }

    public static int porGenero(Estudiantes est[]) {
        int cuentahombre=0,cuentamujeres=0;
        double porc;
        for (int i = 0; i < est.length; i++) {
            if (est[i].getSexo() == 'm') {
                cuentahombre++;
            }
        }
        cuentamujeres = est.length-cuentahombre;
        System.out.println("Porcentaje hombres :"+(cuentahombre*100)/est.length+"%");
        System.out.println("Porcentaje mujeres :"+(cuentamujeres*100)/est.length+"%");
        porc = cuentahombre * 100 / est.length;
        return cuentahombre;
    }
    public static double porcentajePromedio(Estudiantes est[],  int homb , char sex ){
        int muj=est.length-homb;
        int cuenta=0;
        double promedio=0,porch,porcm;
        for(int i=0;i<est.length;i++){
            promedio+=est[i].getNotas();
        }
        promedio=promedio/est.length;
        for(int i=0;i<est.length;i++){
            if(est[i].getNotas()>promedio && est[i].getSexo()==sex){
                cuenta++;
            }
            porch=homb*100/est.length;
            porcm=muj*100/est.length;
            if (sex=='m'&& homb>0){
                porch=cuenta*porch/homb;
                return porch;
            }
            else if (muj>0){
                porcm=cuenta*porcm/muj;
                return porcm;
            }
            else{
                return 0; 
            }
        }
    }
    
}
