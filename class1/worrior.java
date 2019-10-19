package class1;

public class worrior extends character{

	public worrior () {
		super.job = "전사";
		super.hp= super.hp+2000;
		super.mp = super.mp-10;
	}
	
	public worrior (String nameI) {
		super.name = nameI;
		super.job = "전사";
		super.hp= super.hp+2000;
		super.mp = super.mp-10;
	}
	
	public int power_slash() {
		return 100;
	}
}