/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Movimiento {
    Date _date;
    double _soldePrecedent;
    double _montant;
    private Tipo type;

    public Movimiento(Date _date, double _soldePrecedent, double _montant, Tipo type) {
        this._date = _date;
        this._soldePrecedent = _soldePrecedent;
        this._montant = _montant;
        this.type = type;
    }

    public Tipo getType() {
        return type;
    }
}
