package test;

import dominio.Estudiantes;
import java.util.Scanner;

public class PruebaEstudiantes {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner datos=new Scanner(System.in);
        Estudiantes[] estudiantes;
        int n;
        do {
            System.out.print("Cuantos estudiantes ahy en la clase: ");
            n = datos.nextInt();
            if (n < 1) {
                System.out.println("numero invalido");
            }
        } while (n < 1);
        datos.nextLine();
        
      
        estudiantes = new Estudiantes[n];
        llenaDatos(estudiantes);
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + estudiantes[i].getSexo() + estudiantes[i].getNotas());
        }
        System.out.println("El porcentaje de hombre es :"+porH(estudiantes)+"%");
        System.out.println("El porcentaje de mujeres es :"+porM(estudiantes)+"%");
        System.out.println("El estudiante con mayor caificaion es  :"+maxnota(estudiantes));
    }

    public static void llenaDatos(Estudiantes est[]) {
        int n;
        String nombre;
        double notas;
        char sexo;
        for (int i = 0; i < est.length; i++) {
            System.out.print("Nombre :");
            nombre = datos.nextLine();
            System.out.print("Sexo :");
            sexo = datos.next().charAt(0);
            System.out.print("Notas :");
            notas = datos.nextDouble();
            est[i] = new Estudiantes(nombre, sexo, notas);
            datos.nextLine();
        }
    }
    public static double porH(Estudiantes est[]){
        double porh;
        int c=0;
        for(int i=0;i<est.length;i++){
            if(est [i].getSexo()=='m'){
                c++;
            }
        }
        porh=c*100/est.length;
        return porh;
        
    }
    public static double porM(Estudiantes est[]){
        double porm;
        int c=0;
        for(int i=0;i<est.length;i++){
            if(est [i].getSexo()=='f'){
                c++;
            }
        }
        porm=c*100/est.length;
        return porm;
        
    }
    public static int maxnota(Estudiantes est[]){
        double promedio=0.0;
        int c=0;
        double c1=0.00;
        for(int i=0;i<est.length;i++){
            c1+=est[i].getNotas();
            
        }
       
        promedio=c1/est.length;
        System.out.println("Primedio"+promedio);
        for(int i=0;i<est.length;i++){
            if(est [i].getNotas()>=promedio){
                c++;
            }
        }
        return c;
        }
    }
 
      