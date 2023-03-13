//3-4

//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오
class J230313_12 {
	public static void main(String[] args) {
		int numOfApples = 123;	//사과의 개수
		int sizeOfBucket	=10;	//바구니의크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples/10) + (numOfApples%10 > 1 ? 1 : 0));//모든 사과를 담는데 필요한 바구니의 수
				//10을 sizeOfBucket으로 바꾸면 더 좋을 것 같다.
		
		System.out.println("필요한 바구니의 수:" +numOfBucket);  //13이 나와야겠지

	}

}


//123개는 12바구니하고 1바구니가 더 필요하다.
/*10으로 나눈다음에 소수점자리가 0이 아니면 올림*/
/* (numOfApples/10) + (numOfApples%10 > 1 ? 1 : 0)  */