//예제 9-2

class Person {
	long id;
	//보통 클래스를 새로 만들 때는 equals는 기본적으로 iv값을 비교하도록 오버리이딩해줘야한다.
	public boolean equals(Object obj) {//원래 equals는 주소비교인데 id를 비교하기로 바꿈
		if(obj instanceof Person)	
			return id ==((Person)obj).id; //obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
		else
			return false;		//타입이 Person이 아니면 값을 비교할 필요도 없다.
	}
	
	Person(long id) {
		this.id = id;//this는 클래스 Person을 의미
	}
}

class J230307_02 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
	
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}

}
