
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraDeArquivo{
	
	public LeituraDeArquivo(){
		
	}
	
	//"throws FileNotFoundException" trata da excess�o de um 
	//erro que pode ocorrer se o arquivo txt n�o estiver ali
	public void lendo() throws FileNotFoundException{
	
		//Chama o arquivo txt
		FileReader texto = new FileReader("coordenadas.txt");
		
		//Scanner para ler o arquivo acima e "useDelimiter" 
		//para saber onde o texto deve ter quebra de linha
		Scanner ler = new Scanner(texto).useDelimiter("\n");
		
		//"hasNext" para ler linha por linha
		while (ler.hasNext()) {
			String nome = ler.next();
			System.out.println(nome);
		}
	}
}