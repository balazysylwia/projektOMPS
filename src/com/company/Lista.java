package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Lista {
    List<Produkt> lista = new ArrayList<Produkt>();
    private String NazwaListy;

    public void setNazwaListy(String NazwaListy) {
        this.NazwaListy = NazwaListy;
    }

    public String getNazwaListy() {
        return NazwaListy;
    }

    public Lista(String NazwaListy) {
        this.NazwaListy = NazwaListy;
    }

    public Lista() {
    }


    // DodajProdukt dodaje do naszej listy wpisany przez nas do konsoli produkt
    public void DodajProdukt() {
        System.out.println("Wpisz nazwe produktu i nacisnij ENTER.");
        String NazwaProduktu;
        Scanner nazwa = new Scanner(System.in);
        NazwaProduktu = nazwa.nextLine();
        lista.add(new Produkt(NazwaProduktu));
    } // dziala

    // DodajProdukt dodaje do naszej listy wpisany przez nas produkt
    public void DodajProdukt(String NazwaProduktu) {
        lista.add(new Produkt(NazwaProduktu));
    } // dziala

    // UsunProdukt usuwa kolejny produkt z listy (1- pierwszy produkt, 2- drugi produkt, itd)
    public void UsunProdukt(int index) {
        lista.remove(index - 1);
    } // dziala

    // Rozmiar zwraca ilosc produktow na liscie
    public int Rozmiar() {
        return lista.size();
    } // dziala

    // WyswietlListe wyswietla w konsoli liste, ktora aktualnie tworzymy
    public void WyswietlListe() {
        System.out.println("Lista produktów: ");
        for (Produkt a : lista) {
            System.out.println(a.getNazwa());
        }
    } // dziala

    // UsunListe usuwa wszystkie produkty z listy, ktora aktualnie tworzymy
    public void UsunListe() {
        lista.clear();
    } // dziala

    // SortujListe sortuje liste, ktora aktualnie tworzymy
    public void SortujListe() {
        Collections.sort(lista);
    } // dziala

    // StworzListe zapisuje wygenerowaną listę do pliku txt
    public void StworzListe() throws FileNotFoundException, UnsupportedEncodingException {
        // //zapisywanie w konkretnym folderze:
        PrintWriter ListaTxt = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Katalog/" + NazwaListy + ".txt"), "UTF-8"));
        //PrintWriter ListaTxt = new PrintWriter(NazwaListy+".txt", "UTF-8");
        for (Produkt a : lista) {
            ListaTxt.println(a.getNazwa());
        }
        int rozmiar = lista.size();
        //ListaTxt.println("Na Twojej liscie znajduje sie "+ rozmiar + " produktow.");
        ListaTxt.close();

    } // dziala
}
