package com.playground.util.constants;

import java.math.BigDecimal;

public final class EmployeeConstant {

    public enum EmployeeTypeEnum {
        GENERAL("Ian Robinson","Software Engineer", new BigDecimal("125000"));

        private final String name;
        private final String title;
        private  final BigDecimal salary;

        private EmployeeTypeEnum(String name, String title, BigDecimal salary){
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
}
