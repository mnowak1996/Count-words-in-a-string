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

    private boolean checkBoxLiczWyrazyBoolean=false;
    private boolean checkBoxLiczZnakiBoolean=false;
    @FXML
    private void checkBoxLiczWyrazyAction(){
        if(checkBoxLiczWyrazyBoolean==false) {
            checkBoxLiczZnaki.setDisable(true);
            checkBoxLiczWyrazyBoolean=true;
        }
        else {
            checkBoxLiczZnaki.setDisable(false);
            checkBoxLiczWyrazyBoolean=false;
        }
    }
    @FXML
    private void checkBoxLiczZnakiAction(){
        if(checkBoxLiczZnakiBoolean==false) {
            checkBoxLiczWyrazy.setDisable(true);
            checkBoxLiczBezSpacji.setDisable(false);
            checkBoxLiczZnakiBoolean=true;
        }
        else {
            checkBoxLiczWyrazy.setDisable(false);
            checkBoxLiczBezSpacji.setSelected(false);
            checkBoxLiczBezSpacji.setDisable(true);
            checkBoxLiczZnakiBoolean=false;
        }
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
