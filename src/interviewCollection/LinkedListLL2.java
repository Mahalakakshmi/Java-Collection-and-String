package interviewCollection;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListLL2 {
	public static void main(String[] args){
		
		LinkedList l1 = new LinkedList();
		l1.add(28);
		l1.add(13);
		l1.add(17);
		l1.add(12);
		l1.add(10);
		l1.add(7);
		l1.add(9);
		
		System.out.println(l1);
		
		Iterator it = l1.iterator();
		
		while(it.hasNext()){
			Integer I = (Integer)it.next();
			
			if(I%2 != 0){
				it.remove();
			}
			
		}
		
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		
	  l2.addAll(l1); 
	  l2.addFirst(100);
	  l2.addLast(500);
	  l2.add(3,300);
	  l2.remove(1);
	  l2.addAll(2,l1);
	  
	  System.out.println(l2);
		
		
	}

}
