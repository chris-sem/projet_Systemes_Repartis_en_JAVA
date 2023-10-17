package monserveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMatriceRemote extends Remote{
    public String multiplierMatriceADistance(String matrice1 , String matrice2 , int lgM1 , int colM1 , int lgM2 , int colM2) throws RemoteException ;
}
