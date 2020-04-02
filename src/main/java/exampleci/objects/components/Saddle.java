package exampleci.objects.components;

import exampleci.interfaces.iComponent;

public class Saddle implements iComponent {

	public String partID;
	public String colour;
	
	public Saddle() {
		partID="12345X5W";
		colour="black";
	}

	public String GetPartId() {
		return partID;
	}

}
