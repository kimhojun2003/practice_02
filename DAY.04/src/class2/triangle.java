package class2;

public class triangle extends polygon{
	int height;
	int bottom;
	
	public triangle () {
		super.side_num = 3; 
	}

	public void set_area() {
		super.area= height*bottom /2;
	}
}