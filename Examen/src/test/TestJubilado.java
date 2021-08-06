package test;

import dominio.Jubilado;
import dominio.Vejez;
import dominio.*;
import java.util.Scanner;

public class TestJubilado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jubilado jub = null;
        Jubilado vejez = null;
        Jubilado patronal = null;
        Jubilado discapacida = null;
        int op = 0;
        String nombre;
        String cedula;
        double salario = 0.0;
        double dis;
        int anio = 0;
        do {
            System.out.println("MENU DE OPCIONES ");
            System.out.println("1.Jubilacion por Vejez ");
            System.out.println("2.Jubilacion por Discapacida");
            System.out.println("3.Jubilacion Patronal");
            System.out.println("4.Salir");
            System.out.print("Ingrse una opcion:");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre = entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula = entrada.nextLine();
                    System.out.println("Salio Base: ");
                    salario = entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio = entrada.nextInt();
                    vejez = new Vejez(cedula, nombre, salario, anio);
                    System.out.println("\tDatos del Jubilado\n" + vejez.verDatos());
                    System.out.println("Pension : " + vejez.calcularPension());
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre = entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula = entrada.nextLine();
                    System.out.println("Salario Base: ");
                    salario = entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio = entrada.nextInt();
                    System.out.println("Ingrese porcentaje de discapacida: ");
                    dis = entrada.nextDouble();
                    discapacida = new Discapacidad(cedula, nombre, salario, anio, dis);
                    System.out.println("\tDatos del Jubilado \n" + discapacida.verDatos());
                    System.out.println("Pension: " + discapacida.calcularPension());
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.print("Nombre : ");
                    nombre = entrada.nextLine();
                    System.out.print("Cedula : ");
                    cedula = entrada.nextLine();
                    System.out.println("Salario Base: ");
                    salario = entrada.nextFloat();
                    System.out.println("Amios: ");
                    anio = entrada.nextInt();
                    patronal = new Patronal(cedula, nombre, salario, anio);
                    System.out.println("\tDatos del jubiado\n" + patronal.verDatos());
                    System.out.println("Pension =" + patronal.calcularPension());

                    break;
                default:
                    System.out.println("\tOPCION NO VALIDA");
                    break;

                case 4:
                    System.out.println("\tGRACIAS POR USAR NUESTRO PROGRAMA ");
                    break;
                

            }

        } while (op != 4);

    }

}
