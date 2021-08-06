/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

public class Discapacidad  extends Jubilado{
    private double dis;

    public Discapacidad(String cedula, String nombres, double salirio_base, int numero_anios,double dis) {
        super(cedula, nombres, salirio_base, numero_anios);
        this.dis=dis;
    }
   public double getDis() {
        return dis;
    }

    public void setDis(double dis) {
        this.dis = dis;
    }
    @Override
    public String verDatos(){
       return super.verDatos();
    }
    @Override
    public double calcularPension(){
        double pi = this.getPensionInicial();
        double bono = this.getSalirio_base()* this.dis / 100;
        return pi + bono;
    }
}
