import java.util.Objects;

//예제 9-4

class Card {
	String kind;
	int number;
	
	Card() {
		this("SADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	//equals를 오버리이딩하면 hashCode()도 오버리이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number);//괄호 안에 iv넣어주면된다.
		  
	}
	
	
	
	//equals 오버라이딩해보자
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;//obj를 카드로 형변환한다.
		return this.kind. equals (c.kind)&& this.number == c.number;
	}
	
	
	
	
	
	//Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "kind:"+kind+", number:" + number;
		//객체를 문자열로 바꾼다는 것은 iv를 문자열로 바꾼다는 것임
		//클래스이름에 주소 나오는 것보다 객체가 가지고있는 iv를 출력하는게 더 유용하니까
	}


}

	




class J230307_04 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());//iv값이 같으므로 같은 값이 나온다 c1이랑
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
