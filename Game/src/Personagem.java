
public class Personagem {
	private String nome;
	private int life = 20;
	private int tipoArma = 1;
	private int tipoArmadura;
	private int armorEsc = 0;
	private boolean shield;
	
	Arma arma = new Arma();
	Armadura armadura = new Armadura();
	Inimigo inimigo = new Inimigo();

	public Personagem(){
		
	}
	
	//Escolha de armadura
	public void armor(){
		switch(tipoArmadura){
			case 1: armadura.couro();
					armorEsc = 1;
			break;
			case 2: armadura.metal();
					armorEsc = 2;
			break;
			case 3: armadura.mithril();
					armorEsc = 3;
			break;
		}
	}
	
	//Manda para a classe Inimigo qual arma vai ser usada
	public int armorEscolhida (){
		return armorEsc;
	}
	
	//Se a escudo ou n�o
	public boolean defesa(){
		return shield;
	}
	
	//Escolha de arma
	public void ataque(){
		switch(tipoArma){
			case 1: arma.normal();
			break;
			case 2: arma.adaga();
			break;
			case 3: arma.faca();
			break;
			case 4: arma.espada();
			break;
			case 5: arma.espadaLonga();
			break;
		}
	}
}