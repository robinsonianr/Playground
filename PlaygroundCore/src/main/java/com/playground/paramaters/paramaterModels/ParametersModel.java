package com.playground.paramaters.paramaterModels;

public class ParametersModel implements Comparable<ParametersModel>{

    protected String name;

    @Override
    public int compareTo(ParametersModel o) {
        return name.compareTo(o.getName());
    }


    public String getName() {
        return name;
    }
}
