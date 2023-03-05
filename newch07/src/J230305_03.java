//예제 7-3
class J230305_03 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x = 10; /*super.x 와 this.x. 둘 다 기능*/}
	
class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x =" + this.x);
		System.out.println("super.x =" +super.x);
	}
}