package week4.practicum3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BoekingenApp extends Application {

    @Override
    public void start(Stage stage) {
        Hotel hotel = new Hotel("Don");
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);

        Label text = new Label("Voer uw gegevens in!");
        text.setPrefWidth(330);

        Label naamLabel = new Label("naam:");
        naamLabel.setPrefWidth(100);
        TextField naamInput = new TextField();
        naamInput.setPrefWidth(230);

        Label adresLabel = new Label("adres:");
        adresLabel.setPrefWidth(100);
        TextField adresInput = new TextField();
        adresInput.setPrefWidth(230);

        Label aankomstdatumLabel = new Label("aankomstdatum:");
        aankomstdatumLabel.setPrefWidth(100);
        DatePicker aankomstdatumInput = new DatePicker();
        aankomstdatumInput.setPrefWidth(230);
        aankomstdatumInput.setValue(tomorrow);

        Label vertrekdatumLabel = new Label("Vertrekdatum:");
        vertrekdatumLabel.setPrefWidth(100);
        DatePicker vertrekdatumInput = new DatePicker();
        vertrekdatumInput.setPrefWidth(230);
        vertrekdatumInput.setValue(today);

        Label kamertypeLabel = new Label("Kamertype:");
        kamertypeLabel.setPrefWidth(100);

        ComboBox kamertypeInput = new ComboBox();
        kamertypeInput.getItems().addAll(hotel.getKamerTypen());
        kamertypeInput.setPrefWidth(230);

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPrefWidth(330);
        hbox.setAlignment(Pos.CENTER_RIGHT);

        Button resetButton = new Button("reset");
        Button boekButton = new Button("boek");
        boekButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                hotel.voegBoekingToe(aankomstdatumInput.getValue(), vertrekdatumInput.getValue(), naamInput.getText(), adresInput.getText(), kamertypeInput.getValue());
            }
        });

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(10);

        hbox.getChildren().addAll(resetButton, boekButton);
        root.getChildren().addAll(
                text, naamLabel, naamInput, adresLabel, adresInput,
                aankomstdatumLabel, aankomstdatumInput, vertrekdatumLabel, vertrekdatumInput,
                kamertypeLabel, kamertypeInput, hbox
        );


        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("Tweepersoonsboekingen");
        stage.setScene(scene);
        stage.show();
    }
}
