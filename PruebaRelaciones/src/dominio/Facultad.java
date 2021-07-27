/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Facultad {
    private String nombre;
    private ArrayList<Universidad> universidad;
    private Carrera [] carreas;
    private Director director;

    public Facultad(String nombre, Carrera[] carreas, Director director) {
        universidad=new ArrayList<>();
        this.nombre = nombre;
        this.carreas = carreas;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Universidad> getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ArrayList<Universidad> universidad) {
        this.universidad = universidad;
    }

    public Carrera[] getCarreas() {
        return carreas;
    }

    public void setCarreas(Carrera[] carreas) {
        this.carreas = carreas;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
    
    
}
