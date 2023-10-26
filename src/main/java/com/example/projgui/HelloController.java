package com.example.projgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    //mychal
    //dennis

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private TextField amountTwo;

    @FXML
    private TextField balanceField;

    @FXML
    private RadioButton cCheckingTwo;

    @FXML
    private RadioButton camdenOne;

    @FXML
    private RadioButton checkingButtonOne;

    @FXML
    private RadioButton checkingTwo;

    @FXML
    private Button clearButtonOne;

    @FXML
    private Button closeButtonOne;

    @FXML
    private RadioButton collegeCheckingButtonOne;

    @FXML
    private Button depositTwo;

    @FXML
    private TextField fNameFieldOne;

    @FXML
    private TextField fNameTwo;

    @FXML
    private CheckBox isLoyalOne;

    @FXML
    private TextField lNameFieldOne;

    @FXML
    private TextField lNameTwo;

    @FXML
    private Button loadAccountsThree;

    @FXML
    private RadioButton mMarketTwo;

    @FXML
    private RadioButton moneyMarketButtonOne;

    @FXML
    private RadioButton nbOne;

    @FXML
    private RadioButton newarkOne;

    @FXML
    private Button openButtonOne;

    @FXML
    private Button printAccThree;

    @FXML
    private Button printInterestThree;

    @FXML
    private RadioButton savingsButtonOne;

    @FXML
    private RadioButton savingsTwo;

    @FXML
    private TextArea tabOneTextArea;

    @FXML
    private Button updateAccountsThree;

    @FXML
    private Button withdrawlTwo;
}