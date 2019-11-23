package class1;

public class Queue {
	private int max;
	private int num;
	private int front;
	private int rear;
	private int [] array;
	
	public Queue(int max_in) {
		max = max_in;
		array = new int [max];
		num=0;
		front = 0;
		rear = 0;
	}
	
	public void enque(int data) {
		if(num == max) {
			System.out.println("Is Full!!");
			return;
		}
		num++;
		rear = ++rear%max;
		array[rear] = data;
	}
	
	public int deque() {
		if(num == 0) {
			System.out.println("Is Empty!!");
			return-1;
		}
		num--;
		return array [(front = front++%max)]; 
	}
	
	public void clear() {
		rear = front-1;
		num = 0;
	}
	
	public int peek() {
		return array[front];
	}
	
	public int indexOf(int data) {
		int findIndex = -1;
		for(int i = 0; i<=num; i++) {
			int idx = (i + front)%max;
			if(array[idx] == data)
				findIndex = idx;
		}
		return findIndex;
	}
	
	public void dump() {
		if(num == 0) 
			System.out.println("Is Empty!!");
		else {
			for(int i = 0; i<=num; i++)
				System.out.println(array[(i+ front)%max]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
