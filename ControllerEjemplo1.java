import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerEjemplo1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BTsubirV;

    @FXML
    private Button BTretrocederC;

    @FXML
    private Button BTavanzarC;

    @FXML
    private Button BTcambiarE;

    @FXML
    private Button BTbajarV;

    @FXML
    private Label LBcanal;

    @FXML
    private Label LBentrada;

    @FXML
    private TextField TXTcanal;

    @FXML
    private TextField TXTentrada;

    @FXML
    private Label LBvolumen;

    @FXML
    private TextField TXTvolumen;

    @FXML
    private Label lblTitulo;
    
    /////////////////////////
    /**
    private Televisor televisor;
    
    public void GUITelevisor(Televisor tv) {
        this.televisor = tv;
    } **/
    ////////////////////////////////////
    private Televisor televisor = new Televisor();
    
    
    ////////////////
    @FXML
    void AvanzarCanal(ActionEvent event) {
        televisor.avanzarCanal();
        actualizarGUI();
    }

    @FXML
    void BajarVolumen(ActionEvent event) {
        if(!televisor.bajarVolumen())actualizarGUI();
    }

    @FXML
    void CambiarEntrada(ActionEvent event) {

    }

    @FXML
    void RetrocederCanal(ActionEvent event) {
        televisor.retrocederCanal();
        actualizarGUI();
    }

    @FXML
    void SubirVolumen(ActionEvent event) {
        if(!televisor.subirVolumen())actualizarGUI();
    }
    void actualizarGUI()
    {
      TXTvolumen.setText(String.valueOf(televisor.getVolumen()));
      TXTcanal.setText(String.valueOf(televisor.getCanal()));
      TXTentrada.setText(String.valueOf(televisor.getTipoDeEntrada()));      
    }
    
    
    @FXML
    void initialize() {
        assert BTsubirV != null : "fx:id=\"BTsubirV\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTretrocederC != null : "fx:id=\"BTretrocederC\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTavanzarC != null : "fx:id=\"BTavanzarC\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTcambiarE != null : "fx:id=\"BTcambiarE\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTbajarV != null : "fx:id=\"BTbajarV\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBcanal != null : "fx:id=\"LBcanal\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBentrada != null : "fx:id=\"LBentrada\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTcanal != null : "fx:id=\"TXTcanal\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTentrada != null : "fx:id=\"TXTentrada\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBvolumen != null : "fx:id=\"LBvolumen\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTvolumen != null : "fx:id=\"TXTvolumen\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'ejemplo.fxml'.";

    }
}
