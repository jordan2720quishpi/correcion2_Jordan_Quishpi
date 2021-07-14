
package dominio;
public class Empleado {

    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    public String calcularEdad(int anio, int mes, int dia) {

        int anios, meses, dias;
        if (fechaN.getDia() > dia) {
            dia = dia + 30;
            mes = mes - 1;
            if (mes <= 0) {
                anio = anio - 1;
                mes = 12;
            }
        }
        dias = dia - fechaN.getDia();
        if (mes < fechaN.getMes()) {
            mes = mes + 12;
            anio = anio - 1;
        }
        meses = mes - fechaN.getMes();
        anios = anio - fechaN.getAnio();
        return "Fecha de nacimiento : " + this.fechaN + " Su edad actual es: " + anios + " años " + meses + " meses " + dias + " dias ";
    }

    public String calcularTiempo(int anio, int mes, int dia) {
        int anios, meses, dias;
        if (fechaI.getDia() > dia) {
            dia = dia + 30;
            mes = mes - 1;
            if (mes <= 0) {
                anio = anio - 1;
                mes = 12;
            }
        }
        dias = dia - fechaI.getDia();
        if (mes < fechaI.getMes()) {
            mes = mes + 12;
            anio = anio - 1;
        }
        meses = mes - fechaI.getMes();
        anios = anio - fechaI.getAnio();
        return "Fecha de Ingreso " + this.fechaI + " Su tiempo es  " + anios + " años, " + meses + " meses " + dias + " dias ";
    }
    @Override
    public String toString() {
        return this.nombre + "\n" + this.getFechaN() + "\n" + this.fechaI;
    }
    
}
