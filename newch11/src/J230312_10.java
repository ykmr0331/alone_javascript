//예제 11-5
import java.util.*;

class J230312_10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
		it = list.iterator();//새로운 iterator객체를 얻는다.
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}//main

	}


