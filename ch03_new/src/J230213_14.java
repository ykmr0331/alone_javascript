
public class J230213_14 {
//연습문제 3
	public static void main(String[] args) {
		//연습문제 3-4
			//만일 사과의 수가 123개이고 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다. 이에 알맞은 코드를 넣어라

		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("필요한 바구니의 수:" +numOfBucket);
	
		
		//연습문제 3-5
			//아래는 변수 num의 값에 따라 양수 음수 0을 출력하는 코드다. 삼항연산다를 이용해서 코드를 작성해라
		int num = 10;
		System.out.println( num > 0 ? "양수" :(num == 0 ? 0 : "음수"));
		
		
		//연습문제 3-6
			//화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드를 작성해보자
			//'C =5/9 * (F-32)'
			int fahrenheit = 100;
			float celcius =(int)((5/9f * (fahrenheit-32)) * 100 + 0.5) /100f;
								//'5/9'는 실수니까 f붙여주고, 끝에 10도 실수로 표현해야되니까 f붙여주고
			
			
			System.out.println("Fahrenheit:" +fahrenheit);
			System.out.println("Celcius:" +celcius);
	}
				//xxxyy.yy
}				//xxxyy	
