import java.rmi.RemoteException;

public class CalculatorServiceImpl implements ICalculatorService{

	@Override
	public Integer add(Integer first, Integer second) throws RemoteException {
		System.out.println("Received first: "+ first + " , second: "+ second);
		
		Integer result = first + second;
		
		return result;
	}

}
