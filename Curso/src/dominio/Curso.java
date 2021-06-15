
package dominio;

public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;
    public Curso(){
        notas =new double[12];
    }
    public void setNotas(double [] notas){
        this.notas=notas;
    }
    public void mostrarNotas(){
        for (int i=0;i<12;i++){
            System.out.println(this.notas[i]);
        }
    }
    //caclculos actualice el promedio
    public void setPromedio(){
        double promedio =0;
        double suma=0;
        for(int i=0;i<12;i++){
            suma+=notas[i];
        }
        promedio=suma/12;
        this.promedio=promedio;
    }
    public void setnroEstudaintesEncimaPromedio(){
        int estudianes=0;
        int c=0;
        for(int i=0;i<12;i++){
            if(notas[i]>promedio){
                c++;
                estudianes=c;
            }
        }
        this.estudiantesEncimaPromedio=estudianes;
    }
    //Aqui solo deuelve valores
    public double getPromedio(){
        return  this.promedio;
    }
    public int getnroEstudiantesEncimaPromedio(){
        return this.estudiantesEncimaPromedio;
    }
    
}
