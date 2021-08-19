/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinversiones;

/**
 *
 * @author Estudiante
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private String email;
    private Asset[] assets;

    public Cliente(int id, String nombre, String apellido, int telefono, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.assets = new Asset[10];
    }
    
    public boolean addAssets (Asset asset) {
        for (Asset a : assets){
            if (a != null){
                a = asset;
                return true;
            }
        }
        return false;
    }

    public int getEdad() {
        return edad;
    }

    public Asset[] getAssets() {
        return assets;
    }    
    
    
}
