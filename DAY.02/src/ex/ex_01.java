package ex; //�迭�� �ڷ� ���� ��, ��ȯ, ����  (9-21)
import java.util.Scanner;
public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // �迭�� ��
		/*int array [] = {3,6,1,3,7,10};
		
		int maximum = 0 ;
		for(int i =0; i<6; i++) {
			if(maximum<array[i]) {
				maximum = array[i];
			}
		}
		System.out.println(maximum);*/
		
		//���� ��ȯ
		/*static int cardConvR(int x, int r, char[] d) {
			int digits =0;
			String dchar  ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			do {
				d[digits++]=dchar.charAt(x%r);
				x /= r;
			}while( x!=0);
			return digits;
		}*/
		
		//�Ҽ� ����� 
		int input_number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ڿ����� �Է��� �ּ��� : ");
		input_number = scan.nextInt(); 
		
		boolean prime = true;
		
		int prime_number [] = new int [100];
		
		
		if(input_number > 2) {
			for(int i =2; i<input_number; i++) {
		
			if(input_number % i ==0) 
			{
				prime =false;
				System.out.println("�Ҽ��� �ƴմϴ�");
				break;
			}
			}
		}
	}
		
}