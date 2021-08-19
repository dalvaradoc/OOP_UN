/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionparcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ArrayList<Person> personas = new ArrayList<>();
        Vet vet = new Vet();
        
        
        
        File file = new File("pets.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        Scanner sc = new Scanner(System.in);
        
        boolean ciclo = true;
        int opc;
        
        while (ciclo){
            System.out.println("Seleccione una opcion");
            System.out.println("1. Cargar informacion del archivo de texto");
            System.out.println("2. Guardar informacion al archivo de texto");
            System.out.println("3. Remover mascota con id");
            System.out.println("4. Lista mascotas por tipo");
            System.out.println("5. Finalizar y listar las mascotas");
            
            String none;
            
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    loadData (vet, personas, file);
                    break;
                case 2:
                    saveData (vet);
                    break;
                case 3:
                    none = sc.nextLine();
                    String id = sc.nextLine();
                    manageVet(vet, "Remover " + id);
                    break;
                case 4:
                    System.out.println("Seleccione que tipo");
                    
                    readPetsTipo();
                case 5:
                    readPets (vet);
                    saveData (vet);
                    break;
                    break;
            }
        }
        
    }
    
    public void loadData (Vet vet, ArrayList<Person> prs, File file) throws FileNotFoundException{
        Scanner in = new Scanner(file);
        while (in.hasNextLine()){
            String[] info = in.nextLine().split(" ");
            String type = info[0];
            switch (type) {
                case "Dog":
                    loadDog(info);
                    break;
                case "Cat":
                    loadCat(info);
                    break;
                case "Hamster":
                    loadHamster(info);
                    break;
            }
        }
    }
    
    public void readPets (Vet vet) {
        vet.showPets();
    }
//    + readPets (Vet v) : void
//+ manageVet (Vet v, String action) : void
//+ saveData () : boolean
//+ loadData () : boolean
}
