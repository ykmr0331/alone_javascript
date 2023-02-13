import java.util.Iterator;

public class J230213_19 {
	//ch4-12 임의의 정수 만들기  35강
	public static void main(String[] args) {
	
	//예제 4-7
		int num = 0;
		
		for(int i = 1; i <= 20; i ++) {
			System.out.println(Math.random()); //0.0<=x<1.0
			System.out.println(Math.random()*10); //0.0<=x<10.0
			System.out.println((int)(Math.random()*10)); //0<=x<10, 0~9
			System.out.println((int)(Math.random()*10)+1); //1<=x<11, 1~10
		}
	}

}
