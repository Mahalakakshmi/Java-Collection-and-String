package Fibo;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int x[] ={12,34,23,87,90,34};
		
		System.out.println("printing an array");
		
		for(int i = 0 ; i < x.length; i++){
			System.out.print(x[i]+ " ");
		}
	      
		System.out.println();
		System.out.println("Using for each loop");
		 for(int k:x ){
			 System.out.print( k + " ");
		 }
		  
		 System.out.println();
		 System.out.println("Reversing an array");
	
	for(int j = x.length-1; j<=x.length; j--)
	{
		System.out.print(x[j]+" ");
		if(j == 0){break;}
	}

}
}
