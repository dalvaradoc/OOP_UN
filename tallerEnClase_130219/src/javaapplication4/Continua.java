/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Estudiante
 */
public class Continua extends Sede{
    private String cursoMasPopular;

    public Continua(String cursoMasPopular, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.cursoMasPopular = cursoMasPopular;
    }

    public void setCursoMasPopular(String cursoMasPopular) {
        this.cursoMasPopular = cursoMasPopular;
    }
    
    @Override
    public String darInformacion() {
        String listInfo = this.getBasicInfo();
        listInfo += cursoMasPopular + ",";
        listInfo += this.programas.size() + ",";
        listInfo += this.getProgramas();
        return listInfo;
//Si se quisiera mostrar el curso con mas estudiantes como el mas popular:
//        ProgramaFormacion progPopular = this.programas.get(0);
//        for (ProgramaFormacion p : this.programas){
//            if (p.getEstudiantes().size() > progPopular.getEstudiantes().size()){
//                progPopular = p;
//            }
//        }
//        listInfo += progPopular.getNombre();
    }
    
}
