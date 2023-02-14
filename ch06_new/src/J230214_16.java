
public class J230214_16 {
//예제 6-2 객체의 생서와 사용 예제
		public static void main(String args[]) {
			Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
			Tv t2 = new Tv();
			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

			t1.channel = 7;    // channel 값을 7으로 한다.
			System.out.println("t1의 channel값을 7로 변경하였습니다.");

			
			t2 = t1; //참조변수 t1의 값을 t2에 저장, 이렇게 하면 
			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");// 7
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");//원래 0이 나와야하는데 14항 때문에 7이 나온다
		}
	}