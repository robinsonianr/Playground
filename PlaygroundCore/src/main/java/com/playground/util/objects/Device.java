package com.playground.util.objects;

import java.io.*;
import java.math.BigDecimal;
import com.playground.util.constants.DeviceConstants.DeviceTypeEnum;

public class Device implements Serializable {

    @Serial
    private static final long serialVersionUID = 21345094893086L;

    private final String deviceType, generation;
    private final BigDecimal price;

    @Serial
    private void readObject(ObjectInputStream stream) throws IOException,
            ClassNotFoundException {
        stream.defaultReadObject();

        ObjectStreamClass myObject = ObjectStreamClass.lookup(
                Class.forName(Device.class.getCanonicalName()));
        long theSUID = myObject.getSerialVersionUID();

        System.out.println("Customized De-serialization of Device Persistence State: "
                + theSUID);
    }

    public Device(DeviceTypeEnum devices){
        this.deviceType = devices.getDeviceType();
        this.generation = devices.getGeneration();
        this.price = devices.getPrice();
    }

    public Device(String deviceType, String generation, BigDecimal price){
        this.deviceType = deviceType;
        this.generation = generation;
        this.price = price;

    }

    public String getGeneration() {
        return generation;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
