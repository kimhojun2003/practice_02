package search;
import java.util.Scanner;


public class two_devide_search {

	static int Search(int[] a, int n, int key) {
		int pl = 0; 
		int pr = n-1;
		
		do {
			int pc = (pl + pr)/2; // �߾� ����� index
			if(a[pc]==key)
				return pc;   // �˻� ����
			
			else if(a[pc]<key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else 
				pr = pc - 1; // �˻������� ���� �������� ����
		}while(pl<=pr);
		return -1; // �˻� ����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num =scan.nextInt();
		
		int [] x = new int [num];
		
		System.out.println("������������ �Է��� �ּ���");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i =1; i<num; i++) {
			do{
				System.out.print("x["+i+"] : ");
				x[i]= scan.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.print("ã�� �� : ");
		int key = scan.nextInt();
		
		int idx = Search(x, num, key);
		
		if(idx == -1) 
			System.out.println("�׷� ���� �����ϴ�");
			else
				System.out.println(key+"�� x["+idx+"]�� �ֽ��ϴ�");
	}
}

