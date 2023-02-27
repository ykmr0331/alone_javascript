//예제 2-8 p.55
public class J230227_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 5; //int x = 10; int y = 5;를 한줄로 표시
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
