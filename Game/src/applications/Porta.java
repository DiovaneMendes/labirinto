package applications;

import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.Sprite;

public class Porta{
	Sprite p1, p2, p3, p4, p5, p6;
	int northX = Resolution.MSX.width/5-2, northY = Resolution.MSX.height-192;
	int southX = Resolution.MSX.width/5-2, southY = Resolution.MSX.height-122;
	int eastX = Resolution.MSX.width/10-25, eastY = Resolution.MSX.height-160;
	int westX = Resolution.MSX.width/5+20, westY = Resolution.MSX.height-160;
	int upX = Resolution.MSX.width/4-50, upY= Resolution.MSX.height-192;
	int downX = Resolution.MSX.width/4-50, downY = Resolution.MSX.height-122;
	
	public Porta(){
		
	}
	
	public Sprite north(){
		p1 = new Sprite(10, 2, Color.BLUE);
		p1.setPosition(northX, northY);
		return p1;
	}
	
	public Sprite south(){
		p2 = new Sprite(10, 2, Color.BLUE);
		p2.setPosition(southX, southY);
		return p2;
	}
	
	public Sprite east(){
		p3 = new Sprite(2, 10, Color.BLUE);
		p3.setPosition(eastX, eastY);
		return p3;
	}
	
	public Sprite west(){
		p4 = new Sprite(2, 10, Color.BLUE);
		p4.setPosition(westX, westY);
		return p4;
	}
	
	public Sprite up(){
		p5 = new Sprite(10, 2, Color.BLUE);
		p5.setPosition(upX, upY);
		return p5;
	}
	
	public Sprite down(){
		p6 = new Sprite(10, 2, Color.BLUE);
		p6.setPosition(downX, downY);
		return p6;
	}
}