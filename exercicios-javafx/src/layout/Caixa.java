package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox{
	
	//Atributos
	private static int i=0;
	private String cores[] = {
	    "#c33c5e", "#39aac6", "#28d79a", 
	    "#fb750e", "#6657a8", "#f9060e"		
	};
	
	//Construtores
	public Caixa() {
		this(100, 100);
	}
	public Caixa(int largura, int altura) {
		
		//Definir dimensoes
		this.setMinHeight(altura);
		this.setMinWidth(largura);
		this.setAlignment(Pos.CENTER);
		
		//Definir cores
		BackgroundFill fill = new BackgroundFill(
				Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		//Trocar de cor
		i++;
		if(i == 6) i=0;
	}
	
	//METODOS
	
	/*Criar a caixa passando um texto e retornando uma caixa*/
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		this.getChildren().add(label);
		return this;
	}
}
