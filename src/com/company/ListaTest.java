package com.company;

import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class ListaTest extends junit.framework.TestCase {
    Lista lista1;
    Lista lista2; //pusta dla testu metody StworzListe żeby sprawdzić, czy tworzy plik txt
    Lista lista3;
    Lista lista4;
    Lista lista5;
    Lista lista6;
    Lista lista7;


    public ListaTest() {}

    protected void setUp(){
        lista1 = new Lista("dodawanie");
        lista2 = new Lista("probna");
        lista3 = new Lista("usuwanie");
        lista4 = new Lista("rozmiar");
        lista5 = new Lista("wyswietlanie");
        lista6 = new Lista("usuwanie_listy");
        lista7 = new Lista("sortowanie");


    }


    protected void tearDown() {

    }

    public void testStworzListe()  throws FileNotFoundException, UnsupportedEncodingException {

        lista2.StworzListe();

    }

    public void testDodajProdukt() throws FileNotFoundException, UnsupportedEncodingException {
        lista1.DodajProdukt("mleko");
        lista1.DodajProdukt("chleb");
        lista1.DodajProdukt("ziemniaki");
        lista1.StworzListe();
    }


    public void testUsunProdukt() throws FileNotFoundException, UnsupportedEncodingException {


        lista3.DodajProdukt("mleko");
        lista3.DodajProdukt("chleb");
        lista3.DodajProdukt("ziemniaki");

        lista3.UsunProdukt(2);
        lista3.StworzListe();
    }




    public void testRozmiar() {


        lista4.DodajProdukt("chleb");
        lista4.DodajProdukt("mleko");
        lista4.DodajProdukt("ziemniaki");
        lista4.DodajProdukt("maslo");
        lista4.DodajProdukt("mineralna");
        assertEquals(5, lista4.Rozmiar());


    }


    public void testWyswietlListe() {
        lista5.DodajProdukt("chleb");
        lista5.DodajProdukt("mleko");
        lista5.DodajProdukt("ziemniaki");
        lista5.DodajProdukt("maslo");
        lista5.DodajProdukt("mineralna");
        lista5.WyswietlListe();
    }


    public void testUsunListe() throws FileNotFoundException, UnsupportedEncodingException {
        lista6.DodajProdukt("chleb");
        lista6.DodajProdukt("mleko");
        lista6.DodajProdukt("ziemniaki");
        lista6.UsunListe();
        assertEquals(0,lista6.Rozmiar());

    }

    public void testSortujListe() throws FileNotFoundException, UnsupportedEncodingException {
        lista7.DodajProdukt("chleb");
        lista7.DodajProdukt("mleko");
        lista7.DodajProdukt("ziemniaki");
        lista7.DodajProdukt("maslo");
        lista7.DodajProdukt("cebula");
        lista7.DodajProdukt("jogurt");
        lista7.DodajProdukt("jajka");
        lista7.DodajProdukt("jablka");
        lista7.SortujListe();
        lista7.WyswietlListe();


    }
}