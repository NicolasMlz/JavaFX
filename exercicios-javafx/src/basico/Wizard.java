package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	//Atributos de cena e estadio
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	//Criar cena 1
	private void criarPasso1() {
		
		//Criar botao, e adiciona-lo em uma caixa
		Button proximoPasso = new Button("Ir p/ Passo 2 >>");
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		//Definir a mudanca de cenas
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		
		//Adicionar caixa na cena
		passo1 = new Scene(box, 400, 400);
	}
	
	//Criar cena 2
	private void criarPasso2() {
		
		//Criar botoes, e adiciona-los em uma caixa
		Button proximoPasso = new Button("Ir p/ Passo 3 >>");
		Button passoAnterior = new Button("<< Ir p/ Passo 1");
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		//Definir a mudanca de cenas
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 03");
		});
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
			janela.setTitle("Wizard :: Passo 01");
		});

		//Adicionar caixa na cena
		passo2 = new Scene(box, 400, 400);
	}
	
	//Criar cena 1
	private void criarPasso3() {
		
		//Criar botao, e adiciona-lo em uma caixa
		Button passoAnterior = new Button("<< Ir p/ Passo 2");
		Button finalizar = new Button("Finalizar!");
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(finalizar);
		
		//Definir a mudanca de cenas
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		finalizar.setOnAction(e -> {
			System.exit(0);
		});
		
		//Adicionar caixa na cena
		passo3 = new Scene(box, 400, 400);
	}
	
	
	//Aplicacao
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Criar cenas a partir de metodos
		janela = primaryStage;
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		//Definir as cenas no estadio
		janela.setScene(passo1);
		janela.setTitle("Wizard :: Passo 01");;
		janela.show();
	}
	
	//Main
	public static void main(String[] args) {
		launch(args);
	}
}
