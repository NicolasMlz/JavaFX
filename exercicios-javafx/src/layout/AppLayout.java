package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Criar cena
//		Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
//		Scene principal = new Scene(new TesteBorderPane(), 800, 600);
//		Scene principal = new Scene(new TesteFlowPane(), 800, 600);
		Scene principal = new Scene(new TesteGridPane(), 800, 600);
		
		//Adicionar cena no estadio
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciador de layouts");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
