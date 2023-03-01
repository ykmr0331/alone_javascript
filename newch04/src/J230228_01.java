//예제 4-17 continue 문
public class J230228_01 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i ++) {
			if (i % 3 ==0) 
				continue;
			System.out.println(i);
		}

	}

}
