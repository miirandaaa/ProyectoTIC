package um.edu.uy.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import um.edu.uy.Main;
import um.edu.uy.ui.client.ClientController;

import java.util.Objects;

@Component
public class Login {

    @FXML
    private Button botonIniciarSesion;

    @FXML
    private Button botonRegistrarse;

    @FXML
    private Label loginTitle;

    @FXML
    private PasswordField password;

    @FXML
    private Label textoRegistro;

    @FXML
    private TextField user;

    @FXML
    void inicioSesion(ActionEvent event) {

        if (user.getText() == null || Objects.equals(user.getText(), "") || password.getText() == null || Objects.equals(password.getText(), "")){
            //notificacion que avise que ponga algo en los campos
        } else {

            //codigo que chequea que el usuario está en la BD y la contraseña coincide

        }
        // chequear el tipo de usuario que es si es aerolinea que lo lleve a aerolinea si es aeropuerto que lo lleve a aeropuerto
        if (user.getText())
    }

    @FXML
    void toRegistro(ActionEvent event) throws Exception {
        //cierra ventana de login y lleva a ventana de registro
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(Main.getContext()::getBean);

        Parent root = fxmlLoader.load(Registro.class.getResourceAsStream("Registro.fxml"));
        Stage registroStage = new Stage();
        registroStage.setScene(new Scene(root));
        registroStage.show();
    }



}
