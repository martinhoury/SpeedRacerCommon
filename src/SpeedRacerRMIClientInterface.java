
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public interface SpeedRacerRMIClientInterface extends Remote {
    public void test() throws RemoteException;
    
    public void enablePlayButton(boolean enable) throws RemoteException;
    public void update(Vector<Rectangle> vDisplayRoad, Vector<Rectangle> vDisplayObstacles, Vector<Rectangle> vDisplayCars, Car myCar, int pos, int nbParticipants, boolean bGameOver, String sPosition) throws RemoteException;
}
