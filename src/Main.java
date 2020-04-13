import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main();
	}

	public Main() {
		this.setVisible(false);
		this.setSize(300, 300);
		
		JOptionPane.showMessageDialog(this, "Welcome to Ultra-Vision");
		
		this.validate();
		this.repaint();
	}
}
