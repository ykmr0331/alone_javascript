//예제 7-17 익명클래스


public class J230220_09 {
	Object iv = new Object() {void method(){} }; //익명클래스     //Object클래스가 조상클래스니까
	static Object cv = new Object() {void method(){} }; //익명클래스
	
	void myMethod() {
		Object lv = new Object() {void method(){}};
	}
}
/*
 new 조상클래스이름() {
 	//멤버 선언
 }
 
 	또는
 	
new 구현인터페이스이름() {
	//멤버 선언
	}
 */