import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGreetingService extends Remote {
	void printMsg() throws RemoteException;  
}
