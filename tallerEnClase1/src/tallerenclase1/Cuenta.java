/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Cuenta {
    int _numeroCompte;
    double _souldeCourant;
    Date _dateCreation;
    String _nomClient;
    
    private ArrayList<Movimiento> _mouvements;

    public Cuenta(int _numeroCompte, double _souldeCourant, Date _dateCreation, String _nomClient) {
        this._numeroCompte = _numeroCompte;
        this._souldeCourant = _souldeCourant;
        this._dateCreation = _dateCreation;
        this._nomClient = _nomClient;
        _mouvements = new ArrayList<>();
    }

    public ArrayList<Movimiento> getMouvements() {
        return _mouvements;
    }

    public void addMovements (Date _date, double _soldePrecedent, double _montant, Tipo type) {
        Movimiento _mouvement = new Movimiento(_date, _soldePrecedent, _montant, type);
        _mouvements.add(_mouvement);
    }
}
