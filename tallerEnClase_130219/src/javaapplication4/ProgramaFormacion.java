/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ProgramaFormacion {
    private String nombre;
    private String descripcion;
    private ArrayList<Estudiante> estudiantes;

    public ProgramaFormacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public boolean addEstudiante (Estudiante est){
        return estudiantes.add(est);
    }
    
    public boolean deleteEstudiante (Estudiante est) {
        return estudiantes.remove(est);
    }
}
