package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	//Atributos
	private Integer contador=0;
	
	//Metodos auxiliares
	private void atualizarLabelNumero(Label numero) {
		numero.setText(contador.toString());
		
		//Precisa remover as classes antes de mudar o estilo
		numero.getStyleClass().remove("vermelho");
		numero.getStyleClass().remove("verde");
		
		//Criterio de cores baseado no contador
		if(contador > 0) {
			numero.getStyleClass().add("verde");
		} else if (contador < 0) {
			numero.getStyleClass().add("vermelho");
		}
	}
	
	//Interface visual
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Criar textos (titulo e contador)
		Label textoTitulo = new Label("Contador");
		//Importar configuracoes do CSS
		textoTitulo.getStyleClass().add("titulo");
		Label textoCont = new Label(contador.toString());
		//Importar configuracoes do CSS
		textoCont.getStyleClass().add("numero");
		
		//Criar botoes que agirao no contador
		Button botaoIncremento = new Button("+");
		//Importar configuracoes do CSS
		botaoIncremento.getStyleClass().add("botao");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(textoCont);
		});
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botao");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(textoCont);
		});
		
		//Adicionar os botoes de forma bonita em uma caixa horizontal
		HBox caixaBotao = new HBox();
		//Definir estilo da caixa
		caixaBotao.setAlignment(Pos.CENTER);
		caixaBotao.setSpacing(10);
		//Adicionar elementos
		caixaBotao.getChildren().add(botaoDecremento);
		caixaBotao.getChildren().add(botaoIncremento);
		
		//Adicionar todos os elementos numa caixa vertical principal
		VBox caixaPrincipal = new VBox();
		//Selecionar a classe especifica do arquivo CSS
		caixaPrincipal.getStyleClass().add("conteudo");
		//Definir estilo da caixa
		caixaPrincipal.setAlignment(Pos.CENTER);
		caixaPrincipal.setSpacing(10);
		//Adicionar elementos
		caixaPrincipal.getChildren().add(textoTitulo);
		caixaPrincipal.getChildren().add(textoCont);
		caixaPrincipal.getChildren().add(caixaBotao);
		
		//Vincular esse arquivo com o CSS
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		//Definir quais caixas participarao da cena
		Scene cenaPrincipal = new Scene(caixaPrincipal, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		//Iniciar a obra de arte
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	//Main
	public static void main(String[] args) {
		launch(args);
	}
}
