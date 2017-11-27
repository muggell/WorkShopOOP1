/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.Building;
import business.Reading;
import business.Sensor;
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
    private TextField idField;
    
    @FXML
    private ChoiceBox<String> bReadinChoice;
    @FXML
    private ChoiceBox<String> bSensorChoice;
    @FXML
    private Button addReadingButton;
    @FXML
    private ListView<Reading> readingsList;
    @FXML
    private ListView<Sensor> sensorList;
    @FXML
    private Button removeSensorButton;
    
    private TextField sensorReadingField;
    @FXML
    private Button addSensorButton;
    @FXML
    private TextField sensorIDField;
    @FXML
    private ListView<Building> buildingList;
    @FXML
    private Button removeBuildingButton;
    @FXML
    private Button addBuildingButton;
    @FXML
    private TextField buildingNameField;
    @FXML
    private TextField buildingAddresField;
    @FXML
    private TreeView<String> sensorTreeView;
    
    private ObservableList<Reading> readings; 
    
    private ObservableList<Sensor> sensors;
    
    private ObservableList<Building> buildings;
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.readings = FXCollections.observableArrayList();
       readingsList.setItems(readings); 
       
       this.sensors = FXCollections.observableArrayList();
       sensorList.setItems(sensors);
       
       this.buildings = FXCollections.observableArrayList();
       buildingList.setItems(buildings);
    }    

    @FXML
    private void addReadingsButtonAction(ActionEvent event) {
        Reading newReading = new Reading(Integer.parseInt(timeField.getText()), Double.parseDouble(valueField.getText()),
            typeField.getText(), Integer.parseInt(idField.getText()));
        readings.add(newReading);
        timeField.clear();
        valueField.clear();
        typeField.clear();
        idField.clear();
       
    }

    @FXML
    private void removeSensorButtonAction(ActionEvent event) {
       sensorList.getItems().remove(sensorList.getSelectionModel().getSelectedItem());
       
    }

    @FXML
    private void addSensorButtonAction(ActionEvent event) {
        Sensor newSensor = new Sensor(readings, (bSensorChoice.selectionModelProperty().get().getSelectedItem() + " :  " + sensorIDField.getText()));
        sensors.add(newSensor);
        bReadinChoice.getItems().add(sensors.size()-1, newSensor.getId());
        sensorIDField.clear();
    }

    @FXML
    private void removeBuildingButtonAction(ActionEvent event) {
        buildingList.getItems().remove(buildingList.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void addBuildingButtonAction(ActionEvent event) {
        Building newBuilding = new Building(buildingNameField.getText(), buildingAddresField.getText(), sensors);
        buildings.add(newBuilding);
        bSensorChoice.getItems().add(buildings.size()-1, newBuilding.getName());
        buildingNameField.clear();
        buildingAddresField.clear();
    }
}