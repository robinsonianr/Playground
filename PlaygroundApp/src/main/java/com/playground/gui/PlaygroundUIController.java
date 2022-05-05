package com.playground.gui;


import com.playground.util.constants.CarConstants;
import com.playground.util.constants.DeviceConstants;
import com.playground.util.constants.EmployeeConstant;
import com.playground.util.objSer.ObjSerializer;
import com.playground.util.objects.Car;
import com.playground.util.objects.Device;
import com.playground.util.objects.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;



import java.net.URL;
import java.util.ResourceBundle;

public class PlaygroundUIController implements Initializable {


    public static final String carIcon = "/com.playground.gui/images/car.png";
    public static final String empIcon = "/com.playground.gui/images/employee.png";
    public static final String devIcon = "/com.playground.gui/images/device.png";

    @FXML
    private Button carObject;
    @FXML
    private Button deviceObject;
    @FXML
    private Button employeeObject;


    @FXML
    private void carBtnClk(ActionEvent event){
        try {
            FXMLLoader carLoader = new FXMLLoader(getClass().getResource("/com.playground.gui/objects/CarObjectController.fxml"));
            Parent root1 = carLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Car Object");
            stage.getIcons().add(new Image(carIcon));
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @FXML
    private void empBtnClk(ActionEvent event){
        try {
            FXMLLoader empLoader = new FXMLLoader(getClass().getResource("/com.playground.gui/objects/EmployeeObjectController.fxml"));
            Parent root1 = empLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Employee Object");
            stage.getIcons().add(new Image(empIcon));
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @FXML
    private void devBtnClk(ActionEvent event){
        try {
            FXMLLoader devLoader = new FXMLLoader(getClass().getResource("/com.playground.gui/objects/DeviceObjectController.fxml"));
            Parent root1 = devLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Device Object");
            stage.getIcons().add(new Image(devIcon));
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            Car car = new Car(CarConstants.CarTypeEnum.GENERAL);
            Device dev = new Device(DeviceConstants.DeviceTypeEnum.GENERAL);
            Employee emp = new Employee(EmployeeConstant.EmployeeTypeEnum.GENERAL);

            ObjSerializer.serializeToFile(car, "carObj.ser");
            ObjSerializer.serializeToFile(dev, "devObj.ser");
            ObjSerializer.serializeToFile(emp, "empObj.ser");

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
