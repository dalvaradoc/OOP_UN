/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Estudiante
 */
public class Chasis {
    private int x;
    private int y;

    public Chasis(int x, int y) {
        this.x = x;
        this.y = y+20;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public void mover () {
        this.x++;
    }
}
