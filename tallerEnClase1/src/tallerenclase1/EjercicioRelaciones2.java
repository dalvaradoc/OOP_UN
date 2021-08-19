    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class EjercicioRelaciones2 {

    public EjercicioRelaciones2() {
        
        Cuenta cuenta1 = new Cuenta(1, 123.5, new Date(), "Compteun");
        Cuenta cuenta2 = new Cuenta(2, 10, new Date(), "Deux Compte");

        Cuenta[] cuentas = {cuenta1, cuenta2};

        Tipo trans1 = new Tipo("Transaccion 1");
        Tipo trans2 = new Tipo("Transaccion 2");
        
        Tipo[] tipoTrans = {trans1, trans2};

        Banco banco = new Banco("1", tipoTrans, cuentas);
        
        cuenta1.addMovements(new Date(), 23, 156.75, trans1);
        cuenta1.addMovements(new Date(), 54, 1235.3, trans2);
        
        cuenta2.addMovements(new Date(), 46, 1236.67, trans2);
        cuenta2.addMovements(new Date(), 1246, 15, trans1);
        
        banco.listarInfo();
    }
}
