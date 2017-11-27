package Fibo;

public class FindMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x[] ={12,56,34,66};
       int max= 0;
       for(int i = 0; i< x.length;i++){
    	      	  
    		if(x[i] > max ){
    			max = x[i];
    		} 	   
    			   
    	   }
       
       System.out.print(max);
	}
	

}
