import java.rmi.RemoteException;

public class GreetingServiceImpl implements IGreetingService{

	@Override
	public void printMsg() throws RemoteException {
		System.out.println("Server: GreetingServiceImpl: This is an example RMI program");  
	}

}
