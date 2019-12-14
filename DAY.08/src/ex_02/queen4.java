package ex_02;
// 체스 말 queen 4개가 서로 잡아 먹지 못하도록 배치하는 방법의 개수 구하기 
public class queen4 {
	//좌로 4번 체크 > 놓을 수 있다 > 1칸 내려가서 >좌로 4번 체크
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
	      // 실제 구동하는 부분
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