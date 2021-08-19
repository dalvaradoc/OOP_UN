/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javaapplication4.Continua;
import javaapplication4.Profesional;
import javaapplication4.ProgramaFormacion;
import javaapplication4.Sede;
import javaapplication4.Tecnologica;
import javaapplication4.Universidad;

/**
 *
 * @author Alejandro
 */
public class Menu {
    
    Universidad u;

    public Menu(Universidad u) throws FileNotFoundException {
        this.u = u;        
        Scanner teclado = new Scanner(System.in);
        boolean ciclo = true;
        while (ciclo){
            System.out.println("Escriba el numero de la opcion que desea realizar.");
            System.out.println("1. Cargar Informacion");
            System.out.println("2. Guardar Informacion");
            System.out.println("3. Registrar nueva Sede");
            System.out.println("4. Eliminar Sede");
            System.out.println("5. Modificar Sede");
            System.out.println("6. Consultar Sede");
            System.out.println("7. Listar informacion de todas las Sedes");
            System.out.println("0. Cerrar el menu");
            int opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Cargando Informacion...");
                    u.cargarInformacion();
                    break;
                case 2:
                    System.out.println("Guardando Informacion...");
                    u.guardarInformacion();
                    break;
                case 3:
                    System.out.println("Ingrese que tipo de sede desea crear");
                    System.out.println("1. Profesional");
                    System.out.println("2. Continua");
                    System.out.println("3. Tecnologica");
                    System.out.println("0. Volver");
                    int tipo = teclado.nextInt();
                    if (tipo == 0){
                        break;
                    }
                    System.out.println("Ingrese el nombre de la sede: ");
                    String none = teclado.nextLine();
                    String nombreSede = teclado.nextLine();
                    
                    System.out.println("Ingrese la direccion de la sede: ");
                    String direccionSede = teclado.nextLine();
                    System.out.println("Ingrese el telefono de la sede: ");
                    int telefonoSede = teclado.nextInt();
                    System.out.println("Ingrese el area de la sede: ");
                    double areaSede = Double.parseDouble(teclado.next());
                    switch (tipo){
                        case 1:
                            System.out.println("Cuantos programas con Alta Calidad: ");
                            int progAltaCalidadSede = teclado.nextInt();
                            Profesional newSedeP = new Profesional(progAltaCalidadSede, nombreSede, direccionSede, telefonoSede, areaSede);
                            
                            System.out.println("Cuantos programas tiene la sede: ");
                            int indexP = teclado.nextInt();
                            none = teclado.nextLine();
                            for (int i = 0; i < indexP; i++){
                                System.out.println("Nombre del programa: ");
                                String nombreProgP = teclado.nextLine();
                                System.out.println("Descripcion del programa: ");
                                String descProgP = teclado.nextLine();
                                newSedeP.addPrograma(nombreProgP, descProgP);
                            }
                            
                            System.out.println("Cuantos programas de educacion continua tiene la sede: ");
                            int indexPC = teclado.nextInt();
                            none = teclado.nextLine();
                            for (int i = 0; i < indexPC; i++) {
                                System.out.println("Nombre del programa: ");
                                String nombrePC = teclado.nextLine();
                                System.out.println("Descripcion del programa: ");
                                String descPC = teclado.nextLine();
                                newSedeP.addProgramaCont(nombrePC, descPC);
                            }
                            
                            System.out.println("Cuantos programas de educacion tecnologica tiene la sede: ");
                            int indexPT = teclado.nextInt();
                            none = teclado.nextLine();
                            for (int i = 0; i < indexPT; i++) {
                                System.out.println("Nombre del programa: ");
                                String nombrePT = teclado.nextLine();
                                System.out.println("Descripcion del programa: ");
                                String descPT = teclado.nextLine();
                                newSedeP.addProgramaTec(nombrePT, descPT);
                            }
                            
                            u.regSede(newSedeP);
                            break;
                        case 2:
                            System.out.println("Cual es el curso mas popular: ");
                            String cursoMasPopularSede = teclado.nextLine();
                            Continua newSedeC = new Continua(cursoMasPopularSede, nombreSede, direccionSede, telefonoSede, areaSede);
                            
                            System.out.println("Cuantos cursos tiene la sede: ");
                            int indexC = teclado.nextInt();
                            none = teclado.nextLine();
                            for (int i = 0; i < indexC; i++){
                                System.out.println("Nombre del curso: ");
                                String nombreProgC = teclado.nextLine();
                                System.out.println("Descripcion del curso: ");
                                String descProgC = teclado.nextLine();
                                newSedeC.addPrograma(nombreProgC, descProgC);
                            }
                            
                            u.regSede(newSedeC);
                            break;
                        case 3:
                            System.out.println("Cuantos estudiantes hay matriculados: ");
                            int estudMatriculadosSede = teclado.nextInt();
                            Tecnologica newSedeT = new Tecnologica(estudMatriculadosSede, nombreSede, direccionSede, telefonoSede, areaSede);
                            
                            System.out.println("Cuantos programas tiene la sede: ");
                            int indexT = teclado.nextInt();
                            none = teclado.nextLine();
                            for (int i = 0; i < indexT; i++){
                                System.out.println("Nombre del programa: ");
                                String nombreProgT = teclado.nextLine();
                                System.out.println("Descripcion del programa: ");
                                String descProgT= teclado.nextLine();
                                newSedeT.addPrograma(nombreProgT, descProgT);
                            }
                            u.regSede(newSedeT);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la sede a eliminar: ");
                    none = teclado.nextLine();
                    String sedeAEliminar = teclado.nextLine();
                    if (u.eliminarSede(sedeAEliminar)){
                        System.out.println("Se elimino la sede");
                    } else {
                        System.out.println("No se elimino la sede " + sedeAEliminar);
                    }
                    u.guardarInformacion();
                    break;
                case 5:
                    none = teclado.nextLine();
                    System.out.println("Ingrese el nombre de la sede a modificar.");
                    String nombreSMod = teclado.nextLine();
                    Sede sedeMod = u.getSede(nombreSMod);
                    if (sedeMod != null) {
                        boolean cicloMod = true;
                        while (cicloMod){
                            int opcMod;
                            String tipoSedeMod = sedeMod.getClass().getSimpleName();
                            System.out.println("Seleccione que quiere modificar:");
                            System.out.println("1. Nombre");
                            System.out.println("2. Direccion");
                            System.out.println("3. Telefono");
                            System.out.println("4. Area");
                            
                            Profesional sedeModP = null;
                            Continua sedeModC = null;
                            Tecnologica sedeModT = null;
                            
                            switch (tipoSedeMod){
                                case "Profesional":
                                    System.out.println("5. Programas Alta calidad");
                                    sedeModP = (Profesional)sedeMod;
                                    break;
                                case "Continua":
                                    System.out.println("5. Curso mas Popular");
                                    sedeModC = (Continua)sedeMod;
                                    break;
                                case "Tecnologica":
                                    System.out.println("5. Estudiantes Matriculados");
                                    sedeModT = (Tecnologica)sedeMod;
                                    break;
                            }
                            System.out.println("6. Añadir Programa");
                            System.out.println("7. Eliminar Programa");

                            if (tipoSedeMod.equals("Profesional")){
                                System.out.println("8. Añadir Curso de educacion continua");
                                System.out.println("9. Añadir Curso de educacion continua");
                                System.out.println("10. Añadir programa Tecnologico");
                                System.out.println("11. Eliminar programa Tecnologico");
                            }
                            
                            System.out.println("0. Volver");
                            
                            opcMod = teclado.nextInt();
                            none = teclado.nextLine();
                            
                            switch (opcMod){
                                case 1:
                                    System.out.println("Ingrese un nuevo nombre: ");
                                    String newNombre = teclado.nextLine();
                                    sedeMod.setNombre(newNombre);
                                    break;
                                case 2:
                                    System.out.println("Ingrese una nueva direccion: ");
                                    String newDireccion = teclado.nextLine();
                                    sedeMod.setDireccion(newDireccion);
                                    break;
                                case 3:
                                    System.out.println("Ingrese un nuevo telefono: ");
                                    int newTelefono = teclado.nextInt();
                                    sedeMod.setTelefono(newTelefono);
                                    break;
                                case 4:
                                    System.out.println("Ingrese una nueva area: ");
                                    double newArea = Double.parseDouble(teclado.next());
                                    sedeMod.setArea(newArea);
                                    break;
                                case 5:
                                    try{
                                        switch (tipoSedeMod){
                                            case "Profesional":
                                                System.out.println("Ingrese cuantos programas de Alta calidad tiene: ");
                                                int newProgAltaCalidad = teclado.nextInt();
                                                sedeModP.setProgsAltaCalidad(newProgAltaCalidad);
                                                sedeMod = sedeModP;
                                                break;
                                            case "Continua":
                                                System.out.println("Ingrese el Curso mas Popular");
                                                String newCursoPopular = teclado.nextLine();
                                                sedeModC.setCursoMasPopular(newCursoPopular);
                                                sedeMod = sedeModC;
                                                break;
                                            case "Tecnologica":
                                                System.out.println("Ingrese cuantos estudiantes hay matriculados");
                                                int newEstudMatriculados = teclado.nextInt();
                                                sedeModT.setEstudMatriculados(newEstudMatriculados);
                                                sedeMod = sedeModT;
                                                break;
                                        }
                                    } catch (NullPointerException e){
                                        System.out.println("Ocurrio un error añadiendo programas");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Ingrese el nombre del nuevo programa: ");
                                    String newProgramaName = teclado.nextLine();
                                    System.out.println("Ingrese la descripcion del nuevo programa");
                                    String newProgramaDesc = teclado.nextLine();
                                    sedeMod.addPrograma(newProgramaName, newProgramaDesc);
                                    break;
                                case 7:
                                    System.out.println("Ingrese el nombre del programa a eliminar: ");
                                    String programaAEliminar = teclado.nextLine();
                                    sedeMod.deletePrograma(programaAEliminar);
                                    break;
                                case 8:
                                    System.out.println("Ingrese el nombre del nuevo curso de educacion continua: ");
                                    String newProgramaNameC = teclado.nextLine();
                                    System.out.println("Ingrese la descripcion del nuevo curso de educacion continua: ");
                                    String newProgramaDescC = teclado.nextLine();
                                    sedeModP.addProgramaCont(newProgramaNameC, newProgramaDescC);
                                    sedeMod = sedeModP;
                                    break;
                                case 9:
                                    System.out.println("Ingrese el nombre del curso de educacion continua a eliminar: ");
                                    String programaAEliminarC = teclado.nextLine();
                                    sedeModP.deleteProgramaCont(programaAEliminarC);
                                    sedeMod = sedeModP;
                                    break;
                                case 10:
                                    System.out.println("Ingrese el nombre del nuevo programa tecnologico: ");
                                    String newProgramaNameT = teclado.nextLine();
                                    System.out.println("Ingrese la descripcion del nuevo programa tecnologico: ");
                                    String newProgramaDescT = teclado.nextLine();
                                    sedeModP.addProgramaTec(newProgramaNameT, newProgramaDescT);
                                    sedeMod = sedeModP;
                                    break;
                                case 11:
                                    System.out.println("Ingrese el nombre del programa tecnologico a eliminar: ");
                                    String programaAEliminarT = teclado.nextLine();
                                    sedeModP.deleteProgramaTec(programaAEliminarT);
                                    sedeMod = sedeModP;
                                    break;
                                case 0:
                                    cicloMod = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("No se encontro una sede con ese nombre");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la sede a consultar: ");
                    none = teclado.nextLine();
                    String sedeAConsultar = teclado.nextLine();
                    Sede s = u.getSede(sedeAConsultar);
                    if (s != null){
                        String basicInfoS[] = s.darInformacion().split(",");
                        System.out.println("Tipo: " + basicInfoS[0]);
                        System.out.println("Nombre: " + basicInfoS[1]);
                        System.out.println("Direccion: " + basicInfoS[2]);
                        System.out.println("Telefono: " + basicInfoS[3]);
                        System.out.println("Area: " + basicInfoS[4]);
                        switch (basicInfoS[0]){
                            case "Profesional":
                                System.out.println("Programas Alta Calidad: " + basicInfoS[5]);
                                break;
                            case "Continua":
                                System.out.println("Curso Mas Popular: " + basicInfoS[5]);
                                break;
                            case "Tecnologica":
                                System.out.println("Estudiantes Matriculados: " + basicInfoS[5]);
                                break;
                        }
                        try {
                        String[] programasS = s.getProgramas().split(",");
                        System.out.println("Programas: ");
                        for (int i = 0; i < programasS.length; i += 2){
                            System.out.println("\tNombre: " + programasS[i]);
                            System.out.println("\tDescripcion: " + programasS[i+1]);
                        }
                        } catch (NullPointerException e){
                            System.out.println("Ocurrio un error listando los programas");
                        }

                        if (basicInfoS[0].equals("Profesional")){
                            Profesional p = (Profesional)s;
                            System.out.println("Otros programas:");
                            ArrayList<ProgramaFormacion> progConts = p.getProgramasCont();
                            if (!progConts.isEmpty()){
                                System.out.println("Cursos educacion continua: ");
                                for (ProgramaFormacion pc : progConts){
                                    System.out.println("\tNombre: " + pc.getNombre());
                                    System.out.println("\tDescripcion: " + pc.getDescripcion());
                                }
                            }
                            ArrayList<ProgramaFormacion> progTecS = p.getProgramasTec();
                            if (!progTecS.isEmpty()){
                                System.out.println("Programas tecnologicos: ");
                                for (ProgramaFormacion pt : progTecS){
                                    System.out.println("\tNombre: " + pt.getNombre());
                                    System.out.println("\tDescripcion: " + pt.getDescripcion());
                                }
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 7:
                    listarInformacion ();
                    break;
                case 0:
                    ciclo = false;
                    break;
            }
            System.out.println("--------------");
        }
    }
    
    private void listarInformacion () {
        ArrayList<Sede> sedesU = u.getAllSedes();
        for (Sede s : sedesU){
            String basicInfoS[] = s.darInformacion().split(",");
            System.out.println("Tipo: " + basicInfoS[0]);
            System.out.println("Nombre: " + basicInfoS[1]);
            System.out.println("Direccion: " + basicInfoS[2]);
            System.out.println("Telefono: " + basicInfoS[3]);
            System.out.println("Area: " + basicInfoS[4]);
            switch (basicInfoS[0]){
                case "Profesional":
                    System.out.println("Programas Alta Calidad: " + basicInfoS[5]);
                    break;
                case "Continua":
                    System.out.println("Curso Mas Popular: " + basicInfoS[5]);
                    break;
                case "Tecnologica":
                    System.out.println("Estudiantes Matriculados: " + basicInfoS[5]);
                    break;
            }
            try {
            String[] programasS = s.getProgramas().split(",");
            System.out.println("Programas: ");
            for (int i = 0; i < programasS.length; i += 2){
                System.out.println("\tNombre: " + programasS[i]);
                System.out.println("\tDescripcion: " + programasS[i+1]);
            }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Ocurrio un error listando los programas");
            }
            
            if (basicInfoS[0].equals("Profesional")){
                Profesional p = (Profesional)s;
                System.out.println("Otros programas:");
                ArrayList<ProgramaFormacion> progConts = p.getProgramasCont();
                if (!progConts.isEmpty()){
                    System.out.println("Cursos educacion continua: ");
                    for (ProgramaFormacion pc : progConts){
                        System.out.println("\tNombre: " + pc.getNombre());
                        System.out.println("\tDescripcion: " + pc.getDescripcion());
                    }
                }
                ArrayList<ProgramaFormacion> progTecS = p.getProgramasTec();
                if (!progTecS.isEmpty()){
                    System.out.println("Programas tecnologicos: ");
                    for (ProgramaFormacion pt : progTecS){
                        System.out.println("\tNombre: " + pt.getNombre());
                        System.out.println("\tDescripcion: " + pt.getDescripcion());
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
