package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{
	
	/*
	 * Utiliza o conceito de estadio... O estadio será o ambiente
	 * para que diversas cenas sejam mostradas para o usuário 
	 * (as cenas são as telas programadas)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Definir componentes menores (exemplo botao)
		Button botao1 = new Button("A");
		Button botao2 = new Button("B");
		Button botao3 = new Button("C");
		//Definir comportamentos dos botoes
		botao1.setOnAction(e -> System.out.println("A"));
		botao2.setOnAction(e -> System.out.println("B"));
		botao3.setOnAction(e -> System.exit(0));
		
		//Definir os botoes em uma BOX e suas configuracoes
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botao1);
		box.getChildren().add(botao2);
		box.getChildren().add(botao3);
		
		//Adicionar a box em uma cena
		Scene primeiraCena = new Scene(box, 100, 150);
		
		//Adicionar a cena no estadio
		primaryStage.setScene(primeiraCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		//Chama o metodo start
		launch(args);
	}
}
