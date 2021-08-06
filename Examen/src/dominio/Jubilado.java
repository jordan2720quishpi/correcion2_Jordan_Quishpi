
package dominio;


public abstract class Jubilado {
    
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
    public double getPensionInicial(){
        
        if(this.numero_anios>0 && this.numero_anios<11){
            return this.salirio_base*50/100;
        }else if(this.numero_anios>10 && this.numero_anios<21){
            return this.salirio_base*60/100;
        }else if(this.numero_anios>20 && this.numero_anios<31){
            return this.salirio_base*70/100;
        }else if(this.numero_anios>30 && this.numero_anios<36){
            return this.salirio_base*80/100;
        }else if(this.numero_anios>35 && this.numero_anios<40){
            return this.salirio_base*90/100;
        }else if(this.numero_anios>39){
            return this.salirio_base*100/100;
        }
        return 0;
    }

    public void setNumero_anios(int numero_anios) {
        this.numero_anios = numero_anios;
    }
   public String verDatos(){
        return "Nombre: "+this.nombres+"\nCedula: "+this.cedula+ " \nSalario: "+this.salirio_base+" \nAnios: "+this.numero_anios;  
    }
    public abstract double calcularPension();
}
