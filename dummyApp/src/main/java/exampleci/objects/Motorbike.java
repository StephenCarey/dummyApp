package exampleci.objects;

import exampleci.objects.components.Exhaust;
import exampleci.objects.components.Saddle;
import exampleci.objects.components.Wheel;

public class Motorbike extends LandVehicle {

	public Wheel frontWheel;
	public Wheel rearWheel;
	public Exhaust bikeExhaust;
	public Saddle bikeSaddle;

	public Motorbike(){
		frontWheel = new Wheel();
		rearWheel = new Wheel();
		bikeExhaust = new Exhaust();
		bikeSaddle = new Saddle();
		
	}
	
}
