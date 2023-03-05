//예제 7-19

import java.awt.*;
import java.awt.event.*;

class J230305_17 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}
	  );
	}
}
