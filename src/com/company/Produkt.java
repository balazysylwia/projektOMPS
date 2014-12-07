package com.company;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Produkt implements Comparable <Produkt>{
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

    @Override
    public int compareTo(Produkt o) {
        return this.Nazwa.compareTo (o.Nazwa);
    }
}
