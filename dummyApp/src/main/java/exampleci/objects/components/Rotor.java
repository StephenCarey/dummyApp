package exampleci.objects.components;

import java.util.List;

import exampleci.interfaces.iComponent;

public class Rotor implements iComponent {

	// Properties
	public String partId;
	public String serialNo;
	public String manufacturer;
	public List<Rotorblade> rotorblades;
	public double length;
	public double weight;
	

	public String GetPartId() {
		// TODO Auto-generated method stub
		return partId;
	}

}
