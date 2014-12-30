package exampleci.objects.components;

//[TASK] Implement the iComponent Interface - Completed
public class Wheel implements exampleci.interfaces.iComponent{
	
	// [TASK] Does this have all the properties required to implement the Interface
	// Properties
	public String partId; 
	public boolean isAlloy;
	public int height;
	public int width;
	public int boltCount;
	public String style;
	
	// Default constructor for the Wheel class
	public Wheel(){
		
		this.isAlloy=false;
		this.height=12;
		this.width=12;
		this.boltCount=4;
		this.style="Stock";	
		
	}
		
	// Custom constructor for the Wheel class
	public Wheel(boolean alloyIn, int heightIn, int widthIn, int boltCountIn, String styleIn){
		
		this.isAlloy=alloyIn;
		this.height=heightIn;
		this.width=widthIn;
		this.boltCount=boltCountIn;
		this.style=styleIn;		
				
	}

	// [TASK] Missing Interface method required?
	public String GetPartId() {
		// TODO Auto-generated method stub
		return this.partId;
	}
	
	
	
}



