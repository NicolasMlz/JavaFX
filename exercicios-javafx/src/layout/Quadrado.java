package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {
	
	//Atributos
	private static int i=0;
	private String cores[] = {
	    "#c33c5e", "#39aac6", "#28d79a", 
	    "#fb750e", "#6657a8", "#f9060e"		
	};
	
	//Construtores
	public Quadrado() {
		this(100);
	}
	public Quadrado(int tamanho) {
		
		//Definir dimensoes
		this.setHeight(tamanho);
		this.setWidth(tamanho);
		
		//Definir cores
		this.setFill(Color.web(cores[i]));
		
		//Trocar de cor
		i++;
		if(i == 6) i=0;
	}
}
