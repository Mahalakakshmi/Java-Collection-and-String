package Fibo;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	      		int n = 576;
	     System.out.println(Palindrome1.reverse(576));
	     
	     if (n == Palindrome1.reverse(576)){
	    	
	    	 System.out.println("n is a Palindrome ");
	    	 
	     }
	     else{ System.out.println("n is not a Palindrome ");}
	     
	     
	}
	
	public static int reverse(int num){
		
  	  StringBuffer str = new StringBuffer(num + "");
  	  
  	  return  Integer.parseInt(str.reverse().toString());
  	  
    }
}
