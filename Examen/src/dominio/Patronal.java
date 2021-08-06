package dominio;

import java.util.Scanner;

public class Patronal extends Jubilado {
 

    public Patronal(String cedula, String nombres, double salirio_base, int numero_anios) {
        super(cedula, nombres, salirio_base, numero_anios);
 
    }
    @Override
    public String verDatos() {
        return super.verDatos();
    }

    @Override
    public double calcularPension() {
        Scanner entrada = new Scanner(System.in);
        String emp;
        double pi = this.getPensionInicial();
        double bono = this.getSalirio_base()*1/100;
        double pension = pi + bono;
        System.out.println("Ingrse que tipo de empresa pertenece Publica<<publica>> Privda <<privada>>");
        emp=entrada.nextLine();
        if (emp =="publica") {
            pension = pension + (pension * 5 / 100);
        } else if (emp =="privada") {
            pension = pension + (pension * 10 / 100);
        }
        return pension;
    }
}
