/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Universidad {
    private ArrayList<Sede> sedes;
    private File savefile;

    public Universidad(String pathfile) throws IOException {
        this.savefile = new File(pathfile);
        if (!savefile.exists()){
            savefile.createNewFile();
        }
        this.sedes = new ArrayList<>();
    }
    
    private void cargarProfesional (Scanner sc) {
        String nombreF = sc.next();
        String direccionF = sc.next();
        int telefonoF = sc.nextInt();
        double areaF = Double.parseDouble(sc.next());
        int progAltaCalidadF = sc.nextInt();
        
        int progsIndex = sc.nextInt();
        
        Profesional newSede = new Profesional(progAltaCalidadF, nombreF, direccionF, telefonoF, areaF);
        
        for (int i = 0; i < progsIndex; i++){
            String nombreProgF = sc.next();
            String descProgF = sc.next();
            newSede.addPrograma(nombreProgF, descProgF);
        }
        
        int progsIndexCont = sc.nextInt();
        
        for (int i = 0; i < progsIndexCont; i++){
            String nombreProgF = sc.next();
            String descProgF = sc.next();
            newSede.addProgramaCont(nombreProgF, descProgF);
        }
        
        int progsIndexTec = sc.nextInt();
        
        for (int i = 0; i < progsIndexTec; i++){
            String nombreProgF = sc.next();
            String descProgF = sc.next();
            newSede.addProgramaTec(nombreProgF, descProgF);
        }
        
        this.sedes.add(newSede);
    }
    
    private void cargarContinua (Scanner sc) {
        String nombreF = sc.next();
        String direccionF = sc.next();
        int telefonoF = sc.nextInt();
        double areaF = Double.parseDouble(sc.next());
        String cursoMasPopularF = sc.next();
        
        int progsIndex = sc.nextInt();
        
        Continua newSede = new Continua(cursoMasPopularF, nombreF, direccionF, telefonoF, areaF);
        
        for (int i = 0; i < progsIndex; i++){
            String nombreProgF = sc.next();
            String descProgF = sc.next();
            newSede.addPrograma(nombreProgF, descProgF);
        }
        
        this.sedes.add(newSede);
    }
    
    private void cargarTecnologica (Scanner sc) {
        String nombreF = sc.next();
        String direccionF = sc.next();
        int telefonoF = sc.nextInt();
        double areaF = Double.parseDouble(sc.next());
        int estudMatriculadosF  = sc.nextInt();
        
        int progsIndex = sc.nextInt();
        
        Tecnologica newSede = new Tecnologica(estudMatriculadosF, nombreF, direccionF, telefonoF, areaF);
        
        for (int i = 0; i < progsIndex; i++){
            String nombreProgF = sc.next();
            String descProgF = sc.next();
            newSede.addPrograma(nombreProgF, descProgF);
        }
        
        this.sedes.add(newSede);
    }
    
    public boolean cargarInformacion () throws FileNotFoundException{
        Scanner sc = new Scanner(savefile);
        sc.useDelimiter(",");
        while (sc.hasNextLine()) {
            String type = sc.next().trim();
            switch (type) {
                case "Profesional":
                    cargarProfesional(sc);
                    break;
                case "Continua":
                    cargarContinua (sc);
                    break;
                case "Tecnologica":
                    cargarTecnologica (sc);
                    break;
            }   
        }
        sc.close();
        return true;
    }
    
    public boolean guardarInformacion () throws FileNotFoundException {
        PrintStream out = new PrintStream(savefile);
        out.print(this.getAllInfo());
        out.flush();
        out.close();
        return true;
    }
    
    public String getAllInfo () {
        String allInfo = "";
        for (Sede s : sedes){
            allInfo += s.darInformacion() + "\r\n";
        }
        return allInfo;
    }
    
    public boolean regSede (Sede s) {
        return sedes.add(s);
    }
    
    public boolean eliminarSede (String sname){
        for (Sede s : sedes){
            if (s.nombre.equals(sname)){
                return sedes.remove(s);
            }
        }
        return false;
    }
    
    public boolean modifSede (String sname, Sede news){
        for (Sede s : sedes){
            if (s.nombre == sname){
                return sedes.set(sedes.indexOf(s), news) != null;
            }    
        }
        return false;
    }
    
    public Sede getSede (String sname) {
        for (Sede s : sedes){
            if (s.nombre.equals(sname)){
                return s;
            }
        }
        return null;
    }
    
    
    public ArrayList<Sede> getAllSedes () {
        return this.sedes;
    }
    
    public void consultarSede (String sname) {
        for (Sede s : sedes){
            if (s.nombre == sname){
                System.out.println(s.darInformacion());
            }
        }
    }

}
