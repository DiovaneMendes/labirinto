
public class Inimigo {
	private int danoI, acertoI;
	private int lifeInimigo = 20;
	private boolean armado = false;
	
	Personagem personagem = new Personagem();
	
	public Inimigo(){
		
	}
	
	public void goblin(){
		danoI = 2;
		//Se o personagem tem escudo
		if(personagem.defesa()){
			acertoI = 55;
		}
		else{
			acertoI = 80;
		}
		//Se o inimigo estiver armado
		if(armado == true){
			acertoI =+ acertoI;
		}
	}
	
	public void orc(){
		danoI = 4;
		//Se o personagem tem escudo
		if(personagem.defesa()){
			acertoI = 50;
		}
		else{
			acertoI = 75;
		}
		//Se o inimigo estiver armado
		if(armado == true){
			acertoI =+ acertoI;
		}
	}
	
	public void troll(){
		danoI = 6;
		//Se o personagem tem escudo
		if(personagem.defesa()){
			acertoI = 25;
		}
		else{
			acertoI = 50;
		}
		//Se o inimigo estiver armado
		if(armado == true){
			acertoI =+ acertoI;
		}
	}
}