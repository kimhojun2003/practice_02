package ex_01;

public class Set {
	private int max;                 //�ִ� ����
	private int num;                 //����ִ� ���� ����
	private int iSet[];
	
	public Set(int capacity) {
		max = capacity;
        num = 0;
        iSet = new int[max];
	}
	
	//add
	public int add(int data) {
		///�ߺ� ���� Ȯ�� 
		for(int i = 0; i<num; i++) {
			if(iSet[i] == data)
				return 0;
		}
		//������ �ִ� �κ�
		iSet[num+1] = data;
		return 1;                   
	}
	
	//remove
	public int remove(int data) {
		//�ȿ� �ִ� �� Ȯ�� > ��� �ִ��� Ȯ��  | return 0
		//�����͸� ���ֱ� �����͸� -1�� ��ȯ |return 1
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
	
	//���
	public void printall() {
		//9~num���� ��� ��� ���
		for(int i = 0; i<num; i++)
			System.out.println(iSet[i]);
	}
	
	//copy
	public void copy(set A) {
		//num , max ���� �ٿ��ֱ�
		num = A.num;
		max = A.max;
		iSet = new int[max];
		
		//iSet �ٿ��ֱ�
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
