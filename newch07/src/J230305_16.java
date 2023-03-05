//예제 7-17
class J230305_16 {
	Object iv = new Object() { void method() {} };	//익명 클래스
	static Object cv = new Object() {void method() {} };//익명클래스 
	
	void myMethod() {
		Object lv = new Object() {void method(){} };
	}

}
