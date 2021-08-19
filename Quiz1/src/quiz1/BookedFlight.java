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
public class BookedFlight {
    int flightNumber;
    String departure;
    String arrival;
    
    Airport from;
    Airport to;

    public BookedFlight(int flightNumber, String departure, String arrival, Airport from, Airport to) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }
}
