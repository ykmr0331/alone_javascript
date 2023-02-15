
public class J230215_01 {
	//ch6-14~16 메서드란? 메서드의 선언부와 구현부
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result = mm.max(5, 3);
		long resultt = mm.min(5, 3);
		mm.printGugudan(3); //구구단 3단 출력
		mm.printGugudan(12); //구구단 12단 출력, 실행안된다.
		
		System.out.println("min(5l,3l) = " + resultt);
		System.out.println("max(5l,3l) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9))
			return; //입력받은 단이 2~9가 아니면,메서드 종료하고 나가기
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d *%d = %d%n", dan, i, dan * i);
		}
	}
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	//두 값을 받아서 둘 중에 큰 값을 반한하는 메서드를 작성하세요
	long  max (long a, long b) {
		long result = 0;
		if (a>b) {
			result = a;
		} else {
			result =b;	// result = a > b ? a : b; 이렇게 표현할 수도 있다.
		}
		return result; 
	}
	
	//두 값을 받아서 둘 중에 작은 값을 반한하는 메서드를 작성하세요
		long  min (long c, long d) {
			long result = 0;
			if (c<d) {
				result = c;
			} else {
				result =d;	// result = c < d ? c : d; 이렇게 표현할 수도 있다.
			}
			return result; 
		}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
	
	
		
		
	


