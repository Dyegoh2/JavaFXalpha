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
    private Button BTguardarC;

    @FXML
    private Button BTregistrarP;

    @FXML
    private Button BTactualizarP;

    @FXML
    private Button BTregistarD;

    @FXML
    private Label LBcopiasDisponibles;

    @FXML
    private Label LBcopiasPrestadas;

    @FXML
    private TextField TXTcopiasDisponibles;

    @FXML
    private TextField TXTcopiasPrestadas;

    @FXML
    private Label LBtitulo;

    @FXML
    private Label LBtautores;

    @FXML
    private Label LBnumeroPaginas;

    @FXML
    private Label LBprecio;

    @FXML
    private Label LBannioEdicion;

    @FXML
    private Label LBteditorial;

    @FXML
    private Label LBnumeroCopias;

    @FXML
    private TextField TXTprecios;

    @FXML
    private TextField TXTanioedicion;

    @FXML
    private TextField TXTeditorial;

    @FXML
    private TextField TXTtitulo;

    @FXML
    private TextField TXTautores;

    @FXML
    private TextField TXTnumeroPaginas;

    @FXML
    private TextField TXTnumeroCopias;

    @FXML
    private Label lblTitulo;
    
   private Libro libro = new Libro();//objeto para conectar la clase libro con el control?
   /** public ControllerEjemplo1(Libro libro) {
       //se acostumbra invocar un método privado que inicialice la GUI
       this.libro = libro;
       
    }**/
    
    
    @FXML
    void ActualizarPantalla(ActionEvent event) {
        TXTanioedicion.setText(String.valueOf(this.libro.getAnoEdicion()));
      TXTeditorial.setText(this.libro.getEditorial());
      TXTtitulo.setText(this.libro.getTitulo());
      TXTautores.setText(this.libro.getAutores());
      TXTprecios.setText(String.valueOf(this.libro.getPrecio()));
      TXTnumeroPaginas.setText(String.valueOf(this.libro.getNumeroDePaginas()));
      TXTnumeroCopias.setText(String.valueOf(this.libro.getNumeroDeCopias()));
      TXTcopiasDisponibles.setText(String.valueOf(this.libro.getNumeroDeCopiasDisponibles()));
      TXTcopiasPrestadas.setText(String.valueOf(this.libro.getNumeroDeCopiasPrestadas()));
    }

    @FXML
    void GuardarCambios(ActionEvent event) {
        if(this.libro.cambiarNumeroDeCopias(Integer.parseInt(TXTnumeroCopias.getText()))){
       this.libro.setAnoEdicion(Integer.parseInt(TXTanioedicion.getText()));
       this.libro.setEditorial(TXTeditorial.getText());
       this.libro.setTitulo(TXTtitulo.getText());
       this.libro.setAutores(TXTautores.getText());
       this.libro.setPrecio(Integer.parseInt(TXTprecios.getText()));
       this.libro.setNumeroDePaginas(Integer.parseInt(TXTnumeroPaginas.getText()));
       //JFX.showMessageDialog(this, "Cambios Guardados Correctamente");
     }
    }

    @FXML
    void RegistroDevolucion(ActionEvent event) {
        if(this.libro.devolver())
       this.ActualizarPantalla(event);
    }

    @FXML
    void RegistroPrestamo(ActionEvent event) {
        if(this.libro.prestar())
       this.ActualizarPantalla(event);
    }

    @FXML
    void initialize() {
        assert BTguardarC != null : "fx:id=\"BTguardarC\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTregistrarP != null : "fx:id=\"BTregistrarP\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTactualizarP != null : "fx:id=\"BTactualizarP\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert BTregistarD != null : "fx:id=\"BTregistarD\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBcopiasDisponibles != null : "fx:id=\"LBcopiasDisponibles\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBcopiasPrestadas != null : "fx:id=\"LBcopiasPrestadas\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTcopiasDisponibles != null : "fx:id=\"TXTcopiasDisponibles\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTcopiasPrestadas != null : "fx:id=\"TXTcopiasPrestadas\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBtitulo != null : "fx:id=\"LBtitulo\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBtautores != null : "fx:id=\"LBtautores\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBnumeroPaginas != null : "fx:id=\"LBnumeroPaginas\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBprecio != null : "fx:id=\"LBprecio\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBannioEdicion != null : "fx:id=\"LBannioEdicion\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBteditorial != null : "fx:id=\"LBteditorial\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert LBnumeroCopias != null : "fx:id=\"LBnumeroCopias\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTprecios != null : "fx:id=\"TXTprecios\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTanioedicion != null : "fx:id=\"TXTanioedicion\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTeditorial != null : "fx:id=\"TXTeditorial\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTtitulo != null : "fx:id=\"TXTtitulo\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTautores != null : "fx:id=\"TXTautores\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTnumeroPaginas != null : "fx:id=\"TXTnumeroPaginas\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert TXTnumeroCopias != null : "fx:id=\"TXTnumeroCopias\" was not injected: check your FXML file 'ejemplo.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'ejemplo.fxml'.";

    }
}
