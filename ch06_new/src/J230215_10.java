//에제6-13 생성자에서 다른 생성자 호출하기 this()

class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4); // this가 호출가능한 첫줄(한 생성자에서 다른 생성자 호출할 때)
		}

	Car2(String color) {
		this(color, "auto", 4);  // this가 호출가능한 첫줄(한 생성자에서 다른 생성자 호출할 때)
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
class J230215_10{
	public static void main(String[] args) {
		Car2 c1 = new Car2();	  //인스턴스 변수
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}