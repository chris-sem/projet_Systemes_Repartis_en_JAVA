package monserveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MonServeur {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ImplimentationInterfaceMatrice od = new ImplimentationInterfaceMatrice() ;
            //System.out.println(od.toString());
            Naming.rebind("rmi://localhost:1099/MT", od);
        } catch (Exception ex) {
            Logger.getLogger(MonServeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
