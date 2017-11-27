package interviewCollection;
import java.util.LinkedList;
import java.util.Iterator;
public class PracticeLL {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(null);
		l.add(1);
		l.add("Java");
		l.add(12.4);
		
		System.out.println("linkedlist l:"+l);
		
		LinkedList l2 = new LinkedList();
		for(int i = 0; i <=l.size(); i++){
			
			if(i%2 != 0 ){
				l2.add(i);
			}
			
				}
		
		System.out.println("linkedlist l2 with odd numbers"+l2);
		
		
		LinkedList l3 = new LinkedList();
		l3.addAll(l);
		l3.remove(null);
		l3.addFirst(new Integer(28));
		l3.addLast(90);
		
		l3.add(3,l);
		l3.addAll(2,l);
		System.out.println(l3);
	}

}
