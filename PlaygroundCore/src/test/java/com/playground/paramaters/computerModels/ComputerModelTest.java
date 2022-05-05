package com.playground.paramaters.computerModels;

import junit.framework.TestCase;

public class ComputerModelTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetSerial() {

        ComputerModel pc1 = new ComputerModel();
        System.out.println(pc1);
    }
}