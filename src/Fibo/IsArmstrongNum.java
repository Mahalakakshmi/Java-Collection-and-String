package Fibo;

public class IsArmstrongNum {

	public static void main(String[] args) {
		
	
		// 153 = 1*1*1 + 5*5*5 +3*3*3  = 153
		
		int n = 155;
		int temp = n;
		int r, sum = 0;
		
		while(n >0 ){
			
			r = n%10;
			n = n/10;
			sum = sum +r*r*r;
			}
		
		if( temp == sum){
			System.out.println("Given number is a armstrong");
		}
		else{
			System.out.println("Given number is not a armstrong");
		}
	}

}
