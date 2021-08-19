/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Estudiante
 */
public class Ejm1 {

    public Ejm1() {
        
    }
    
    public int Error (int i) throws CustomException {
        if (i == 0)
            throw new CustomException("Dividir x cero");
        return 5/i;
    }
    

}
