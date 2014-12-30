package exampleci.objects.components;

public class Engine implements exampleci.interfaces.iComponent {

	// Properties
	private String partId;
	private String serialNo;
	private String manufacturer;
	private int valveCount;
	private double size;
	
	// Default Constructor	
	public Engine(){
		
		this.partId="0";
		this.setSerialNo("XXX-XXXXX-XX");
		this.setManufacturer("Generic");
		this.setValveCount(8);
		this.setSize(1.2);
		
	}
	
	// Custom Constructor
	public Engine(String partIdIn, String serialNoIn, String manufacturerIn, int valveCountIn, double sizeIn){
		
		this.partId=partIdIn;
		this.setSerialNo(serialNoIn);
		this.setManufacturer(manufacturerIn);
		this.setValveCount(valveCountIn);
		this.setSize(sizeIn);
		
	}

	// Method to get the partId - Implemented from iComponent
	public String GetPartId() {
		
		String result="";
		
		// Check the existing value to ensure we cause a null exception
		// or return a blank string value
		if(this.partId.equals("") || this.partId==null){
			this.partId="0";			
		}
		
		result = this.partId;
		return result;
	}

	public String getSerialNo() {
	    return serialNo;
    }

	public void setSerialNo(String serialNo) {
	    this.serialNo = serialNo;
    }

	public int getValveCount() {
	    return valveCount;
    }

	public void setValveCount(int valveCount) {
	    this.valveCount = valveCount;
    }

	public double getSize() {
	    return size;
    }

	public void setSize(double size) {
	    this.size = size;
    }

	public String getManufacturer() {
	    return manufacturer;
    }

	public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;
    }	
	
}


