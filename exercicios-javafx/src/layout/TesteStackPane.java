package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	
	public TesteStackPane() {
		
		//Criar telas
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		//Adicionar no layout
		this.getChildren().addAll(c2, c3, c4, c5, c6, c1);
		
		//Configurar layout
		this.setOnMouseClicked(e -> {
			if(e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});
		
		//Thread para alterar laytout a cada 3 segundos
		Thread t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(1000);
					
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (InterruptedException e1) {
					System.err.println(e1.getMessage());
				}
			}
		});
		t.setDaemon(true);
		t.start();
	}
}
