/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Travel {
    String start;
    int duration;
    
    BookedFlight outbound;
    BookedFlight retorno;
    Hotel hotel;
    Airport from;
    Airport to;

    public Travel(String start, int duration, Hotel hotel) {
        this.start = start;
        this.duration = duration;
        this.hotel = hotel;
    }

    public void setOutbound(int flightNumber, String departure, String arrival, Airport from, Airport to) {
        this.from = from;
        this.to = to;
        BookedFlight bookedFlight = new BookedFlight(flightNumber, departure, arrival, from, to);
        this.outbound = bookedFlight;
    }

    public void setRetorno (int flightNumber, String departure, String arrival, Airport from, Airport to) {
        BookedFlight bookedFlight = new BookedFlight(flightNumber, departure, arrival, from, to);
        this.retorno = bookedFlight;
    }
    
    
}
