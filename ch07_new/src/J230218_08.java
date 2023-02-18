public class J230218_08 {
	public static void main(String[] args) {
//		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		//위에 한줄이랑 밑에 네줄이 같은거임	
		Unit[] group = new Unit[3]; //객체 배열은 참조변수 묵은것
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);  
// group의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit		
  //	group[0].move(100, 200);
  //	group[0].move(100, 200);
  //	group[0].move(100, 200);  
	}
}
	
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}