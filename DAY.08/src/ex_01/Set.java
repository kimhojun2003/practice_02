package ex_01;

public class Set {
	private int max;                 //최대 개수
	private int num;                 //들어있는 값의 개수
	private int iSet[];
	
	public Set(int capacity) {
		max = capacity;
        num = 0;
        iSet = new int[max];
	}
	
	//add
	public int add(int data) {
		///중복 여부 확인 
		for(int i = 0; i<num; i++) {
			if(iSet[i] == data)
				return 0;
		}
		//데이터 넣는 부분
		iSet[num+1] = data;
		return 1;                   
	}
	
	//remove
	public int remove(int data) {
		//안에 있는 지 확인 > 어디에 있는지 확인  | return 0
		//데이터를 없애기 데이터를 -1로 변환 |return 1
		for(int i = 0; i<num; i++) {
			if(iSet[i] == data) { 
				int temp = iSet[i];
				iSet[i] = iSet[num-1];
				iSet[num-1] = temp;
				return 1;
			}
		}
		return 0;
	}
	
	//출력
	public void printall() {
		//9~num까지 모든 요소 출력
		for(int i = 0; i<num; i++)
			System.out.println(iSet[i]);
	}
	
	//copy
	public void copy(set A) {
		//num , max 복사 붙여넣기
		num = A.num;
		max = A.max;
		iSet = new int[max];
		
		//iSet 붙여넣기
		for(int i =0; i<max; i++);
		
	}
	
	public boolean equal (set A) {
		boolean isSame [] = new boolean[num];
		for(int i = 0; i<num; i++) {
			isSame[i] = false;
		}
		
		for(int i = 0; i<A.num; i++)
			for(int j = 0; j<num; j++) {
				if(A.iSet[i] == iSet[i]);
				    isSame[i] = true;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
