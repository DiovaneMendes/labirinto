
package applications;

import com.senac.SimpleJava.Console;
import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.GraphicApplication;
import com.senac.SimpleJava.Graphics.Point;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.events.MouseEvent;
import com.senac.SimpleJava.Graphics.events.MouseObserver;

import controller.EventoDoMouse;

public class Principal
	extends GraphicApplication // Para aplicacoes graficas com SimpleJava
	implements MouseObserver // Para responder a eventos de mouse na propria applicacao
{
	private Point point = null;
	private Point center = null;
	
	private boolean red = false;
	
	@Override
	public void notify(MouseEvent event, int button, Point point) {
		// ajusta posicao final da linha.
		if (event == MouseEvent.CLICK) {
			this.point = point;
		}
		if (event == MouseEvent.DOUBLECLICK) {
			red = ! red;
		}
	}

	@Override
	protected void draw(Canvas canvas) {
		if (red) {
			canvas.setForeground(Color.RED);
		} else {
			canvas.setForeground(Color.BLACK);
		}
		
		canvas.clear();
		
		canvas.drawLine(this.center, this.point);
	}

	@Override
	protected void loop() {
		/*
		 * Cria um ponto randomico.
		 * 
		 * int x = (int)(Math.random() * 100):
		 * int y = (int)(Math.random() * 100):
		 * this.point = new Point(x,y);
		 */
		// forca a tela a ser redesenhada.
		redraw();
	}

	@Override
	protected void setup() {
		// ajusta o numero maximo de vezes por segundo que "loop()" sera executado
		setFramesPerSecond(60);
		// ajusta a resolucao
		setResolution(Resolution.LOWRES);
		int x = getResolution().width / 2;
		int y = getResolution().height / 2;
		System.out.println(x*2 + " " + y*2);
		this.center = new Point(x,y);
		this.point = center;
		
		// adiciona o objeto da aplicacao a lista de observadores de eventos de mouse.
		addMouseObserver(MouseEvent.CLICK, this);
		addMouseObserver(MouseEvent.DOUBLECLICK, this);
		
		// adiciona um observador de mouse implementando a interface.
		addMouseObserver(MouseEvent.CLICK, new MouseObserver(){
			@Override
			public void notify(MouseEvent e, int b, Point p) {
				Console.println("Evento de mouse na INTERFACE.");
			}
		});

		// adiciona um observador de mouse com "lambdas" do Java 8.
		addMouseObserver(MouseEvent.DOUBLECLICK,
				(e,b,p)->{
					Console.println("Evento de mouse com LAMBDA");
				});

		// adiciona um observador de mouse utilizando uma classe de objetos.
		addMouseObserver(MouseEvent.CLICK, new EventoDoMouse());
	}

}