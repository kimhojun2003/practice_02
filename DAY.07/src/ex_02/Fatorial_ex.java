package ex_02;
// ��͹��� ���� ���� : ���� ���ؼ� 
public class Fatorial_ex {
	int num;
	int f=1;
	
	public static int Factorial_for(int num) {
		int f=1;
		for(int i = 0; i<num; i++) {
			f = f*(num-i);
		     //f*=num-i;
		}
		return f;
	}
	
	public static int recursiveFactory(int num) {
		if(num ==1) {
			return 1;
		}return recursiveFactory(num-1)*num;         //�� ������ processing+self call�� �̷���� �ִ�.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial_for(8));
	}

}
