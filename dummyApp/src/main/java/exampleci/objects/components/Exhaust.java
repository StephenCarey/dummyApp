package exampleci.objects.components;

// [TASK] Implement the iComponent Interface - Completed
public class Exhaust implements exampleci.interfaces.iComponent {

	// [TASK] Does this have all the properties required to implement the Interface - Completed
	
	// properties
	public String partID;
	public String emmissions;
	public String materials;
	public int height;
	public int width;
	
	// Default Constructor	
	public Exhaust(){
		
		this.partID="01";
		this.emmissions="low";
		this.materials="alloy";
		this.height=10;
		this.width=10;
		
	}

	// [TASK] Missing Interface method required? - Completed
	public String GetPartId() {
		return this.partID;
	}
	
	public String GetEmmissionType() {
		return this.emmissions;
	}
	
	
}
