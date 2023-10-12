package um.edu.uy.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import um.edu.uy.business.UserManager;
import um.edu.uy.business.entities.Client;
import um.edu.uy.business.entities.Usuarios;
import um.edu.uy.business.exceptions.ClientAlreadyExists;
import um.edu.uy.business.exceptions.InvalidClientInformation;
import um.edu.uy.business.exceptions.InvalidUserInformation;
import um.edu.uy.business.exceptions.UserAlreadyExists;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

@Component
public class Registro implements Initializable {

    @Autowired
    private UserManager userMgr;

    @FXML
    private Button botonCrearCuenta;

    @FXML
    private ChoiceBox<String> choiceBoxTipoUsuario;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordVerification;

    @FXML
    private Label textoBienvenida;

    @FXML
    private TextField username;

    //esto es para el choice box
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<String> userTypes = new ArrayList<>();
        userTypes.add("Cliente");userTypes.add("Aeropuerto");userTypes.add("Aerolinea");
        ObservableList<String> list = FXCollections.observableArrayList(userTypes);
        choiceBoxTipoUsuario.setItems(list);
    }

    @FXML
    void crearCuenta(ActionEvent event) {
        if (username.getText() == null || username.getText().equals("") ||
                password.getText() == null || password.getText().equals("")) {

            //showAlert(
            //        "Datos faltantes!",
            //       "No se ingresaron los datos necesarios para completar el ingreso.");

        } else {
            try {

                String nombreUsuario = username.getText();
                String contrasena = password.getText();

                try {

                    Usuarios usuario;
                    usuario = new Usuarios(nombreUsuario, contrasena, choiceBoxTipoUsuario.getValue());

                    userMgr.agregarUsuario(usuario);

                    showAlert("Cliente agregado", "Se agrego con exito el cliente!");

                    //close(event);
                } catch (UserAlreadyExists e) {
                    showAlert(
                            "Informacion invalida !",
                            "Se encontro un error en los datos ingresados.");
                } catch (InvalidUserInformation e) {
                    showAlert(
                            "Usuario ya registrado !",
                            "El usuario indicado ya ha sido registrado en el sistema).");
                }

            } catch (NumberFormatException e) {

                showAlert(
                        "Datos incorrectos !",
                        "El documento no tiene el formato esperado (numerico).");

            }
        }

    }

    @FXML
    void close(ActionEvent actionEvent) {
        Node source = (Node)  actionEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String contextText) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contextText);
        alert.showAndWait();
    }
}
