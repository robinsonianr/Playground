package com.playground.util.constants;

import java.math.BigDecimal;

public final class DeviceConstants {

    public enum DeviceTypeEnum {

        GENERAL("Iphone", "14", new BigDecimal("699.99"));
        private final String deviceType;
        private final String generation;
        private final BigDecimal price;



        private DeviceTypeEnum(String deviceType, String generation, BigDecimal price){
            this.deviceType = deviceType;
            this.generation = generation;
            this.price = price;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public String getGeneration() {
            return generation;
        }
    }

}
