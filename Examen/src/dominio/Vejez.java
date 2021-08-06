
package dominio;


public class Vejez extends Jubilado{
    
    public Vejez(String cedula, String nombres, double salirio_base, int numero_anios) {
        super(cedula, nombres, salirio_base, numero_anios);
    }
     @Override
    public String verDatos(){
       
       return super.verDatos();
    }

    @Override
    public double calcularPension() {
        float pi=(float) this.getSalirio_base();
        float bono=(float) (this.getSalirio_base()*15/100);
        return pi+bono;
    }
    

}
