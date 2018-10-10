C:\r9\workspaceFolder\poc_rule_engine_hy62_workspace\RmiInterfaces\bin>rmiregistry

NOTE: start rmiregistry from directory where class files of RemoteObject Interfaces is present.
	  Run the rmiregisrty command from your /bin, /build, or /build/classes folder, whichever folder is the root of your built files.
	  
	 will get below error when run from different directory.
	 java.rmi.ServerException: RemoteException occurred in server thread; nested exception is: java.rmi.UnmarshalException: 
	 error unmarshalling arguments; nested exception is: java.lang.ClassNotFoundException: IGreetingService

NOTE: IGreetingService,ICalculatorService will be shared to client/server both as jar. 
	( RmiInterfaces project) is shared to client/server project.
	
Remote method invocation (RMI) is the action of invoking a method of a remote interface on a remote object.
Most importantly, a method invocation on a remote object has the same syntax as a method invocation on a local object.