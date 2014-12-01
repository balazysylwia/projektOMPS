package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Lista {
    List<Produkt> lista = new ArrayList<Produkt>();
    //Scanner input = new Scanner(System.in);

    /*private String NazwaListy;
    public void setNazwaListy(String NazwaListy){
        this.NazwaListy = NazwaListy;
    }
    public String getNazwaListy(){
        return NazwaListy;
    }*/

    public void StworzListe(){}
    public void DodajProdukt(String NazwaProduktu){
        lista.add(new Produkt(NazwaProduktu));
    }
    public void UsunProdukt(String NazwaProduktu){
        lista.remove(new Produkt(NazwaProduktu));
    }
    public void ZapiszListe(String NazwaListy){

    }
    public void WyswietlListe(){}
    public void UsunListe(){
        lista.clear();
    }

    /*public void SortujListe(){
        Collections.sort(lista);
    }*/

}
