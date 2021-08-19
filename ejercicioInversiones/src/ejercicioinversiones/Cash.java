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
public class Cash implements Asset {
    
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarketValue() {
       return this.amount;
    }

    @Override
    public double getProfit() {
        return 0;
    }

    
}
