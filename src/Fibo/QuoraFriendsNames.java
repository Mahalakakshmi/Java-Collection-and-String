package Fibo;
import java.util.Scanner;
public class QuoraFriendsNames {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// decide number of friends
		
		System.out.print("Enter how many friends : ");
		
		int numOfFriends = Integer.parseInt(scan.nextLine());
		
		// create a string array to store number of your  friends
		
		String arrayOfNames[] = new String[numOfFriends];
		for(int i = 0; i < arrayOfNames.length; i++  ){
			System.out.print("Enter the name of the friends :" +(i+1)+ ":");
		
		  arrayOfNames[i] = scan.nextLine();}
		
		// now show your friends name one by one
		
		for(int i = 0; i < arrayOfNames.length; i++){
			System.out.println("My Friend :" +(i+1) + ":");
			
			System.out.print(arrayOfNames[i] + "\n");
				
		}
		
		
		
	}

}
