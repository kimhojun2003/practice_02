package ex_02;
// ü�� �� queen 4���� ���� ��� ���� ���ϵ��� ��ġ�ϴ� ����� ���� ���ϱ� 
public class queen4 {
	//�·� 4�� üũ > ���� �� �ִ� > 1ĭ �������� >�·� 4�� üũ
	 public static void solveQueen4(int loc, int arr [][]) {
	      // end Point
	      if (loc == 4) {
	         for (int i = 0 ; i < 4; i++) {
	            for (int j =0 ; j < 4; j++) {
	               System.out.print(arr[i][j]);
	               System.out.print(' ');
	            }
	            System.out.println();
	         }
	         System.out.println();
	      }
	      // ���� �����ϴ� �κ�
	      else {
	         for (int i = 0; i <4 ; i++) {
	            if (canLocate(i, loc, arr)) {
	               arr[loc][i] = 1;
	               solveQueen4(loc+1, arr);
	               arr[loc][i] = 0;
	            }
	         }
	      }
	   }
	   
	   public static boolean canLocate(int x, int y, int arr[][]) {
	      for (int i = 0 ; i < y; i++ ) {
	         for (int j =0; j < 4; j++) {
	            if(arr[i][j] == 1) {
	               if (x == j || x == j +(y-i) || x == j -(y-i))
	                  return false;
	            }
	         }
	      }
	      return true;
	   }
	   
	   public static void main(String args []) {
	      int arr [][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	      solveQueen4(0, arr);
	   }
}