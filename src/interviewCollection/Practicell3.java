package interviewCollection;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practicell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = {"Grapes", "Banna", "Mango", "Pineapple", "Apple", "Peaches"};

		 List<String> l1 = new LinkedList();
		 
		 for(String s1:fruits)
			 l1.add(s1);
			 System.out.println("List l1 :"+l1);
			 
	String[] vegetables = {"Beans", "Carrots", "Chilli", "Cabbage", "Tomatoes", "Pepper"}; 		 
		 
		 List<String> l2 = new LinkedList();
		 
		 for(String s2:vegetables)
			 l2.add(s2);
		 
		 System.out.println("list l2 :"+l2);
		 
		 l1.addAll(l2);
		 
		 printList(l1);
		 
		 removeItems(l1,2,5);
		 
		 printList(l1);
		 
		 reverseList(l1);
	}
//  printList method
	
	private static void printList(List<String>l){
		
		System.out.println("Print the list");
		for(String s3:l)
			System.out.print(s3 + " ");
		
		System.out.println();
		
	}
	
	private static void removeItems(List<String>l , int from , int to ){
		
		System.out.println("Updated list ");
		
		l.subList(from, to).clear();
		
		for(String s4:l)
		{ System.out.print(s4 + "   ");}
		
		System.out.println();
	}
	
	 private static void reverseList(List<String>l){
		 
		 System.out.println("reversed list");
		 
		 ListIterator it = l.listIterator(l.size());
		 
		 while(it.hasPrevious()){
			 System.out.print(it.previous() + " ");
		 }
		 
	 } 
}
