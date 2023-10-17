package monserveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplimentationInterfaceMatrice extends UnicastRemoteObject implements IMatriceRemote {
    
    public ImplimentationInterfaceMatrice() throws RemoteException{
        super() ;
    }
    
    public String multiplierMatriceADistance(String matrice1 , String matrice2 , int lgM1 , int colM1 , int lgM2 , int colM2) throws RemoteException {
 
        Matrice m1 = new Matrice(matrice1 , lgM1 , colM1) ;
        
        m1.afficherMatrice();
        
        Matrice m2 = new Matrice(matrice2 , lgM2 , colM2) ;
        
        m2.afficherMatrice();
        
        return Matrice.multiplierMatrices(m1, m2);
        
    }
} 
