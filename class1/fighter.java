package class1;

public class fighter extends worrior{
	public fighter() {
		super.job = "������";
		super.hp = super.hp+1000;
		super.mp = super.mp;		
	}
	public fighter(String name) {
		super.name = super.name;
		super.job = "������";
		super.hp = super.hp+1000;
		super.mp = super.mp;
	}
	public int basic_attack() {
		return super.basic_attack() + 50;
	}
	public int power_slash() {
		return super.power_slash() + 300;
	}
}
