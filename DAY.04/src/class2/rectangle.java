package class2;

public class rectangle extends polygon{
	int side;
	
	public rectangle() {
		super.side_num = 4;
	}
	
	public void set_area() { 
		super.area = side*side;
	}

}
