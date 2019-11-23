package class1;                //Last in First out

public class stack_search{ 
	private int [] stk;     //테이터의 보관함
	private int max;        // 전체 데이터의 사이즈
	private int ptr;        // 현재 데이터의 사이즈 (데이터의 갯수) (=size)
	
	public stack_search(int max_in) {   //max_in : 데이터 최대로 넣을 갯수
		ptr = 0;						// 집적적으로 접근 할 수 없어서 max_in으로 접근
		max = max_in;
		try {							//try : 한줄 씩 오류 확인, 오류 있을 시 catch로 넘어감
			stk = new int [max];
			int a = 3;
			int b = 5;
			int c = 7;
		}
		catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) {          // 외부에서는 ptr의 위치를 알수가 없음 따라서 외부에서 값을 넣으면 내부에서 알아서 처리 후 들어갔음을 알려줌
  		if(ptr >= max)                // 수를 밑에서 부터 넣어줌 / ptr은 독자적으로 배열 안에서 움직임
  			return -1;				  // 수를 ptr의 위치에서 넣어주고 ptr은 한칸 올라간다
  		stk[ptr] = x;				  // 다연하게도 max 보다 ptr이 크면 에러
  		ptr++;								
  		return 0;
	}
	
	public int pop() {                // 값을 지울 수가 없으므로 지우지 않고 없다고 친다.
		if(ptr <= 0)				  // ptr이 0일때는 에러 : push 후에 ptr을 한칸 올려주므로 0일때는 값이 없어서 불가능 하다.
			return -1;
		ptr--;
		return stk[ptr];
	}
	
	public boolean isEmpty() {
		if(ptr <= 0)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {       // ptr = 데이터 개수 이다 따라서 ptr이 max보다 크거나 같으면 꽉참
		if(ptr >= max)
			return true;
		else 
			return false;
	}
	
	public int size() {
		return ptr;
	}
	
	public int Max_size() {
		return max;
	}
	
	public void clear() { 		   // ptr보다 밑에 있는 데이터만 존재한다
		ptr = 0;
	}
	
	public int get() {             // 스택 배열의 맨 위를 출력
		return stk[ptr-1];         
	}
	
	public int search(int want_find) {
		int index = -1;
		for(int i=0; i<ptr; i++) {
			if(want_find == stk[i])
				index = i;
		}
		return index;
	}
	
	public void print_all() {
		for(int i=ptr-1; i>=0; i--) 
			System.out.println("stk["+i+"] = "+stk[i]);
	}
}