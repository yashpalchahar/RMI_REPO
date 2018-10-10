import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculatorService extends Remote{
	
	public Integer add(Integer first, Integer second)throws RemoteException;
}
