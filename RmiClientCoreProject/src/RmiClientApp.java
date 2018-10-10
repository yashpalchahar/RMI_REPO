import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClientApp {
	
	public static void main(String[] args) {
		try{
			Registry registry = LocateRegistry.getRegistry(); 
			
			// Looking up the registry for the remote object 
	        IGreetingService greetingServiceStub = (IGreetingService) registry.lookup("greetingService");
	        ICalculatorService calculatorServiceStub = (ICalculatorService) registry.lookup("calculatorService");
	        
	        // Calling the remote method using the obtained object 
	        greetingServiceStub.printMsg();
	        System.out.println(calculatorServiceStub.add(10, 12));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
