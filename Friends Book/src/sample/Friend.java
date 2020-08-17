package sample;

import javafx.scene.paint.Color;

public class Friend {
    private String name;
    private String pronoun;
    private String phoneNum;
    private String email;
    private String hairLen;
    private javafx.scene.paint.Color hairCol;
    private javafx.scene.paint.Color eyeCol;

    Friend(String name, String pronoun, String phoneNumber, String emailAddress, javafx.scene.paint.Color hairColor,String hairLength, javafx.scene.paint.Color eyeColor){
    this.name = name;
    this.pronoun = pronoun;
    phoneNum = phoneNumber;
    email = emailAddress;
    hairCol= hairColor;
    hairLen = hairLength;
    eyeCol = eyeColor;
    }

    public String toString(){ return name; }

    //Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPronoun() { return pronoun; }
    public void setPronoun(String pronoun) { this.pronoun = pronoun; }
    public String getPhoneNum() { return phoneNum; }
    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Color getHairCol() { return hairCol; }
    public void setHairCol(Color hairCol) { this.hairCol = hairCol; }
    public String getHairLen() { return hairLen; }
    public void setHairLen(String hairLen) { this.hairLen = hairLen; }
    public Color getEyeCol() { return eyeCol; }
    public void setEyeCol(Color eyeCol) { this.eyeCol = eyeCol; }

}
