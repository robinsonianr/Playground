package com.playground.util.objects;

import java.io.*;
import java.math.BigDecimal;
import com.playground.util.constants.EmployeeConstant.EmployeeTypeEnum;



public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 21345094893085L;

    private final String name, title;
    private final BigDecimal salary;

    @Serial
    private void readObject(ObjectInputStream stream) throws IOException,
            ClassNotFoundException {
        stream.defaultReadObject();

        ObjectStreamClass myObject = ObjectStreamClass.lookup(
                Class.forName(Employee.class.getCanonicalName()));
        long theSUID = myObject.getSerialVersionUID();

        System.out.println("Customized De-serialization of Employee Persistence State: "
                + theSUID);
    }

    public Employee(EmployeeTypeEnum empType){
        this.name = empType.getName();
        this.title = empType.getTitle();
        this.salary = empType.getSalary();
    }

    public Employee(String name, String title, BigDecimal salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public String getTitle() {
        return title;
    }


    public BigDecimal getSalary() {
        return salary;
    }


}
