import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
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
    private Label Wynik;
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
            Wynik.setText("Wynik to: ");
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
            Wynik.setText("Wynik to: ");
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

            Wynik.setText("Wynik to: "+ String.valueOf(LiczWyrazy()));
        }
        if(checkBoxLiczZnaki.isSelected() && !checkBoxLiczBezSpacji.isSelected()){

            Wynik.setText("Wynik to: "+ String.valueOf(LiczZnaki()));
        }
        if(checkBoxLiczZnaki.isSelected() && checkBoxLiczBezSpacji.isSelected()){

            Wynik.setText("Wynik to: "+ String.valueOf(LiczZnakiBezSpacji()));
        }



    }

    private int LiczWyrazy(){
        int liczbaWyrazow= 0;
        String wyrazy = textArea.getText();
        String[] tablicaZdan =wyrazy.split(" ");
        liczbaWyrazow=tablicaZdan.length;
        return liczbaWyrazow;
    }
    private int LiczZnaki(){
        int liczbaZnaków =0;
        int suma=0;

        String wyrazy = textArea.getText();
        if(wyrazy.length()==0)
        {
            liczbaZnaków=0;
        }
        else{
            suma=wyrazy.length();
            liczbaZnaków=suma;
        }


        return liczbaZnaków;

    }
    private int LiczZnakiBezSpacji(){
        int wynik=0;

        String wyrazy = textArea.getText();
        if(wyrazy.length()==0)
        {
            wynik=0;
        }
        else{
            String[] tablicaZdan =wyrazy.split(" ");
            if(tablicaZdan.length==1){
                wynik=1;
            }
            else {
                wynik=LiczZnaki() -tablicaZdan.length +1;
            }

        }
        return wynik;
    }

}
