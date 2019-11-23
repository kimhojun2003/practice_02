package ex_02;

public class FiboAlgo {
		public static int recursionFibo(int num) {
			if(num<=2)
				return 1;
			else 
				return recursionFibo(num-2)+recursionFibo(num-1);
		}
		
		public static int FiboFor(int num) {
			if(num==1 || num==2)
				return 1;
			int result = 0;
			int pre1 = 1;
			int pre2 = 1;
			for(int i = 3; i<=num; i++) {
				result = pre1 + pre2;
				pre2 = pre1;
				pre1 = result;
			}
				return result;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursionFibo(4));
		System.out.println(FiboFor(4));
	}

}
