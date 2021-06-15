
package test;

import dominio.Curso;

public class TestCurso {
    public static void main(String[] args) {
        Curso cursoA=new Curso();
        //Instancio un objeto
        double [] notas=new double[12];
        llenaNotas(notas);
        //Enviamos el array con notas 
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        cursoA.setPromedio();
        cursoA.setnroEstudaintesEncimaPromedio();
        System.out.println("Promedio del curso: "+cursoA.getPromedio());
        System.out.println("Numero de estudiantes por encima del prmmedio :"+cursoA.getnroEstudiantesEncimaPromedio());
    }
    public static void llenaNotas(double [] notas ){
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }
        
    }
}
