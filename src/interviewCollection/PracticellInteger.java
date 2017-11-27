package interviewCollection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class PracticellInteger {

	public static void main(String[] args) {
		
	int [] a1	= {12,34,35,56,78};
	List<Integer>l1 = new LinkedList<Integer>();
	
	   System.out.println("Printing the list l1");
	  for(int x1:a1){
		  l1.add(x1);}
		  System.out.println("List l1 :"+l1 + " ");
	  
	
	  int [] a2 = {11,12,14,16,18};
	  List<Integer>l2 = new LinkedList();
	  for(int x2:a2){
		  l2.add(x2);
	  }
	    System.out.println("listl2:"+l2);
	    
	    
	    l1.addAll(l2);
	    
	    System.out.println("Updated list l1 :"+l1);
	    
	    printEvenNumbers(l1);
	     removeNumbers(l1, 2,5);
	     reverseList(l1); 
			
	}
	public static void printEvenNumbers(List<Integer> l ){
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			Integer I = it.next();
			if(I%2 != 0){
				it.remove();
			}
			
		}
		 System.out.println("List l1 with even numbers"+l+ " ");
	}
	
	public static void removeNumbers(List<Integer> updatedList, int from , int to){
		
		updatedList.subList(2,5).clear();
		 
		System.out.println("updatedList :"+updatedList);
	}
	
	public static void reverseList(List<Integer> reversedList){
		
		ListIterator<Integer> it1 = (ListIterator<Integer>) reversedList.iterator();
		
		while(it1.hasPrevious()){
			System.out.print( "reversedList :"+it1.previous()+ "  ");
			
		}
		 
	}

}
