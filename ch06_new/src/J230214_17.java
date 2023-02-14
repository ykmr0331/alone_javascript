
public class J230214_17 {

	
//예제 6-3 클래스 변수와 인스턴스 변수 예제
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);// 여기 두개 클래스 변수 덕분에 19항 20항에서 100,250이 나올 수 있다.
		System.out.println("Card.height = " + Card.height);/*클래스 변수(static변수)는
		(여기서는 Card.height)  객체생성없이 '클래스이름.클래스 변수'로 직접 사용가능하다.*/

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";//인스턴스 변수의 값을 변경한다
		c2.number = 4;		//인스턴스 변수의 값을 변경한다

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;//인스턴스 변수 같아보이지만 클래스 변수다. 그러므로 오해하지 않도록 이렇게 바꿔야한다. Card.width = 50;
		c1.height = 80;//인스턴스 변수 같아보이지만 클래스 변수다. 그러므로 오해하지 않도록 이렇게 바꿔야한다. Card.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");//C2도 바뀌는데 왜지? 이유는 클래스객체이기 때문이다.
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}