package exampleci.objects.base;

import exampleci.interfaces.iVehicle;

public class Vehicle implements iVehicle {

	// Properties
	public Boolean isStarted=false;
	
	// Method to start a vehicle
	public void StartVehicle(){
		
		if(isStarted==null || isStarted==false){
			isStarted=true;
			
		}
		
	}
	
	public boolean isEnginRunning(){
		return isStarted;
	}
	
	
	
}


