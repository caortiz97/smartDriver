package smartDriver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class street extends JComponent {
	private Object g;
	Rectangle lanePart = new Rectangle(500, 500, 100, 20);
	
	
	

	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0, 0, 1920, 1080);
	    window.getContentPane().add(new street());
	    window.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.darkGray);
	    g.fillRect(lanePart.x, lanePart.y, lanePart.width, lanePart.height);
	  }
}
