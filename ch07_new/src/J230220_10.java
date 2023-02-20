//예제 7-19 익명클래스

import java.awt.*;
import java.awt.event.*;

class J230220_10 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {    //new 구현인터페이스이름() {//멤버선언}   //익명클래ㅡ
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occurred!!!");
				}
			} // 익명 클래스의 끝
		);
	} // main의 끝
} 