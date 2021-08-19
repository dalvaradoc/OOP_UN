/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Alejandro
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TravelAgency aviatur = new TravelAgency("Aviatur");
        aviatur.addAirport("José María Córdoba");
        aviatur.addAirport("Aeropuerto el dorado");
        aviatur.addHotel("Fontanar", "Cra. 21a #159a-28");
        aviatur.addTravel("22/03/2017", 30, aviatur.getKnownHotels()[0], 1345, "22/03/2017", "22/03/2017", aviatur.getAirports()[0], aviatur.getAirports()[1]);
        aviatur.listarViajes();
    }
    
}
