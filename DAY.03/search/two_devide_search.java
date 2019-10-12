package search;
import java.util.Scanner;


public class two_devide_search {

	static int Search(int[] a, int n, int key) {
		int pl = 0; 
		int pr = n-1;
		
		do {
			int pc = (pl + pr)/2; // 중암 요소의 index
			if(a[pc]==key)
				return pc;   // 검색 성공
			
			else if(a[pc]<key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else 
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		}while(pl<=pr);
		return -1; // 검색 실패
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num =scan.nextInt();
		
		int [] x = new int [num];
		
		System.out.println("오름차순으로 입력해 주세요");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i =1; i<num; i++) {
			do{
				System.out.print("x["+i+"] : ");
				x[i]= scan.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.print("찾는 값 : ");
		int key = scan.nextInt();
		
		int idx = Search(x, num, key);
		
		if(idx == -1) 
			System.out.println("그런 값은 없습니다");
			else
				System.out.println(key+"는 x["+idx+"]에 있습니다");
	}
}

