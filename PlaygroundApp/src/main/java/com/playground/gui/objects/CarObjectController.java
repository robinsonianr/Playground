package com.playground.gui.objects;


import com.playground.util.objSer.ObjSerializer;
import com.playground.util.objects.Car;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


import java.net.URL;
import java.util.ResourceBundle;


public class CarObjectController implements Initializable {

    @FXML
    private Button carDetails;

    @FXML
    private TextArea listOfCarDetails;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }


    public void carDetailsBtn(ActionEvent event){
        try {

            StringBuilder stringBuilder = new StringBuilder();
            Car getCar = (Car) ObjSerializer.getSerializedObjFromFile("carObj.ser");
            stringBuilder.append("Car Brand: ");
            stringBuilder.append(getCar.getBrand()).append(System.lineSeparator());
            stringBuilder.append("Car Price: ");
            stringBuilder.append("$").append(getCar.getPrice());
            listOfCarDetails.setText(stringBuilder.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
