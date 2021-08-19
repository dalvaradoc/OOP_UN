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
public class Stock extends ShareAsset{
    protected int totalShares;

    public Stock(int totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue() {
        return this.totalShares * this.currentPrice;
    }

    @Override
    public double getProfit() {
        return (this.totalShares * this.currentPrice) - this.totalCost;
    }
    
    
}
