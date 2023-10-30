package com.example.projgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;

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
    private TextField fNameFieldOne, lNameFieldOne, balanceField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private RadioButton checkingButtonOne, collegeCheckingButtonOne, savingsButtonOne, moneyMarketButtonOne;
    @FXML
    private RadioButton camdenOne, newarkOne, nbOne;
    @FXML
    private CheckBox isLoyalOne;
    @FXML
    private Button openButtonOne, closeButtonOne, clearButtonOne;
    @FXML
    private TextArea tabOneTextArea;



    @FXML
    private TextField fNameTwo, lNameTwo, amountTwo;
    @FXML
    private RadioButton mMarketTwo, savingsTwo, checkingTwo, cCheckingTwo;
    @FXML
    private Button depositTwo, withdrawlTwo;



    @FXML
    private Button printAccThree, loadAccountsThree, printInterestThree, updateAccountsThree;
}