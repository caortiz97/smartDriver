package smartDriver;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class carro extends JComponent {
	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0, 0, 1920, 1080);
	    window.getContentPane().add(new carro());
	    window.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {
		carvu(g);
		carvd(g);
		carhl(g);
		carhr(g);
		
	  }

	public static void carvu(Graphics g){
		Random rand = new Random();
			int carX = 0;
			int n = rand.nextInt(4) + 0;{
			switch(n){
			case 0:
				carX = street.avenueGarzaSada + 13;
				break;
			case 1:
				carX = street.avenueGarzaSada + 53;
				break;
			case 2:
				carX = street.avenueGarzaSada + 93;
				break;
			case 3:
				carX = street.avenueGarzaSada + 133;
				break;
			}
	    System.out.println(n);
		}
		Rectangle car1 = new Rectangle(carX, 970, 24, 65);
		Random rand1 = new Random();
		int pintura = rand1.nextInt(9) + 1;

		switch (pintura){

		case 1 : g.setColor(Color.red);
		break;
		case 2 : g.setColor(Color.green);
		break;
		case 3 : g.setColor(Color.blue);
		break;
		case 4 : g.setColor(Color.yellow);
		break;
		case 5 : g.setColor(Color.cyan);
		break;
		case 6 : g.setColor(Color.magenta);
		break;
		case 7 : g.setColor(Color.white);
		break;
		case 8 : g.setColor(Color.black);
		break;
		case 9 : g.setColor(Color.orange);
		break;
		}
	    g.fillRect(car1.x, car1.y, car1.width, car1.height); }
	
	public static void carvd(Graphics g){
		Random rand = new Random();
			int carX = 0;
			int n = rand.nextInt(4) + 0;{
			switch(n){
			case 0:
				carX = street.avenueGarzaSada - 37;
				break;
			case 1:
				carX = street.avenueGarzaSada - 77;
				break;
			case 2:
				carX = street.avenueGarzaSada - 117;
				break;
			case 3:
				carX = street.avenueGarzaSada - 157;
				break;
			}
	    System.out.println(n);
		}
		Rectangle car3 = new Rectangle(carX, 0, 24, 65);
		Random rand3 = new Random();
		int pintura = rand3.nextInt(9) + 1;

		switch (pintura){

		case 1 : g.setColor(Color.red);
		break;
		case 2 : g.setColor(Color.green);
		break;
		case 3 : g.setColor(Color.blue);
		break;
		case 4 : g.setColor(Color.yellow);
		break;
		case 5 : g.setColor(Color.cyan);
		break;
		case 6 : g.setColor(Color.magenta);
		break;
		case 7 : g.setColor(Color.white);
		break;
		case 8 : g.setColor(Color.black);
		break;
		case 9 : g.setColor(Color.orange);
		break;
		}
	    g.fillRect(car3.x, car3.y, car3.width, car3.height); }
	
	
	
	
	
	
	
	public static void carhl(Graphics g){
		int carY = 0;
			Random rand = new Random();
			int n = rand.nextInt(4) + 0;{
			switch(n){
			case 0:
				carY = street.avenueRevolucion + 13;
				break;
			case 1:
				carY = street.avenueRevolucion + 53;
				break;
			case 2:
				carY = street.avenueRevolucion + 93;
				break;
			case 3:
				carY = street.avenueRevolucion + 133;
				break;
			}
		    System.out.println(n);
			}
			Rectangle car1 = new Rectangle(0, carY, 65, 24);
			
			Random rand2 = new Random();
			int pintura = rand2.nextInt(10) + 0;

			switch (pintura){

			case 1 : g.setColor(Color.red);
			break;
			case 2 : g.setColor(Color.green);
			break;
			case 3 : g.setColor(Color.blue);
			break;
			case 4 : g.setColor(Color.yellow);
			break;
			case 5 : g.setColor(Color.cyan);
			break;
			case 6 : g.setColor(Color.magenta);
			break;
			case 7 : g.setColor(Color.white);
			break;
			case 8 : g.setColor(Color.black);
			break;
			case 9 : g.setColor(Color.orange);
			break;
			}
		    g.fillRect(car1.x, car1.y, car1.width, car1.height);
	}

	public static void carhr(Graphics g){
		int carY = 0;
			Random rand = new Random();
			int n = rand.nextInt(4) + 0;{
			switch(n){
			case 0:
				carY = street.avenueRevolucion - 37;
				break;
			case 1:
				carY = street.avenueRevolucion - 77;
				break;
			case 2:
				carY = street.avenueRevolucion - 117;
				break;
			case 3:
				carY = street.avenueRevolucion - 157;
				break;
			}
		    System.out.println(n);
			}
			Rectangle car4 = new Rectangle(1835, carY, 65, 24);
			
			Random rand4 = new Random();
			int pintura = rand4.nextInt(10) + 0;

			switch (pintura){

			case 1 : g.setColor(Color.red);
			break;
			case 2 : g.setColor(Color.green);
			break;
			case 3 : g.setColor(Color.blue);
			break;
			case 4 : g.setColor(Color.yellow);
			break;
			case 5 : g.setColor(Color.cyan);
			break;
			case 6 : g.setColor(Color.magenta);
			break;
			case 7 : g.setColor(Color.white);
			break;
			case 8 : g.setColor(Color.black);
			break;
			case 9 : g.setColor(Color.orange);
			break;
			}
		    g.fillRect(car4.x, car4.y, car4.width, car4.height);
	}
	
	
	
}