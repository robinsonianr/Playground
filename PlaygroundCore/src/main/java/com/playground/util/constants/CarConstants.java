package com.playground.util.constants;

import java.math.BigDecimal;

public final class CarConstants {

    public enum CarTypeEnum{

        GENERAL("Lamborghini", new BigDecimal(420694));

        private final String brand;
        private final BigDecimal price;

        private CarTypeEnum(String brand, BigDecimal price){
            this.brand = brand;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public BigDecimal getPrice() {
            return price;
        }
    }
}
