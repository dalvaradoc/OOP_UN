/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double area;
    protected ArrayList<ProgramaFormacion> programas;

    public Sede(String nombre, String direccion, int telefono, double area) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.area = area;
        this.programas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public boolean addPrograma (String progName, String desc) {
        return programas.add(new ProgramaFormacion(progName, desc));
    }
    
    public boolean deletePrograma (String progName) {
        for (ProgramaFormacion p : programas){
            if (p.getNombre().equals(progName)){
                return programas.remove(p);
            }
        }
        return false;
    }
    
    public String getProgramas () {
        String listProg = "";
        for (ProgramaFormacion p : programas){
            listProg += p.getNombre() + ",";
            listProg += p.getDescripcion() + ",";
        }
        return listProg;
    }
    
    public String getBasicInfo () {
        String listInfo = "";
        listInfo += this.getClass().getSimpleName() + ",";
        listInfo += this.nombre + ",";
        listInfo += this.direccion + ",";
        listInfo += this.telefono + ",";
        listInfo += this.area + ",";
        return listInfo;
    }
    
    public abstract String darInformacion ();
}
