import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class CountWords {

    /**
     * Created by Michał nowak
     */

    @FXML
    private TextArea textArea;
    @FXML
    private CheckBox checkBoxLiczWyrazy;
    @FXML
    private CheckBox checkBoxLiczZnaki;
    @FXML
    private CheckBox checkBoxLiczBezSpacji;
    @FXML
    private void initialize() {
        checkBoxLiczBezSpacji.setDisable(true);
    }

    private boolean l1=false;
    @FXML
    private void checkBoxLiczWyrazyAction(){
        if(l1==false) {
            checkBoxLiczZnaki.setDisable(true);
            l1=true;
        }
        else {
            checkBoxLiczZnaki.setDisable(false);
            l1=false;
        }
    }
    @FXML
    private void checkBoxLiczZnakiAction(){
        checkBoxLiczWyrazy.setDisable(true);
        checkBoxLiczBezSpacji.setDisable(false);
    }






    @FXML
    private void Oblicz(){
        if(checkBoxLiczWyrazy.isSelected()){
            checkBoxLiczZnaki.setDisable(true);
//            LiczWyrazy();
        }
        else {
            checkBoxLiczZnaki.setDisable(false);
        }


    }

    private int LiczWyrazy(){

        String wyrazy = textArea.getText();
        String[] tablicaZdan =wyrazy.split(".");
        return 5;
    }
}
