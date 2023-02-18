class J230215_18 {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();//child에 메소드 하나 더생성
	}
}

class Parent { int x=10; }

class Child extends Parent {
	int x=20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);//super는 자손클래스에서 조상 클래스로부터 상속받은 멤버를 참조함
	}
}