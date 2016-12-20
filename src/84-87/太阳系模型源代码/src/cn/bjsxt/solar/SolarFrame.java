package cn.bjsxt.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.util.Constant1;
import cn.bjsxt.util.GameUtil1;
import cn.bjsxt.util.MyFrame1;

/**
 * 太阳系的主窗口
 * @author dell
 *
 */
public class SolarFrame extends MyFrame1 {
	Image bg = GameUtil1.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant1.GAME_WIDTH/2, Constant1.GAME_HEIGHT/2);
	Planet earth = new Planet(sun, "images/earth.jpg", 150, 100, 0.1);
	Planet moon = new Planet(earth, "images/moon.jpg", 30, 20, 0.3,true);
	Planet mars = new Planet(sun, "images/Mars.jpg", 200, 130, 0.2);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		
		moon.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
