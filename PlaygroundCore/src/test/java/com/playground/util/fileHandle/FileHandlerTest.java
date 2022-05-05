package com.playground.util.fileHandle;

import com.playground.util.constants.EmployeeConstant;
import com.playground.util.csvSer.SerializerToCSV;
import com.playground.util.objSer.ObjSerializer;
import com.playground.util.objects.Device;
import com.playground.util.constants.DeviceConstants;
import com.playground.util.objects.Employee;
import com.playground.util.xmlSer.XMLSerializer;
import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class FileHandlerTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testHandleFile() throws IOException {
        Device dev1 = new Device(DeviceConstants.DeviceTypeEnum.GENERAL);
        Employee emp1 = new Employee(EmployeeConstant.EmployeeTypeEnum.GENERAL);
        Employee emp2 = new Employee(EmployeeConstant.EmployeeTypeEnum.GENERAL);
        File csv = new File("test4.csv");

        XMLSerializer.xmlSerializeToFile(dev1, "test3.xml");
        ObjSerializer.serializeToFile(emp1, "test.ser");
        SerializerToCSV.ObjToCSVFile(new String[]{emp2.getName(),  emp2.getSalary().toString()}, csv);

        Device otherDev = (Device) XMLSerializer.getXmlObjFromFile("test3.xml");
        Employee otherEmp = (Employee) ObjSerializer.getSerializedObjFromFile("test.ser");

        assertEquals(otherDev.getGeneration(), dev1.getGeneration());
        assertEquals(emp1.getSalary(), otherEmp.getSalary());
    }
}