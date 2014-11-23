package com.company;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Produkt {
    private String Nazwa;
    public void setNazwa(String Nazwa){
        this.Nazwa = Nazwa;
    }
    public String getNazwa(){
        return Nazwa;
    }
    public Produkt (){}
    public Produkt (String Nazwa){
        this.Nazwa = Nazwa;
    }
}
