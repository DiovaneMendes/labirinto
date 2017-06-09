package model;

import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.Sprite;

public class Porta{
	public Sprite p1, p2, p3, p4, p5, p6;
	
	public Porta(){
		
	}
	
	//(10, 2, Color.BLUE)
	public Sprite north(){
		p1 = new Sprite(10, 2, Color.BLUE);
		p1.setPosition(
			Resolution.MSX.width/5-2,
			Resolution.MSX.height-192);
		return p1;
	}
	
	//(10, 2, Color.BLUE)
	public Sprite south(){
		p2 = new Sprite(10, 2, Color.BLUE);
		p2.setPosition(
			Resolution.MSX.width/5-2,
			Resolution.MSX.height-122);
		return p2;
	}
	
	//(10, 2, Color.BLUE)
	public Sprite up(){
		p3 = new Sprite(10, 2, Color.BLUE);
		p3.setPosition(
			Resolution.MSX.width/4-50,
			Resolution.MSX.height-192);
		return p3;
	}
	
	//(10, 2, Color.BLUE)
	public Sprite down(){
		p4 = new Sprite(10, 2, Color.BLUE);
		p4.setPosition(
			Resolution.MSX.width/4-50,
			Resolution.MSX.height-122);
		return p4;
	}
	
	//(2, 10, Color.BLUE)
	public Sprite east(){
		p5 = new Sprite(2, 10, Color.BLUE);
		p5.setPosition(
			Resolution.MSX.width/10-25,
			Resolution.MSX.height-160);
		return p5;
	}
	
	//(2, 10, Color.BLUE)
	public Sprite west(){
		p6 = new Sprite(2, 10, Color.BLUE);
		p6.setPosition(
			Resolution.MSX.width/5+20,
			Resolution.MSX.height-160);
		return p6;
	}
}