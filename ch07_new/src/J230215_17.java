//오버라이딩
class MyPoint4 extends Object {
	int x;
	int y;
	
	MyPoint4(int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	//Object클래스의 toString()을 오버라이딩하는것
	public String toString() { //원래 object클래스의 toString()에 public이 붙어있어서 있는거
		return "x:" +x+", y:" +y;

	}
}

public class J230215_17 {
	public static void main(String[] args) {
		MyPoint4 p = new MyPoint4(31,25);// this를 이용해서 이게 가능
	//	p.x = 3;
	//	p.y = 5;
//		System.out.println(p.toString());// 이게 더 편함
		System.out.println(p);// 젤 편해
//		System.out.println("p.x="+p.x);
//		System.out.println("p.y="+p.y);
	}

}
