module exerciciosfx {
	
	//Requer o uso dos metodos e variaveis do JavaFX
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	/*
	 * Necessita ser aberto para que o JavaFX consiga fazer as reflections
	 * necessarias, como por exemplo o PrimaryStage.show();
	 */
	opens basico;
	opens layout;
	opens fxml;
}