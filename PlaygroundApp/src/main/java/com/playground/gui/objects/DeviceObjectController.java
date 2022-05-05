package com.playground.gui.objects;

import com.playground.util.objSer.ObjSerializer;
import com.playground.util.objects.Device;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class DeviceObjectController implements Initializable {

    @FXML
    private Button devDetails;

    @FXML
    private TextArea listOfDeviceDetails;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void devDetailsBtn(ActionEvent event){
        try {

            StringBuilder stringBuilder = new StringBuilder();
            Device getDev = (Device) ObjSerializer.getSerializedObjFromFile("devObj.ser");
            int generationLen = getDev.getGeneration().length()-1;

            stringBuilder.append("Device Brand: ").append(getDev.getDeviceType()).append(System.lineSeparator());
            if(getDev.getGeneration().charAt(generationLen) == '3' && getDev.getGeneration().equals("13")){
                stringBuilder.append("Generation: ").append(getDev.getGeneration()).append("rd").append(System.lineSeparator());
            } else if (getDev.getGeneration().charAt(generationLen) == '2' && getDev.getGeneration().equals("12")) {
                stringBuilder.append("Generation: ").append(getDev.getGeneration()).append("nd").append(System.lineSeparator());
            } else if (getDev.getGeneration().charAt(generationLen) == '1' && getDev.getGeneration().equals("11")) {
                stringBuilder.append("Generation: ").append(getDev.getGeneration()).append("st").append(System.lineSeparator());
            }else {
                stringBuilder.append("Generation: ").append(getDev.getGeneration()).append("th").append(System.lineSeparator());
            }
            stringBuilder.append("Device Price: ").append("$").append(getDev.getPrice());
            listOfDeviceDetails.setText(stringBuilder.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
