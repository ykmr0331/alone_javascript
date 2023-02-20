//예제 7-16 내부클래스의 제어자와 접근성 예제 5
class Outer3 {
	int value = 10; //Outer3.this.value
			
			class Inner {
		int value = 20;	//this.value
		
		void method1() {
			int value = 30;
			System.out.println("			value :" + value); //value는 lv
			System.out.println("	   this.value :" + this.value);//this.value는 iv
			System.out.println("Outer3.this.value :" + Outer3.this.value);//외부클래스 iv
		}
	}//Inner클래스의 끝
}//Outer3클래스의 끝

public class J230220_08 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
	}
}
