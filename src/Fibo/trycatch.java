package Fibo;

public class trycatch {

	public static void main(String[] args) {
		
		
		trycatch.RiskycodeMethod();
	}




public static int RiskycodeMethod(){
	try{
		System.out.println("try");
		int x = 4/0; 
		return 10; 
	}
	catch(Exception e){
		System.out.println("catch");
		
				
	}
	 finally{
		 System.out.println("finally");
	 }

	    return 100;
}
}