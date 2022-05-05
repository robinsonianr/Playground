package com.playground.paramaters.computerModels;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

public class ComputerModel implements Comparable<ComputerModel>, Serializable {

    protected String brand;
    protected String serial;
    protected BigDecimal price;
    protected Locale datePurchased;

    private static final String DEFAULT_SERIAL = "0000";



    public ComputerModel(){
        brand = "";
        serial = DEFAULT_SERIAL;
        price = BigDecimal.ZERO;
    }


    public ComputerModel(String brand){
        this.brand = brand;
        serial = DEFAULT_SERIAL;
        price = BigDecimal.ZERO;
    }

    public ComputerModel(String brand, String serial){
        this.brand = brand;
        this. serial = serial;
        price = BigDecimal.ZERO;
    }


    public ComputerModel(String brand, String serial, BigDecimal price){
        this.brand = brand;
        this. serial = serial;
        this.price = price;
    }

    @Override
    public int compareTo(ComputerModel o) {
        return brand.compareTo(o.getBrand());
    }

    @Override
    public boolean equals(Object obj) {
        boolean val = obj instanceof ComputerModel;
        if (val && ((ComputerModel) obj).getBrand().compareTo(brand) != 0){
            val = false;
        }
        return val;
    }

    @Override
    public String toString() {
        return "Computer: " + getBrand()+"|| SerialNum: " + getSerial() + "|| price: " + getPrice() + "$" +"|| Purchased: ";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getSerial() {
        return serial;
    }

    public Locale getDatePurchased() {
        return datePurchased;
    }
}
