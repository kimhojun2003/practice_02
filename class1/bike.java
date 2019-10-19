package class1;

public class bike {
	String name;
	int weight;
	int gearnumber;
	String type;
	int speed;
	
	public bike () {
		
	}
	
	public bike (String name) {
		
	}
	
    public bike (String nameI, int weightI, int gearnumberI, String typeI, int speedI) {
		name = nameI;
		weight = weightI;
		gearnumber = gearnumberI;
		type = typeI;
		speed = speedI;
	
    }
    
    public int move (int location) {
    	return location + speed;
    }
    
    public int hill_move(int location) {
    	if(gearnumber==1) 
    		return location + speed + 5;
    	
    	else if(gearnumber==2)
    		return location + speed;
    	else if(gearnumber==3)
    		return location + speed -5;
		return location;
    }
}
