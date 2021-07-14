/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class testEmpleadoFecha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anion, mesn, dian, mesi, diai, anioi;
        int dia1, mes1, anio1;
        anio1 = fecha.get(Calendar.YEAR);
        mes1 = fecha.get(Calendar.MONTH) + 1;
        dia1 = fecha.get(Calendar.DAY_OF_MONTH);
        String nombre;
        System.out.println("Fecha Atual: " + dia1 + "/" + mes1 + "/" + anio1);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento");
        System.out.print("Año: ");
        anion = entrada.nextInt();
        System.out.print("Mes: ");
        mesn = entrada.nextInt();
        System.out.print("Día: ");
        dian = entrada.nextInt();
        fNacimiento = new Fecha(anion, mesn, dian);
        System.out.println("Fecha de Ingreso a la Empresa");
        System.out.print("Año: ");
        anioi = entrada.nextInt();
        System.out.print("Mes: ");
        mesi = entrada.nextInt();
        System.out.print("Día: ");
        diai = entrada.nextInt();
        fIngreso = new Fecha(anioi, mesi, diai);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("---------DATOS INGRESADOS-------");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println(empleado1.calcularEdad(anio1, mes1, dia1));
        System.out.println(empleado1.calcularTiempo(anio1, mes1, dia1));

    }

}
