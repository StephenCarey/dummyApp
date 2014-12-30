package exampleci;

import exampleci.objects.Car;
import exampleci.objects.Motorbike;
import exampleci.objects.components.Wheel;

public class CarSimulator {
	
	public static void main(String[] args) {
			

		// Create a new car
		Car myAudi = new Car();	
		Motorbike myTriumph = new Motorbike();
		
		myAudi.StartVehicle();
		
		if(myAudi.isStarted){
			myAudi.wheels.add(new Wheel());
		}

				
		// Write out how many wheels the car has 
		System.out.println("My car has " + myAudi.wheels.size() + " wheels.");
		System.out.println("My motorbike has a " + myTriumph.bikeSaddle.colour + " saddle.");
		
		if(myTriumph.isStarted){
			System.out.println("My motorbike has started!");
		}

	}

}

