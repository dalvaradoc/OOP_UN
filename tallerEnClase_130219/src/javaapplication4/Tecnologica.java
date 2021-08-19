/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Alejandro
 */
public class Tecnologica extends Sede{
    private int estudMatriculados;

    public Tecnologica(int estudMatriculados, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.estudMatriculados = estudMatriculados;
    }

    public void setEstudMatriculados(int estudMatriculados) {
        this.estudMatriculados = estudMatriculados;
    }

    @Override
    public String darInformacion() {
        String listInfo = this.getBasicInfo();
        listInfo += estudMatriculados + ",";
        listInfo += programas.size() + ",";
        listInfo += this.getProgramas();
        return listInfo;
    }

    

    
}
