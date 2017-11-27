/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.Reading;
import com.sun.scenario.effect.impl.Renderer;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author ander
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField timeField;
    @FXML
    private TextField valueField;
    @FXML
    private TextField typeField;
    @FXML
    private ChoiceBox<?> bReadinChoice;
    @FXML
    private ChoiceBox<String> bSensorChoice;
    @FXML
    private Button addReadingButton;
    @FXML
    private ListView<String> readingsList;
    @FXML
    private ListView<String> sensorList;
    @FXML
    private Button removeSensorButton;
    private TextField sensorReadingField;
    @FXML
    private Button addSensorButton;
    @FXML
    private TextField sensorIDField;
    @FXML
    private ListView<String> buildingList;
    @FXML
    private Button removeBuildingButton;
    @FXML
    private Button addBuildingButton;
    @FXML
    private TextField buildingNameField;
    @FXML
    private TextField buildingAddresField;
    @FXML
    private ChoiceBox<String> sensorChoiceForRead;
    @FXML
    private RadioButton sensorIsCO2;
    @FXML
    private ToggleGroup typeSensorGroup;
    @FXML
    private RadioButton sensorIsTemp;
    @FXML
    private TreeView<String> sensorTreeView;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void addReadingsButtonAction(ActionEvent event) {
        
    }

    @FXML
    private void removeSensorButtonAction(ActionEvent event) {
        sensorList.getItems().remove(sensorList.selectionModelProperty());
    }

    @FXML
    private void addSensorButtonAction(ActionEvent event) {
        TreeItem<String> newItem = new TreeItem<String>(bSensorChoice.itemsProperty().getName());
        if(sensorIsCO2.isArmed()) {
            TreeItem<String> subItem = new TreeItem<String>(sensorIDField.getText() + "Type: CO2");
            newItem.getChildren().add(subItem);
        } else {
            TreeItem<String> subItem = new TreeItem<String>(sensorIDField.getText() + "Type: Temperature");
            newItem.getChildren().add(subItem);
        }
        }

    @FXML
    private void removeBuildingButtonAction(ActionEvent event) {
        
    }

    @FXML
    private void addBuildingButtonAction(ActionEvent event) {
        
        String newBuilding = buildingNameField.getText() +  ",  " + buildingAddresField.getText();
        buildingList.getItems().add(buildingList.getItems().size(), newBuilding);
        buildingList.scrollTo(newBuilding);
        buildingList.edit(buildingList.getItems().size() - 1);
        
        TreeItem<String> buildingTree = new TreeItem<String>(buildingNameField.getText());
        bSensorChoice.getItems().add(buildingTree.getValue());
        
    }
    
}
