package search;

public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] introduce = {"My name","is Kim", "Hojun", "my job is", "student"};
		
		String want_find = "student";
		
		boolean find = false;
		
		for(int i=0; i<5; i++) {
			if(want_find == introduce[i]) {
				find = true;
				break;
			}
		}
		System.out.println(find);
	}

}
