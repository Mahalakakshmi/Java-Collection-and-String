package interviewCollection;

public class StringNullComp {
	
	public static void main(String[] args) {
		
		/*when we use new keyword String" java" is created at the heap memory.
		  
		   otherwise, String s1 creates object"Java" in SCP--String constant pool memory.
		 */
		
		String s1 = "Java";
	    String s2 = new String("Java");	
	    
	    String s3 = " ";
	    String s4 = null;
	    if(s1 == s2){
	    	System.out.println("s1 and s2 both "
	    			+ "are pointing to the same memory address");
	    } 
	    
	    else{System.out.println("s1 and s2 pointing to different memory address");}
	
       System.out.println( s3 instanceof Object );
       System.out.println( s4 instanceof Object );
       
       System.out.println(s3.equals(s4));
       //System.out.println(s1.equals(s2) );
       
       System.out.println(s3 == s4);       
	  if(s3 == s4){
		  System.out.println("s3 and s4 both are pointing towards same memory address");
	  }
	  else{System.out.println("s3 and s4 both are referring to the different memory address");}
	  
	  
	  System.out.println( s1.equals(s2));
	  System.out.println( s3.equals(s4));
}
}