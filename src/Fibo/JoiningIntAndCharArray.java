package Fibo;

public class JoiningIntAndCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[]= {1,2,3};
		char charArr[] = {'a','b','c'};
		
		  for(int i = 0; i<3; i++){
			  System.out.print(arr[i]+ " " );
		  }
			 
			for(int j=0; j<3; j++){
				System.out.print( charArr[j] + " ");
			}
			
			
			System.out.println();
			for(int k =0; k<3;k++){
				System.out.print(arr[k]+" "+ charArr[k]+" ");
			}
		
	}

}
