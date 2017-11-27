package Fibo;
import java.util.Arrays;

public class TwoDArrayPrinting {

	public static void main(String[] args) {
		
		int[][] printarray = {{34,565, 78, 90}, { 567, 980, 42}};
		
		for(int[] x: printarray)
		System.out.println(Arrays.toString(x));
		
		System.out.println("[0][0] :" + printarray[0][0]);
		
		System.out.println("[1][2] :" + printarray[1][2]);
		
		System.out.println("[1][1] :" + printarray[1][1]);
		
	
	}

}
