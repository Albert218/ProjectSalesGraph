package com.example.sempro;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;

public class HelloController {


    @FXML
    private Button Load;

    @FXML
    private Button btnClear;

    @FXML
    private LineChart<?, ?> monChart;

    @FXML
    private TextField txtAp;

    @FXML
    private TextField txtAug;

    @FXML
    private TextField txtDec;

    @FXML
    private TextField txtFeb;

    @FXML
    private TextField txtJan;

    @FXML
    private TextField txtJuly;

    @FXML
    private TextField txtJune;

    @FXML
    private TextField txtMar;

    @FXML
    private TextField txtMay;

    @FXML
    private TextField txtNov;

    @FXML
    private TextField txtOct;

    @FXML
    private TextField txtSept;

    @FXML
    private CategoryAxis xx;

    @FXML
    private NumberAxis yy;

    @FXML LineChart<?,?> Chart;
    @FXML
    private Button btnBack;


    @FXML
    private CategoryAxis x;

    @FXML
    private Button btnGo;

    @FXML
    private NumberAxis y;


    @FXML
    private Button btnCancel;

    @FXML
    private Button btnGraph;

    @FXML
    private TextField txtFri;

    @FXML
    private TextField txtMon;

    @FXML
    private TextField txtSat;

    @FXML
    private TextField txtSun;

    @FXML
    private TextField txtThurs;

    @FXML
    private TextField txtTue;

    @FXML
    private Label lblError;

    @FXML
    private TextField txtWed;
    @FXML
    private Button btnDailySale;

    @FXML
    private Button btnMonthlySale;

    @FXML
    private Button btnWeeklySale;

    @FXML
    private Button btnlogout;

    @FXML
    private Button btnIdd;


    @FXML
    private Label lblDisplay;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onlblDisplay(MouseEvent event) {

    }

    @FXML
    void onbtnlogin(ActionEvent event) throws IOException {
       String actualname="admin";
       String actualpassword="123";

       String userName=txtUsername.getText();
       String passWord=txtPassword.getText();

       lblDisplay.setText("Login successful");
       lblDisplay.setTextFill(Color.GREEN);


       if (userName.equals(actualname) && passWord.equals(actualpassword)){
           txtUsername.setText("");
           txtPassword.setText("");

           btnLogin.getScene().getWindow().hide();

           FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 400);
           Stage stage=new Stage();
           stage.setTitle("Test 1.0.0");
           stage.setResizable(false);
           stage.setScene(scene);
           stage.show();
       }else
       {
           txtUsername.setText("");
           txtPassword.setText("");

           lblDisplay.setText("Login invalid");
           lblDisplay.setTextFill(Color.RED);
       }


    }

    @FXML
    void onbtnDailySale(ActionEvent event) throws IOException {
        btnDailySale.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DailySale.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 611, 415);
        Stage stage=new Stage();
        stage.setTitle("Daily sale");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onbtnlogout(ActionEvent event) throws IOException {

        btnlogout.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    void onbtnMonthlySale(ActionEvent event) throws IOException {
        btnMonthlySale.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("chart.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=new Stage();
        stage.setTitle("Monthly sale");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void onbtnBack(ActionEvent event) throws IOException {
        btnBack.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=new Stage();
        stage.setTitle("Test 1.0.0");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onbtnCancel(ActionEvent event) {
         txtMon.setText("");
         txtTue.setText("");
         txtWed.setText("");
         txtThurs.setText("");
         txtFri.setText("");
         txtSat.setText("");
         txtSun.setText("");

    }
    @FXML
    public void onbtnGo(ActionEvent event) throws IOException {


        int intMon= 0;
        int intTue= 0;
        int intWed= 0;
        int intThur= 0;
        int intFri= 0;
        int intSat= 0;
        int intSun= 0;
        boolean InputMismatch = true;

            try {
                String Monday=txtMon.getText();
                intMon = Integer.parseInt(Monday);
                String Tuesday=txtTue.getText();
                intTue = Integer.parseInt(Tuesday);
                String Wednesday=txtWed.getText();
                intWed = Integer.parseInt(Wednesday);
                String Thursday=txtThurs.getText() ;
                intThur = Integer.parseInt(Thursday);
                String Friday=txtFri.getText();
                intFri = Integer.parseInt(Friday);
                String Saturday=txtSat.getText();
                intSat = Integer.parseInt(Saturday);
                String Sunday=txtSun.getText();
                intSun = Integer.parseInt(Sunday);

                InputMismatch=false;
            } catch (NumberFormatException e) {

                InputMismatch=true;

            }



        Chart.getData().clear();

        XYChart.Series series=new XYChart.Series<>() ;
        series.setName("Daily Sales");
        series.getData().add(new XYChart.Data<>("Mon",intMon))  ;
        series.getData().add(new XYChart.Data<>("Tue",intTue))  ;
        series.getData().add(new XYChart.Data<>("Wed",intWed))  ;
        series.getData().add(new XYChart.Data<>("Thur",intThur))  ;
        series.getData().add(new XYChart.Data<>("Fri",intFri))  ;
        series.getData().add(new XYChart.Data<>("Sat",intSat))  ;
        series.getData().add(new XYChart.Data<>("Sun",intSun))  ;


        Chart.getData().add(series);



    }
    @FXML
    void onBtnClear(ActionEvent event) {
        txtJan.setText("");
        txtFeb.setText("");
        txtMar.setText("");
        txtAp.setText("");
        txtMay.setText("");
        txtJune.setText("");
        txtJuly.setText("");
        txtAug.setText("");
        txtSept.setText("");
        txtOct.setText("");
        txtNov.setText("");
        txtDec.setText("");

    }

    @FXML
    void onLoad(ActionEvent event) throws IOException{

        int intJan= 0;
        int intFeb= 0;
        int intMar= 0;
        int intAp= 0;
        int intMay= 0;
        int intJun= 0;
        int intJuly= 0;
        int intAug= 0;
        int intSept= 0;
        int intOct= 0;
        int intNov= 0;
        int intDec= 0;
        Boolean empty=true;
        try {
            String Jane=txtJan.getText();
            intJan = Integer.parseInt(Jane);

            String Feb=txtFeb.getText();
            intFeb = Integer.parseInt(Feb);

            String Mar=txtMar.getText();
            intMar = Integer.parseInt(Mar);

            String Apr=txtAp.getText() ;
            intAp = Integer.parseInt(Apr);

            String May=txtMay.getText();
            intMay = Integer.parseInt(May);

            String June=txtJune.getText();
            intJun = Integer.parseInt(June);

            String July=txtJuly.getText();
            intJuly = Integer.parseInt(July);

            String Aug=txtAug.getText();
            intAug = Integer.parseInt(Aug);

            String Sept=txtSept.getText();
            intSept = Integer.parseInt(Sept);

            String Oct=txtOct.getText();
            intOct = Integer.parseInt(Oct);

            String Nov=txtNov.getText();
            intNov = Integer.parseInt(Nov);

            String Dec=txtDec.getText();
            intDec = Integer.parseInt(Dec);

            empty=false;
        } catch (NumberFormatException e) {

            empty=true;
        }


        monChart.getData().clear();

        XYChart.Series series2=new XYChart.Series<>() ;
        series2.getData().add(new XYChart.Data<>("Jan",intJan))  ;
        series2.getData().add(new XYChart.Data<>("Feb",intFeb))  ;
        series2.getData().add(new XYChart.Data<>("Mar",intMar))  ;
        series2.getData().add(new XYChart.Data<>("Apr",intAp))  ;
        series2.getData().add(new XYChart.Data<>("May",intMay))  ;
        series2.getData().add(new XYChart.Data<>("June",intJun))  ;
        series2.getData().add(new XYChart.Data<>("July",intJuly))  ;
        series2.getData().add(new XYChart.Data<>("Aug",intAug))  ;
        series2.getData().add(new XYChart.Data<>("Sept",intSept))  ;
        series2.getData().add(new XYChart.Data<>("Oct",intOct))  ;
        series2.getData().add(new XYChart.Data<>("Nov",intNov))  ;
        series2.getData().add(new XYChart.Data<>("Dec",intDec))  ;


        monChart.getData().addAll(series2);


    }



}