package operaciones;

public class Matematica {

    int a;
    int b;
    public Matematica(int a,int b){
        this.a=a;
        this.b=b;
    }
    

    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("El resultado es  " + resultado);
    }

    public int sumar1() {
        int resultado = this.a + this.b;
        return resultado;
    }

    public void sumar2(int a, int b) {
        this.a=a;
        this.b=b;
        System.out.println("El resultado con parametros es = "+(this.a+this.b));

    }
}
