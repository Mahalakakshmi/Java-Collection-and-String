package Fibo;

public class Fibonacci {

	public static void main(String[] args) {
		
		int k , a= 1 , b = 1;
		 k = 0;
		 
		 System.out.print("1  1  ");
		 
		 for(int i= 0; i <=10 ; i++){
		 
		 while( k >=0 ){
			 
			 
			 
			 k = a+b;
			 
			 System.out.print( k +  "  ");
			 
			 a = b;
			 b = k;
		   			 
		 }
		 }
		
	}
	
	
}	