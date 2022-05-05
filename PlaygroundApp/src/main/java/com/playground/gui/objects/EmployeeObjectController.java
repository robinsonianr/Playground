package com.playground.gui.objects;

import com.playground.util.objSer.ObjSerializer;
import com.playground.util.objects.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeObjectController implements Initializable {


    @FXML
    private Button empDetails;

    @FXML
    private TextArea listOfEmployeeDetails;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }




    public void empDetailsBtn(ActionEvent event){
        try {

            StringBuilder stringBuilder = new StringBuilder();
            Employee getEmp = (Employee) ObjSerializer.getSerializedObjFromFile("empObj.ser");
            stringBuilder.append("Employee Name: ").append(getEmp.getName()).append(System.lineSeparator());
            stringBuilder.append("Job Title: ").append(getEmp.getTitle()).append(System.lineSeparator());
            stringBuilder.append("Employee Salary: ").append("$").append(getEmp.getSalary());
            listOfEmployeeDetails.setText(stringBuilder.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
