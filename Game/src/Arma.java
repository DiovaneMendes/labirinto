
public class Arma {
	private int dano, acerto;
	
	public Arma(){
		
	}
	
	public void normal(){
		dano = 2;
		acerto = 75;
	}
	
	public void adaga(){
		dano = 1;
		acerto = 75;
	}
	
	public void faca(){
		dano = 2;
		acerto = 80;
	}
	
	public void espada(){
		dano = 3;
		acerto = 85;
	}
	
	public void espadaLonga(){
		dano = 5;
		acerto = 65;
	}
}
