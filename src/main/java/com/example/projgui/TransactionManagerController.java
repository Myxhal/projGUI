package com.example.projgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.Date;

public class TransactionManagerController {
    @FXML
    private Label welcomeText;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    //mychal
    //dennis

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TextField fNameFieldOne, lNameFieldOne, balanceField;

    String fName = fNameFieldOne.getText();



    public void handle(ActionEvent event){
        String fName = fNameFieldOne.getText();
        String lName = lNameFieldOne.getText();
        double intBalance = Integer.parseInt(balanceField.getText());
        LocalDate date = datePicker.getValue();
    }
    public void Profile(String firstname, String lastName, LocalDate dob) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.dob = dob;}




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
