package interviewCollection;
import java.util.LinkedList;
import java.util.Iterator;
public class ExampleList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(12);
		l.add(8);
		l.add(0);
		l.add(11);
		l.add(null);
		System.out.println(l);
		
		LinkedList l2= new LinkedList();
		for(int i = 0; i<=10; i++){
			l2.add(i);
			
		}
		System.out.println(l2);
		
		Iterator it = l2.iterator();
		while(it.hasNext()){
			Integer I = (Integer)it.next();
			
			if(I%2 == 0){
				System.out.print(I+ " ");
							}
			else{it.remove();}
			
		}
		System.out.println();
		System.out.println(  "Updated LinkedList:"+l2);
	}

}
