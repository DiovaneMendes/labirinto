package applications;

import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.Sprite;

public class Inimigo {
	Sprite i1, i2, i3;
	int inimigoX, inimigoY;	
	private int definicao;
	
	public Inimigo(){
		
	}
	
	//Desenhando inimigos com Sprite
	public Sprite goblin(){
		posicao();
		i1 = new Sprite(5, 5, Color.GREEN);
		i1.setPosition(inimigoX, inimigoY);
		return i1;
	}
	
	public Sprite orc(){
		posicao();
		i2 = new Sprite(5, 5, Color.RED);
		i2.setPosition(inimigoX, inimigoY);
		return i2;
	}
	
	public Sprite troll(){
		posicao();
		i3 = new Sprite(5, 5, Color.BLUE);
		i3.setPosition(inimigoX, inimigoY);
		return i3;
	}
	
	//Recebido por parametro o numero o qual representa cada porta 
	public void definePosicao(int definicao){
		this.definicao = definicao;		
	}
	
	//Define a posicao do inimigo em frente as portas
	public void posicao(){
		switch(definicao){
		//north
		case 1: inimigoX = Resolution.MSX.width/5;
				inimigoY = Resolution.MSX.height-189;
		break;
		//south
		case 2: inimigoX = Resolution.MSX.width/5;
				inimigoY = Resolution.MSX.height-128;
		break;
		//east
		case 3: inimigoX = Resolution.MSX.width/65;
				inimigoY = Resolution.MSX.height-157;
		break;
		//west
		case 4: inimigoX = Resolution.MSX.width/5+14;
				inimigoY = Resolution.MSX.height-157;
		break;
		//up
		case 5: inimigoX = Resolution.MSX.width/15;
				inimigoY = Resolution.MSX.height-189;
		break;
		//down
		case 6: inimigoX = Resolution.MSX.width/15;
				inimigoY = Resolution.MSX.height-128;
		break;
		}
	}
}
