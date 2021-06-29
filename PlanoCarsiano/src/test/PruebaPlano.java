package test;

import dominio.Plano;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PruebaPlano {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        int movx = 0, movy =0;
        System.out.println("La cordenadas iniciales son:    x=" + movx + "\t" + "y=" + movy);
        int n;
        do {
            System.out.print("Ingrese la cantidad de movimientos que desea realizar: ");
            n = datos.nextInt();
            if (n < 1) {
                System.out.println("Dato no valido");
            }
        } while (n < 1);
        //Creacion del objeto 
        Plano[] plano = new Plano[n];
        movimientos(plano);
    }

    public static void movimientos(Plano coor[]) {
        int movx = 0;
        int movy = 0;
        double d1=0,d2=0,d3=0,d4=0,dt=0;
        int numMov;
        double acu1 = 0,acu2=0,acu3=0,acu4=0;
        coor[0] = new Plano(movx,movy);
        for (int i = 0; i < coor.length; i++) {
            datos.nextLine();
            System.out.println("");
            System.out.println("Ingrese la distancia que desea realizar No " + (i + 1));
            numMov = datos.nextInt();
            int valorEntero = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
            switch (valorEntero) {
                case 1:
                    movx = movx - numMov;
                    System.out.println("Movimiento hacia la Izquierda");
                    d1 = sqrt(pow((movx),2) + pow((movy), 2));
                    System.out.printf("La distancia del movimiento  es : %.4f\n",d1);
                    acu1+=d1;
                    break;
                case 2:
                    movy = movy + numMov;
                    System.out.println("Movimiento hacia Arriba");
                    d2 = sqrt(pow((movx),2) + pow((movy), 2));
                    System.out.printf("La distancia del movimiento  es : %.4f\n",d2);
                    acu2+=d2;
                    break;
                case 3:
                    movy = movy - numMov;
                    System.out.println("Movimiento hacia Abajo");
                    d3 = sqrt(pow((movx),2) + pow((movy), 2));
                    System.out.printf("La distancia del movimiento  es : %.4f\n",d3);
                    acu3+=d3;
                    break;
                case 4:
                    movx = movx + numMov;
                    System.out.println("Movimiento hacia la Derecha");
                    d4 = sqrt(pow((movx),2) + pow((movy), 2));
                    System.out.printf("La distancia del movimiento  es : %.4f\n",d4);
                    acu4+=d4;
                default:
                    break;
            }
            System.out.println("La coordenada es : ");
            coor[i] = new Plano(movx, movy);
            System.out.println(coor[i]);
        }
        System.out.println("");
        dt = acu1+acu2+acu3+acu4;
        System.out.printf("La distancia total del movimeinto es : %.4f\n",dt);
    }
}
