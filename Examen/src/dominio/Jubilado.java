
package dominio;


public class Jubilado {
    
    private String cedula;
    private String nombres;
    private double salirio_base;
    private int numero_anios;

    public Jubilado(String cedula, String nombres, double salirio_base, int numero_anios) {
        
        this.cedula = cedula;
        this.nombres = nombres;
        this.salirio_base = salirio_base;
        this.numero_anios = numero_anios;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSalirio_base() {
        return salirio_base;
    }

    public void setSalirio_base(double salirio_base) {
        this.salirio_base = salirio_base;
    }

    public int getNumero_anios() {
        return numero_anios;
    }

    public void setNumero_anios(int numero_anios) {
        this.numero_anios = numero_anios;
    }
   public String verDatos(){
        return this.nombres+" "+this.cedula+ " "+this.salirio_base+" "+this.numero_anios;  
    }
    
}
