package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produkt nowy = new Produkt("name");
        System.out.println(nowy.getNazwa());

        nowy.setNazwa("new name");
        System.out.println(nowy.getNazwa());

        Lista nowaLista = new Lista("nazwa listy");
        System.out.println(nowaLista.getNazwaListy());


        nowaLista.DodajProdukt("anazwa1");
        nowaLista.DodajProdukt("znazwa2");
        nowaLista.DodajProdukt("banazwa2");
        nowaLista.DodajProdukt("cnazwa2");
        nowaLista.DodajProdukt("aaanazwa2");
        nowaLista.WyswietlListe();
        nowaLista.SortujListe();
        //nowaLista.DodajProdukt();
        nowaLista.WyswietlListe();


    }
}
