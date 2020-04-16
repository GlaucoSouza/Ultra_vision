import javax.swing.JFrame;
import javax.swing.JOptionPane;

import titles.TV_Box_Set;

public class Main extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		TV_Box_Set tvbox = new TV_Box_Set("2020", "DVD", "Lost", false, 2);
		
		tvbox.getYearOfRelease().toString();
		
		
		System.out.println(tvbox);
		
		
	}
	
	
	
//
//	public Main() {
//		this.setVisible(false);
//		this.setSize(300, 300);
//		
//		JOptionPane.showMessageDialog(this, "Welcome to Ultra-Vision");
//		
//		this.validate();
//		this.repaint();
//	}
}
