/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args){
        Fecha fNacimiento = new Fecha(29, 8, 2018);
        Fecha fIngreso = new Fecha(29, 8, 2018);
        Empleado empleado = new Empleado("V", "G", fNacimiento);

        empleado.setfIngreso(fIngreso);
        
        System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Fecha de Ingreso: " + empleado.getfIngreso().getDia() + "/" + empleado.getfIngreso().getMes() + "/" + empleado.getfIngreso().getAño());
        
    }
}
