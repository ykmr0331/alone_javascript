//예제 11-3
import java.util.*;


class J230312_08 {
	public static void main(String[] args) {
//		if (args.length !=1) {
//			System.out.println("Usage:java J230312_08 \"EXPRESSION\"");
//			System.out.println("EXAMPLE:java J230312_08 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((2+3)*1+3";
		
		System.out.println("expression:" + expression);
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(' ) {
					st.push(ch +"");
				} else if (ch ==')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다..");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.2222");
		}//try
	}

}
