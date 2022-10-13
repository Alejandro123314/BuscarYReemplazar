package dad;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

	TextField buscar, remplazar;
	Label labelBuscar, labelRemplazar;
	Button[] botones = new Button[5];
	CheckBox[] cheks = new CheckBox[4];

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscar = new TextField();
		remplazar = new TextField();

		labelBuscar = new Label("Buscar:");
		labelRemplazar = new Label("Remplazar con:");
		labelBuscar.setPadding(new Insets(0, 5, 0, 10));
		labelRemplazar.setPadding(new Insets(0, 5, 0, 10));

		VBox cajaBoton = new VBox();

		cajaBoton.setSpacing(5);
		cajaBoton.setPrefWidth(150);

		botones[0] = new Button("Buscar");
		botones[1] = new Button("Remplazar");
		botones[2] = new Button("Remplazar todo");
		botones[3] = new Button("Cerrar");
		botones[4] = new Button("Ayuda");

		for (int i = 0; i < botones.length; i++) {
			botones[i].setMinWidth(cajaBoton.getPrefWidth());
		}

		cajaBoton.getChildren().addAll(botones);

		GridPane gPane = new GridPane();
		gPane.setVgap(5);
		gPane.setHgap(5);

		gPane.add(labelBuscar, 0, 0);
		gPane.add(buscar, 1, 0);
		gPane.add(labelRemplazar, 0, 1);
		gPane.add(remplazar, 1, 1);

		cheks[0] = new CheckBox("Mayuscula y minuscula");
		cheks[1] = new CheckBox("Buscar hacia atras");
		cheks[2] = new CheckBox("Expresion regular");
		cheks[3] = new CheckBox("Resaltar resultados");

		GridPane gPaneCheck = new GridPane();
		gPaneCheck.setVgap(5);
		gPaneCheck.setHgap(5);

		gPaneCheck.add(cheks[0], 0, 0);
		gPaneCheck.add(cheks[1], 1, 0);
		gPaneCheck.add(cheks[2], 0, 1);
		gPaneCheck.add(cheks[3], 1, 1);

		gPane.add(gPaneCheck, 1, 2);

		HBox root = new HBox(gPane, cajaBoton);

		root.setSpacing(5);

		Scene scene = new Scene(root, 550, 250);
		primaryStage.setTitle("Buscar y Remplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
