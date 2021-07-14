
package dominio;

public class Estudiantes{
    private String nombre;
    private char sexo;
    private double notas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
    

    public Estudiantes(String nombre, char sexo, double notas) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.notas =notas;
    }
    public String getNombre() {
        return nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public double getNotas() {
        return notas;
    }
     @Override
    public String toString(){
        return this.nombre+"  "+this.sexo+" "+this.notas;
    }
}
