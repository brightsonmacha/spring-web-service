package com.brightsonmacha.soapwsdlwebservice.dto;

public class Student2 {
    private String name;
    private int standard;
    private String address;

    public Student2() {
        super();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}