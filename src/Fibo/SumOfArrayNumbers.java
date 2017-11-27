package Fibo;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] ={12,34,23,87,90,34};
		
		for(int y :x){
			System.out.print(  y + " ");
		}
		
		
		  System.out.println();  
		 System.out.println("Reversing an array");
		for(int z = x.length-1; z <= 0 ; z--){
			System.out.print(x[z]+ " ");
		}
		
		
		System.out.println();
		
		
		int sum = 0;
		for( int i = 0; i<x.length; i++ ){
			sum= sum +x[i];
		}
		System.out.print(sum);
	}
       
      
	  
		  
	  
	
}
