/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


public class Estudiantes {
    
    private String nombre;
    private char sexo;
    private double notas;

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
