//예제 3-9 p.82
public class J230227_21 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;

		long c = a * b; //a,b 둘다 int 타입이니가 안된다.
		System.out.println(c);
	}

}
