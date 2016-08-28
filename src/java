package smartDriver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class street extends JComponent {


	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0, 0, 1920, 1080);
	    window.getContentPane().add(new street());
	    window.setVisible(true);
	}
	
	
	
	public void paint(Graphics g) {
		avenue4ln2wVer(960,705,500,g);
		avenue4ln2wVer(960,-125,500,g);
		avenue4ln2wHor(-205,540,1000,g);
		avenue4ln2wHor(1125,540,1000,g);
		g.setColor(Color.darkGray);
		g.fillRect(795, 375, 330, 330);
	}



	private void laneUp(int x, int y, int height, Graphics g) {
		int laneX = x;
		int laneStartY = y;
		int laneHeight = 500;
		for(int lane=0; lane<laneHeight; lane=lane+20){
			if(lane<100){
				g.setColor(Color.darkGray);
				g.fillRect(laneX, laneStartY+lane, 40, 20);
				g.setColor(Color.white);
				g.fillRect(laneX, laneStartY+lane, 2, 20);
			}
			else{
				g.setColor(Color.darkGray);
				g.fillRect(laneX, laneStartY+lane, 40, 20);
				g.setColor(Color.white);
				g.fillRect(laneX, laneStartY+lane+20/4, 2, 20/2);
			}
		}
		
	}
	
	private void laneDown(int x, int y, int height, Graphics g) {
		int laneX = x;
		int laneStartY = y;
		int laneHeight = 500;
		for(int lane=0; lane<laneHeight; lane=lane+20){
			if(laneHeight-lane<100){
				g.setColor(Color.darkGray);
				g.fillRect(laneX, laneStartY+lane, 40, 20);
				g.setColor(Color.white);
				g.fillRect(laneX+38, laneStartY+lane, 2, 20);
			}
			
			else{
				g.setColor(Color.darkGray);
				g.fillRect(laneX, laneStartY+lane, 40, 20);
				g.setColor(Color.white);
				g.fillRect(laneX+38, laneStartY+lane+20/4, 2, 20/2);
			}
		}
		
	}
	
	private void laneVerMid(int x, int y, int height, Graphics g) {
		int laneX = x;
		int laneStartY = y;
		int laneHeight = 500;
		for(int lane=0; lane<laneHeight; lane=lane+20){
			g.setColor(Color.darkGray);
			g.fillRect(laneX, laneStartY+lane, 40, 20);
		}
		
	}
	
	private void avenue4ln2wVer(int x, int y, int Longitude, Graphics g){
		laneVerMid(x+5,y,Longitude,g);
		laneUp(x+45,y,Longitude,g);
		laneUp(x+85,y,Longitude,g);
		laneUp(x+125,y,Longitude,g);
		laneVerMid(x-45,y,Longitude,g);
		laneDown(x-85,y,Longitude,g);
		laneDown(x-125,y,Longitude,g);
		laneDown(x-165,y,Longitude,g);
		g.setColor(Color.orange);
		for(int i=0; i<160; i=i+10){ 
			g.fillRect(x+5+i, y+5, 5, 20);
			g.fillRect(x-160+i, y+5, 5, 20);
			g.fillRect(x+5+i, y+Longitude-25, 5, 20);
			g.fillRect(x-160+i, y+Longitude-25, 5, 20);
		}
		g.setColor(new Color(102,205,0));
		g.fillRect(x-5, y, 10, Longitude);
		g.setColor(Color.white);
		g.fillRect(x+5, y, 160, 5);
		g.setColor(Color.white);
		g.fillRect(x-330/2, y+Longitude-5, 160, 5);
	}
	
	
	private void laneRight(int x, int y, int Longitude, Graphics g) {
		int laneStartX = x;
		int laneY = y;
		int laneLong = Longitude;
		for(int lane=0; lane<laneLong; lane=lane+20){
			if(laneLong-lane<100){
				g.setColor(Color.darkGray);
				g.fillRect(laneStartX+lane, laneY, 20, 40);
				g.setColor(Color.white);
				g.fillRect(laneStartX+lane, laneY, 20, 2);
			}
			
			else{
				g.setColor(Color.darkGray);
				g.fillRect(laneStartX+lane, laneY, 20, 40);
				g.setColor(Color.white);
				g.fillRect(laneStartX+lane+20/4, laneY, 20/2, 2);
			}
		}
		
	}
	
	private void laneLeft(int x, int y, int Longitude, Graphics g) {
		int laneStartX = x;
		int laneY = y;
		int laneLong = Longitude;
		for(int lane=0; lane<laneLong; lane=lane+20){
			if(lane<100){
				g.setColor(Color.darkGray);
				g.fillRect(laneStartX+lane, laneY, 20, 40);
				g.setColor(Color.white);
				g.fillRect(laneStartX+lane, laneY+38, 20, 2);
			}
			
			else{
				g.setColor(Color.darkGray);
				g.fillRect(laneStartX+lane, laneY, 20, 40);
				g.setColor(Color.white);
				g.fillRect(laneStartX+lane+20/4, laneY+38, 20/2, 2);
			}
		}
		
	}
	
	private void laneHorMid(int x, int y, int Longitude, Graphics g) {
		int laneStartX = x;
		int laneY = y;
		int laneHeight = Longitude;
		for(int lane=0; lane<laneHeight; lane=lane+20){
			g.setColor(Color.darkGray);
			g.fillRect(laneStartX+lane, laneY, 20, 40);
		}
		
	}
	
	private void avenue4ln2wHor(int x, int y, int Longitude, Graphics g){
		laneHorMid(x,y+5,Longitude,g);
		laneRight(x,y+45,Longitude,g);
		laneRight(x,y+85,Longitude,g);
		laneRight(x,y+125,Longitude,g);
		laneHorMid(x,y-45,Longitude,g);
		laneLeft(x,y-85,Longitude,g);
		laneLeft(x,y-125,Longitude,g);
		laneLeft(x,y-165,Longitude,g);
		g.setColor(new Color(102,205,0));
		g.fillRect(x, y-5, Longitude, 10);
		g.setColor(Color.orange);
		for(int i=0; i<160; i=i+10){ 
			g.fillRect(x+5, y+5+i, 20, 5);
			g.fillRect(x+5, y-160+i, 20, 5);
			g.fillRect(x+Longitude-25, y+5+i, 20, 5);
			g.fillRect(x+Longitude-25, y-160+i, 20, 5);
		}
		g.setColor(Color.white);
		g.fillRect(x, y-330/2, 5, 160);
		g.fillRect(x+Longitude-5, y+5, 5, 160);
	}
	
}
