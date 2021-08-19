/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

/**
 *
 * @author Alejandro
 */
public class Banco {
    String _code;
    private Tipo[] _types;
    private Cuenta[] _comptes;

    public Banco(String _code, Tipo[] _types, Cuenta[] _comptes) {
        this._code = _code;
        this._types = _types;
        this._comptes = _comptes;
    }   
    
    public void listarInfo (){
        for (int i = 0; i < _comptes.length; i++){
            System.out.println(_comptes[i]._nomClient);
            for (int j = 0; j < _comptes[i].getMouvements().size(); j++){
                System.out.println("\t Tipo de movimiento: " + _comptes[i].getMouvements().get(j).getType()._code);
            }
        }
    }
}
