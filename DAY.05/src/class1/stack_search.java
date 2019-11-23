package class1;                //Last in First out

public class stack_search{ 
	private int [] stk;     //�������� ������
	private int max;        // ��ü �������� ������
	private int ptr;        // ���� �������� ������ (�������� ����) (=size)
	
	public stack_search(int max_in) {   //max_in : ������ �ִ�� ���� ����
		ptr = 0;						// ���������� ���� �� �� ��� max_in���� ����
		max = max_in;
		try {							//try : ���� �� ���� Ȯ��, ���� ���� �� catch�� �Ѿ
			stk = new int [max];
			int a = 3;
			int b = 5;
			int c = 7;
		}
		catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) {          // �ܺο����� ptr�� ��ġ�� �˼��� ���� ���� �ܺο��� ���� ������ ���ο��� �˾Ƽ� ó�� �� ������ �˷���
  		if(ptr >= max)                // ���� �ؿ��� ���� �־��� / ptr�� ���������� �迭 �ȿ��� ������
  			return -1;				  // ���� ptr�� ��ġ���� �־��ְ� ptr�� ��ĭ �ö󰣴�
  		stk[ptr] = x;				  // �ٿ��ϰԵ� max ���� ptr�� ũ�� ����
  		ptr++;								
  		return 0;
	}
	
	public int pop() {                // ���� ���� ���� �����Ƿ� ������ �ʰ� ���ٰ� ģ��.
		if(ptr <= 0)				  // ptr�� 0�϶��� ���� : push �Ŀ� ptr�� ��ĭ �÷��ֹǷ� 0�϶��� ���� ��� �Ұ��� �ϴ�.
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
	
	public boolean isFull() {       // ptr = ������ ���� �̴� ���� ptr�� max���� ũ�ų� ������ ����
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
	
	public void clear() { 		   // ptr���� �ؿ� �ִ� �����͸� �����Ѵ�
		ptr = 0;
	}
	
	public int get() {             // ���� �迭�� �� ���� ���
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