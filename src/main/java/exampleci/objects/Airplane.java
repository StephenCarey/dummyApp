package exampleci.objects;

import java.util.ArrayList;
import java.util.List;

import exampleci.objects.components.*;

public class Airplane extends AirVehicle {
	
	// Should these all be public???
	public Engine engineComponent;
	public Tail tailComponent;
	public LandingGear landingGearComponent;
	
	
	// This code is messy and cumbersome. Refactoring required.
	public void AddComponent(LandingGear newLandingGear){
		List<Wheel> myWheels = new ArrayList<Wheel>();
		Wheel Wheel1 = new Wheel();
		Wheel Wheel2 = new Wheel();
		Wheel Wheel3 = new Wheel();
		Wheel Wheel4 = new Wheel();
		Wheel Wheel5 = new Wheel();
		Wheel Wheel6 = new Wheel();	
		myWheels.add(Wheel1);
		myWheels.add(Wheel2);
		myWheels.add(Wheel3);
		myWheels.add(Wheel4);
		myWheels.add(Wheel5);
		myWheels.add(Wheel6);
	}
	

}
