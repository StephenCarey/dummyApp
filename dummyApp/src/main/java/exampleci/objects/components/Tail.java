package exampleci.objects.components;

import java.util.List;

import exampleci.interfaces.iComponent;

public class Tail implements iComponent {

	// Properties
	private String partId;
	private String serialNo;
	private String manufacturer;
	private List<Wing> tailwings;
	private double width;
	private double length;
	private double weight;
	

	public String GetPartId() {
		// TODO Auto-generated method stub
		return partId;
	}

}
