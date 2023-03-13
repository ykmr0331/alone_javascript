//3-5

//변수 num의 값에 따라 '양수','음수',0을 출력하는 코드다. 삼항연산자를 이용해서 (1)에 알맞은 코드를 넣으시오
class J230313_13 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));
	}

}
