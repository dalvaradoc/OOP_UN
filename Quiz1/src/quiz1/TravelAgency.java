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
public class TravelAgency {
    String name;
    
    Hotel[] knownHotels;
    Travel[] offeredTravels;
    Airport[] airports;

    public TravelAgency(String name) {
        this.name = name;
        knownHotels = new Hotel[5];
        offeredTravels = new Travel[10];
        airports = new Airport[4];
    }

    public Hotel[] getKnownHotels() {
        return knownHotels;
    }
    
    public boolean addHotel (String name, String address){
        Hotel hotel = new Hotel(name, address);
        for (int i = 0; i < 5; i++){
            if (knownHotels[i] == null){
                knownHotels[i] = hotel;
                return true;
            }
        }
        return false;
        
    }
    
    public boolean addAirport (String desc){
        Airport hotel = new Airport(desc);
        for (int i = 0; i < 4; i++){
            if (airports[i] == null){
                airports[i] = hotel;
                return true;
            }
        }
        return false;
        
    }

    public Airport[] getAirports() {
        return airports;
    }
    
    //public boolean addTravel (String start, int duration, Hotel hotel,  int flightNumber1, String departure1, String arrival1, Airport airportFrom1, Airport airportTo1, int flightNumber2, String departure2, String arrival2, Airport airportFrom2, Airport airportTo2){
    public boolean addTravel (String start, int duration, Hotel hotel,  int flightNumber1, String departure1, String arrival1, Airport airportFrom1, Airport airportTo1) {
        Travel travel = new Travel(start, duration, hotel);
        for (int i = 0; i < 10; i++){
            if (offeredTravels[i] == null){
                travel.setOutbound(flightNumber1, departure1, arrival1, airportFrom1, airportTo1);
                offeredTravels[i] = travel;
                return true;
            }
        }
        
        return false;
    }    
    
    public void listarViajes () {
        for (int i = 0; i < offeredTravels.length; i++){
            if (offeredTravels[i] != null){
                System.out.println("Numero de vuelo: " + offeredTravels[i].outbound.flightNumber);
                System.out.println("Descp Aeropuerto salida: " + offeredTravels[i].from.description);
                System.out.println("No se ha registrado información de el vuelo de regreso.");
            }
        }
    }
}
