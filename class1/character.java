package class1;

public class character {
	int hp;
	int mp;
	int meso;
	String name;
	String job;
	
	public character() {
		
	}
	
	public character(String nameI) {
		name = nameI;
		job = "ÃÊº¸ÀÚ";
		hp = 100;
		mp = 100;
		meso = 10000;
	}
	
	public int basic_attack () {
		return 15;
	}
		
}
