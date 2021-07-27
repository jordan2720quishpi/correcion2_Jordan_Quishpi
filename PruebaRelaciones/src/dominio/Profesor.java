
package dominio;


public class Profesor {
    private String nombre;
    private int edad;
    private Facultad facultad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Profesor(String nombre, int edad, Facultad facultad) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
    }
    
}
