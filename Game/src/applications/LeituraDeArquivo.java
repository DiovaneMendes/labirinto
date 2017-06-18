package applications;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

import applications.Sala;

public class LeituraDeArquivo {
	
	@SuppressWarnings("resource")
	public void lendoArquivo(){	
		Sala sala[] = new Sala[31];
		String linha[] = new String[31];
		FileReader texto = null;
		Scanner ler = null;
		int i = 0;
		String clickSala;
		
		try{
			texto = new FileReader("coordenadas.txt");
			ler = new Scanner(texto).useDelimiter("\n");
		}catch (FileNotFoundException e){
			Console.print("");
		}
		
		while (ler.hasNext()) {
			String north = null, south = null, east = null, west = null, up = null, down = null ;
			int clickNorth = 0, clickSouth = 0, clickEast = 0, clickWest = 0, clickUp = 0, clickDown = 0;
			linha[i] = ler.next();
			//String index = String.valueOf(i);	
			if(linha[i].contains("north")){
				north = "north";
				//PEGANDO O NUMERO DA QUE DEVE IR QUAND O FOR CLICADO
				clickSala = linha[i].substring(linha[i].indexOf("north")+6, linha[i].indexOf("north")+8);
				clickNorth = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			if(linha[i].contains("south")){
				south = "south";
				clickSala = linha[i].substring(linha[i].indexOf("south")+6, linha[i].indexOf("south")+8);
				clickSouth = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			if(linha[i].contains("east")){
				east = "east";
				clickSala = linha[i].substring(linha[i].indexOf("east")+5, linha[i].indexOf("east")+7);
				clickEast = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			if(linha[i].contains("west")){
				west = "west";
				clickSala = linha[i].substring(linha[i].indexOf("west")+5, linha[i].indexOf("west")+7);
				clickWest = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			if(linha[i].contains("up")){
				up = "up";
				clickSala = linha[i].substring(linha[i].indexOf("up")+3, linha[i].indexOf("up")+6);
				clickUp = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			if(linha[i].contains("down")){
				down = "down";
				clickSala = linha[i].substring(linha[i].indexOf("down")+5, linha[i].indexOf("down")+7);
				clickDown = Integer.parseInt(clickSala.replaceAll("[^0-9]*", ""));
			}
			
		//sala[i] = new Sala (north, clickNorth, south, clickSouth, east, clickEast, west, clickWest, up, clickUp, down, clickDown);
		i++;
		}
	}
}