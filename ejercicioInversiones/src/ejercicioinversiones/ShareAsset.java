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
public abstract class ShareAsset implements Asset{
    
    protected String symbol;
    protected double totalCost;
    protected double currentPrice;

    public ShareAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }
    
    
    
    public abstract double getMarketValue();
    public abstract double getProfit();
    
}
