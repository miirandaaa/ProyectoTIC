package um.edu.uy.ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import um.edu.uy.persistence.AeropuertoRepository;

import java.net.URL;
import java.util.ResourceBundle;


@Component
public class RegistrarAeropuerto {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    @FXML
    private Button botonRegistrarAeropuerto;

    @FXML
    private TextField ciudadAeropuerto;

    @FXML
    private TextField codigoIATA;

    @FXML
    private TextField nombreAeropuerto;

    @FXML
    private TextField numeroCheckIn;

    @FXML
    private TextField numeroGates;

    @FXML
    private AnchorPane paginaAeropuerto;

    @FXML
    private TextField paisAeropuerto;

    @FXML
    void registrarAeropuerto(ActionEvent event) {
        if (nombreAeropuerto.getText() == null || nombreAeropuerto.getText().isEmpty() ||
                ciudadAeropuerto.getText() == null || ciudadAeropuerto.getText().isEmpty() ||
                paisAeropuerto.getText() == null || paisAeropuerto.getText().isEmpty() ||
                numeroGates.getText() == null || numeroGates.getText().isEmpty() ||
                numeroCheckIn.getText() == null || numeroCheckIn.getText().isEmpty() ||
                codigoIATA.getText() == null || codigoIATA.getText().isEmpty()) {

            //showAlert(
            //        "Datos faltantes!",
            //       "No se ingresaron los datos necesarios para completar el ingreso.");

        } else {
            try {

                String nombreAeropuerto = nombreAeropuerto.getText();
                String contrasena = password.getText();


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
