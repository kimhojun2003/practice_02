package ex_02;

public class MultyAlgo {
	int n;
	public static int num =1;
	public static int MultyFor(int n) {
		int f = 1;
		for(int i = 0; i<n; i++)
		{
			f = f*3;
		}
		for(int j = 0; j<n; j++) 
			f = f-100;
		return f;
	}
	
	public static void recursiveMulty(int n) {
		if(n == 0)
			return;
		num*=3;
		recursiveMulty(n -1);
		num -= 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MultyFor(5));
		
		recursiveMulty(5);
		System.out.println(num);
	}

}
