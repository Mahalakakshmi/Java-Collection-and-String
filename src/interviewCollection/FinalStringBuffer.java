package interviewCollection;

public class FinalStringBuffer {

	public static void main(String[] args) {
		
		final StringBuffer sb = new StringBuffer("core");
		sb.append("java");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("web").append("Technologies").insert(3, "servelets").reverse().delete(1, 3);
		
		System.out.println(sb1);

	}

}
