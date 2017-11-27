/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import acquaintance.IBusiness;
import acquaintance.IGUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ander
 */
public class GUI extends Application {
//    private static GUI ui;
//    
//    private IBusiness business;
//    
//    public static GUI getInstance(){
//        return ui;
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("BuildingSystem");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
     
    public static void main(String[] args) {
        launch(args);
    }
    
//    @Override
//    public void injectBusiness(IBusiness businessLayer) {
//        business = businessLayer;
//    }
//
//    @Override
//    public void startApplication(String[] args) {
//        ui = this;
//        launch(args);
//    }
   
}

