//270쪽 내부클래스와 외부클래스

class AAA {//AAA는 BBB의 외부 클래스
	int i = 100;
	BBB b = new BBB();


	class BBB {//BBB는 AAA의 내부클래스
		void method() {
			AAA a = new AAA();
			System.out.println(a.i);
			System.out.println(i);//객체 생성없이 외부 클래스의 멤버 접근 가능
		}
	} 
}

//class ccc {
//	BBB b=new BBB(); BBB클래스는 AAA클래스 안에서만 사용 가능하기에 못씀
//}


public class J230220_03 {
	public static void main(String[] args) {
//		BBB b= new BBB();//BBB클래스는 AAA클래스 안에서만 사용 가능하기에 못씀
//		b.method();

	}

}
