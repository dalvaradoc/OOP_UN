/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinversiones;

import com.sun.security.ntlm.Client;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Cliente> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient (int id, String nombre, String apellido, int telefono, int edad, String email) {
        Cliente client = new Cliente(id, nombre, apellido, telefono, edad, email);
        clients.put(id, client);
        if (clients.containsKey(id)){
            return true;
        }
        return false;
    }
    
    public boolean addStock (String symbol, double totalCost, double currentPrice, int totalShare) {
        Asset asset = new Stock(totalShare, symbol, totalCost, currentPrice);
        return assets.add(asset);
    }
    
    public boolean addMutualFund (String symbol, double totalCost, double currentPrice, int totalShare) {
        Asset asset = new MutualFund(totalShare, symbol, totalCost, currentPrice);
        return assets.add(asset);
    }
    
    public boolean addDividendStock (double dividends, String symbol, double totalCost, double currentPrice, int totalShare) {
        Asset asset = new DividendStock(dividends, totalShare, symbol, totalCost, currentPrice);
        return assets.add(asset);
    }
    
    public boolean addCash (double amount) {
        Asset asset = new Cash(amount);
        return assets.add(asset);
    }
    
    public boolean addAsset2Client (Asset asset, int id){
        return clients.get(id).addAssets(asset);
    }
    
    public double getAllMarketValue () {
        double marketValue = 0;
        for (Cliente c : clients.values()){
            for (Asset a : c.getAssets()){
                marketValue += a.getMarketValue();
            }
        }
        return marketValue;
    }
    
    public double getAllProfit () {
        double profit = 0;
        for (Cliente c : clients.values()){
            for (Asset a : c.getAssets()){
                profit += a.getProfit();
            }
        }
        return profit;
    }
    
    public double getAllMarketValuePerType (Asset asset){
        double marketValue = 0;
        for (Cliente c : clients.values()){
            for (Asset a : c.getAssets()){
                if (a.getClass() == asset.getClass()){
                    marketValue += a.getMarketValue();
                }
            }
        }
        return marketValue;
    }
    
    public double getAllProfitPerType (Asset asset) {
        double profit = 0;
        for (Cliente c : clients.values()){
            for (Asset a : c.getAssets()){
                if (a.getClass() == asset.getClass()){
                    profit += a.getProfit();
                }
            }
        }
        return profit;
    }
    
    public double getAllMarketValuePerAge (int minAge, int maxAge){
        double marketValue = 0;
        for (Cliente c : clients.values()){
            if (c.getEdad() >= minAge || c.getEdad() < maxAge){
                for (Asset a : c.getAssets()){
                        marketValue += a.getMarketValue();
                    }
                }
            }
        return marketValue;
    }
    
    public double getAllProfitPerAge (int minAge, int maxAge) {
        double profit = 0;
        for (Cliente c : clients.values()){
            if (c.getEdad() >= minAge || c.getEdad() < maxAge){
                for (Asset a : c.getAssets()){
                    profit += a.getProfit();
                }
            }
        }
        return profit;
    }
    
}
