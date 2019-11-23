package ex_02;

public class Plus_ex {
int num = 10000;
	
	public static int PlusFor(int num) {
		int f = 0;
		for(int i = 1; i<=num; i++) {
			f = f+i;
		}
		return f;
	}
	
	public static int recursivePlus(int num) {
		if(num == 1)
			return 1;
		return recursivePlus(num-1)+num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PlusFor(10000));
		System.out.println(recursivePlus(10000));
		
	}

}
