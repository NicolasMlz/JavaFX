package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{
	
	public TesteGridPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		//Adicionar linhas e colunas
		this.getRowConstraints().addAll(rc(), rc(), frc(), rc(), rc());
		this.getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		
		//Configuracoes
		setGridLinesVisible(false);
		setVgap(10);
		setHgap(10);
		
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);
	}
	

	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(25);
		return cc;
	}
	
	private ColumnConstraints fcc() {
		ColumnConstraints fcc = new ColumnConstraints();
		fcc.setMinWidth(20);
		fcc.setMaxWidth(20);
		return fcc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(25);
		return rc;
	}
	
	private RowConstraints frc() {
		RowConstraints frc = new RowConstraints();
		frc.setMinHeight(20);
		frc.setMaxHeight(20);
		return frc;
	}
}
