package com.politecnicomalaga.NasdaqOilPrices;

public class Price {

    //Aunque sabemos que precios es un double, lo guardamos en String porque nos llega en String
    //y se muestra como texto, al fin y al cabo

    //POJO CLASS
    private String day;
    private String price;

    //Comportamiento
    //Construtor

    public Price(String day, String price) {
        this.day = day;
        this.price = price;
    }


    //Getters


    public String getDay() {
        return day;
    }

    public String getPrice() {
        return price;
    }
}
