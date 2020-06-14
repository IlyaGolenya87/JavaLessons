package com.company;


// # 1278AA
public enum Color {

    Black ("#000000"),
    White("#ffffff"),
    Red("#ff0000");

    private String code;



    Color (String code) {
        this.code = code;
    }

    public String getCode () {
        return this.code;

    }

}
