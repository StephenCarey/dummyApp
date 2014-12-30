package exampleci.objects;

import java.util.ArrayList;
import java.util.List;
import exampleci.objects.base.Vehicle;
import exampleci.objects.components.*;

public class LandVehicle extends Vehicle implements exampleci.interfaces.iLand {
	
	// Properties of a Land Vehicle
	public List<Wheel> wheels = new ArrayList<Wheel>();
	
	public LandVehicle(){
		this.StartVehicle();		
	}
	
}




