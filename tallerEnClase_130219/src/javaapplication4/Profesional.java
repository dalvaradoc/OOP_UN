/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Profesional extends Sede{
    private int progsAltaCalidad;
    
    private ArrayList<ProgramaFormacion> progCont;
    private ArrayList<ProgramaFormacion> progTec;

    public Profesional(int progsAltaCalidad, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.progsAltaCalidad = progsAltaCalidad;
        this.progCont = new ArrayList<>();
        this.progTec = new ArrayList<>();
    }

    public void setProgsAltaCalidad(int progsAltaCalidad) {
        this.progsAltaCalidad = progsAltaCalidad;
    }
    
    public boolean addProgramaCont (String progName, String desc) {
        return progCont.add(new ProgramaFormacion(progName, desc));
    }
    
    public boolean deleteProgramaCont (String progName) {
        for (ProgramaFormacion p : progCont){
            if (p.getNombre() == progName){
                return progCont.remove(p);
            }
        }
        return false;
    }
    
    public boolean addProgramaTec (String progName, String desc) {
        return progTec.add(new ProgramaFormacion(progName, desc));
    }
    
    public boolean deleteProgramaTec (String progName) {
        for (ProgramaFormacion p : progTec){
            if (p.getNombre() == progName){
                return progTec.remove(p);
            }
        }
        return false;
    }
    
    public String getOtherInfo () {
        String otherInfo = "";
        if (progCont.isEmpty()){
            otherInfo += "0,";
        } else {
            otherInfo += progCont.size() + ",";
            for (ProgramaFormacion p : progCont){
                otherInfo += p.getNombre() + ",";
                otherInfo += p.getDescripcion() + ",";
            }
        }
        if (progTec.isEmpty()){
            otherInfo += "0,";
        } else {
            otherInfo += progTec.size() + ",";
            for (ProgramaFormacion p : progTec){
                otherInfo += p.getNombre() + ",";
                otherInfo += p.getDescripcion() + ",";
            }
        }
        return otherInfo;
    }

    @Override
    public String darInformacion() {
        String listInfo = this.getBasicInfo();
        listInfo += this.progsAltaCalidad + ",";
        listInfo += this.programas.size() + ",";
        listInfo += this.getProgramas();
        listInfo += this.getOtherInfo();
        return listInfo;
    }
    
    public ArrayList<ProgramaFormacion> getProgramasCont (){
        return progCont;
    }
    
    public ArrayList<ProgramaFormacion> getProgramasTec (){
        return progTec;
    }
}
