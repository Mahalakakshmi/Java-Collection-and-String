package practice;

public class fibonacci {

	public static void main(String[] args) {
		int k = 0 , a = 1, b=1;
		
		System.out.print("1  1");
		
		for(int i = 0 ; i<=10; i++){
			
			k = a+b;
			System.out.print( " " +k);	
			
			a = b;
			 b = k;
			
					
		}
		
		
	}

}
