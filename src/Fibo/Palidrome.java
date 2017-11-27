package Fibo;

public class Palidrome {

	public static void main(String[] args) {
		
		int n = 121 , r, s=0;
		int t=n;
				
		while(n>0){
			r= n%10;
			n =n/10;
			s=s*10+r;
			 
		}
		
      System.out.println(s);
      
      if(t==s){ System.out.println("n is a Palindrome");}
      
      else{ System.out.println("n is not a palindrome");}
		
      
     
}
}
