
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public interface SpeedRacerRMIServerInterface extends Remote {
    public void speedRacer() throws RemoteException;
    public int register(SpeedRacerRMIClientInterface speedRacerRMIClientInterface) throws RemoteException;
    public void runGame(int idClient)throws RemoteException;
    public void joinGame(int idClient) throws RemoteException;
    public void newGrid(int idClient)throws RemoteException;
    public int getScore(int idClient)throws RemoteException;
    public void setScore(int idClient,int score)throws RemoteException;
    public boolean getGameInProgress(int idClient)throws RemoteException;
    public boolean getGameFinishing(int idClient)throws RemoteException;
    public void setGameInProgress(int idClient,boolean inProgress)throws RemoteException;
    public void setGameFinishing(int idClient, boolean finishing)throws RemoteException;
    public void setGameQuit(int idClient,boolean quit)throws RemoteException;
    public boolean getGameQuit(int idClient)throws RemoteException;
    public void setLE_P(int idClient,boolean LE_P)throws RemoteException;
    public void setRI_P(int idClient,boolean RI_P)throws RemoteException;
    public void setUP_P(int idClient,boolean UP_P)throws RemoteException;
    public void setDO_P(int idClient,boolean DO_P)throws RemoteException;
    public boolean getLE_P(int idClient)throws RemoteException;
    public boolean getRI_P(int idClient)throws RemoteException;
    public boolean getUP_P(int idClient)throws RemoteException;
    public boolean getDO_P(int idClient)throws RemoteException;
}
