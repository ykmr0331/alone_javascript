//예제 8-1 try-catch문에서의 흐름
public class J230220_11 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4); //실행되지 않는다. 발생한 예외가 없기에  try-catch문을 빠져나가서 수행을 계쏙한다.
		}//try-catch의 끝
		System.out.println(5);
	}
}
