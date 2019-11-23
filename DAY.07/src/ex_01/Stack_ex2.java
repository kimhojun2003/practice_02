package ex_01;
import java.util.Scanner;
public class Stack_ex2 {
	private int [] stk;
	private int max;
	private int ptr;
	
	public Stack_ex2(int max_in) {
		ptr = 0;
		max = max_in;
		stk = new int[max];
	}
	
	public int push(int data) {
		if(ptr>=max) 
			return -1;
		stk[ptr++] = data;
		return 0;
	}
	
	public int pop(int data) {
		if(ptr<=0)
			return -1;
		return stk[--ptr];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
