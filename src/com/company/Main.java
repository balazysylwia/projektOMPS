package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Produkt nowy = new Produkt("name");
        System.out.println(nowy.getNazwa());

        nowy.setNazwa("new name");
        System.out.println(nowy.getNazwa());
        */

        Lista nowaLista = new Lista("nazwa listy");
        System.out.println(nowaLista.getNazwaListy());
        nowaLista.setNazwaListy("nowa nazwa listy");
        System.out.println(nowaLista.getNazwaListy());

        nowaLista.DodajProdukt("anazwa1");
        nowaLista.DodajProdukt("znazwa2");
        nowaLista.DodajProdukt("banazwa2");
        nowaLista.DodajProdukt("cnazwa2");
        nowaLista.DodajProdukt("aaanazwa2");
        nowaLista.StworzListe();

        //nowaLista.StworzListe("ompsik");
        //System.out.println(nowaLista.Rozmiar());
        //nowaLista.CzytajListe("ompsik");

        nowaLista.UsunListeZDysku("nowa nazwa listy");










    }
}
