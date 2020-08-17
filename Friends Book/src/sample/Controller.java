package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Controller {
    public ListView friendList = new ListView<>();
    public Label lblName;
    public Label lblPronoun;
    public Label lblPhone;
    public Label lblEmail;
    public Rectangle hair;
    public Arc bangs;
    public Ellipse eyeLeft;
    public Ellipse eyeRight;
    public Button btnDelete;
    ObservableList<String> pronounList = FXCollections.observableArrayList( "she/her", "he/him", "they/them");
    ObservableList<String> hairLenList = FXCollections.observableArrayList( "bald", "short", "long");
    public TextField textPhoneNum;
    public TextField textEmail;
    public TextField textName;
    public ChoiceBox choicePron;
    public ChoiceBox choiceHairLen;
    public ColorPicker pickHairColor;
    public ColorPicker pickEyeColor;

   public void initialize(){
       choicePron.setItems(pronounList);
       choiceHairLen.setItems(hairLenList);
       choicePron.getSelectionModel().select(2);
       choiceHairLen.getSelectionModel().select(1);
   }

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textName.getText(), choicePron.getValue().toString(), textPhoneNum.getText(), textEmail.getText(), pickHairColor.getValue(), choiceHairLen.getValue().toString(), pickEyeColor.getValue());
        friendList.getItems().add(temp);
        textName.clear();
        textEmail.clear();
        textPhoneNum.clear();
        choicePron.getSelectionModel().select(2);
        choiceHairLen.getSelectionModel().select(1);
        pickHairColor.setValue(Color.WHITE);
        pickEyeColor.setValue(Color.WHITE);
    }

    public void displayFriend(MouseEvent mouseEvent) {
       btnDelete.setDisable(false);
       Friend temp;
       temp = (Friend) friendList.getSelectionModel().getSelectedItem();
       lblName.setText(temp.getName());
       lblEmail.setText(temp.getEmail());
       lblPhone.setText(temp.getPhoneNum());
       lblPronoun.setText(temp.getPronoun());
       bangs.setFill(temp.getHairCol());
       hair.setFill(temp.getHairCol());
       eyeLeft.setFill(temp.getEyeCol());
       eyeRight.setFill(temp.getEyeCol());
       if(temp.getHairLen().equals("bald")){
           bangs.setVisible(false);
           hair.setVisible(false);
       }
       else if(temp.getHairLen().equals("short")){
           bangs.setVisible(true);
           hair.setVisible(false);
       }
       else{
           bangs.setVisible(true);
           hair.setVisible(true);
       }
    }

    public void deleteFriend(ActionEvent actionEvent) {
       friendList.getItems().remove((Friend) friendList.getSelectionModel().getSelectedItem());
        lblName.setText("");
        lblEmail.setText("");
        lblPhone.setText("");
        lblPronoun.setText("");
        bangs.setFill(new Color(0,0,0,1));
        hair.setFill(new Color(0,0,0,1));
        eyeLeft.setFill(new Color(0,0,0,1));
        eyeRight.setFill(new Color(0,0,0,1));
        bangs.setVisible(true);
        hair.setVisible(true);
        btnDelete.setDisable(true);
    }
}
