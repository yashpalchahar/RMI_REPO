import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServerBindObjectApp {

	public static void main(String[] args){
		try{
			IGreetingService greetingService = new GreetingServiceImpl();
			ICalculatorService calculatorService = new CalculatorServiceImpl();
			
			//NOTE: No need to start rmi by(   rmi registry in seperate terminal/cmd)
			//Registry registry = LocateRegistry.createRegistry(1099);
			Registry registry = LocateRegistry.getRegistry();
			
			// Exporting the object of implementation class  
	        // (here we are exporting the remote object to the stub)
			IGreetingService greetingServiceStub = (IGreetingService) UnicastRemoteObject.exportObject(greetingService, 0);
			ICalculatorService calculatorServiceStub = (ICalculatorService) UnicastRemoteObject.exportObject(calculatorService, 0);
			
			registry.bind("greetingService", greetingServiceStub);
			registry.bind("calculatorService", calculatorServiceStub);
			
			System.out.println("registered stub: greetingService,calculatorService");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
