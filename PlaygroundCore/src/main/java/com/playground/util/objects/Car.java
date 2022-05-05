package com.playground.util.objects;

import com.playground.util.constants.CarConstants.CarTypeEnum;

import java.io.*;
import java.math.BigDecimal;

public class Car implements Serializable {
    @Serial
    private final static long serialVersionUID = 2134125212512L;

    private final String brand;
    private final BigDecimal price;


    @Serial
    private void readObject(ObjectInputStream stream) throws IOException,
            ClassNotFoundException {
        stream.defaultReadObject();

        ObjectStreamClass myObject = ObjectStreamClass.lookup(
                Class.forName(Car.class.getCanonicalName()));
        long theSUID = myObject.getSerialVersionUID();

        System.out.println("Customized De-serialization of Car Persistence State: "
                + theSUID);
    }

    public Car(CarTypeEnum cars){
        this.brand = cars.getBrand();
        this.price = cars.getPrice();
    }

    public Car(String brand, BigDecimal price){
        this.brand = brand;
        this.price = price;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
