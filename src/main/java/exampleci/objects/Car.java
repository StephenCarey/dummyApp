package exampleci.objects;

import exampleci.objects.components.Exhaust;
import exampleci.objects.components.Wheel;

public class Car extends LandVehicle {
	
	// Because a car has more that one wheel an array is needed
	public Exhaust myExhaust = new Exhaust();
	
	// Default constructor for the Car class
	public Car(){
			
		// Create the wheels - is there a better way of doing this?
		Wheel frontDriver = new Wheel();
		Wheel frontPassenger = new Wheel();
		Wheel rearDriver = new Wheel();
		Wheel rearPassenger = new Wheel();
		
		// Add the wheels to the collection - is there a better way of doing this?
		wheels.add(frontDriver);
		wheels.add(frontPassenger);
		wheels.add(rearDriver);
		wheels.add(rearPassenger);
		
	}
	

}





