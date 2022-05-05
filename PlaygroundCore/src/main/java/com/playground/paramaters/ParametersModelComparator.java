package com.playground.paramaters;

import com.playground.paramaters.paramaterModels.ParametersModel;

import java.util.Comparator;

public class ParametersModelComparator implements Comparator<ParametersModel> {

    @Override
    public int compare(ParametersModel o, ParametersModel p) {
        return o.compareTo(p);
    }
}
