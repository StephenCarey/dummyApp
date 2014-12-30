package exampleci;

import exampleci.airplanes.Concord;


public class AirSimulator {

	public static void main(String[] args) {
		// Create a new Airplane
		Concord myPlane = new Concord();
		
		// Start the plane - Why is this not working
		if(!myPlane.isStarted){
			myPlane.StartVehicle();
			System.out.println("Plane is now started!");
		}
		else{
			System.out.println("Plane is already started!");
		}

	}

}
