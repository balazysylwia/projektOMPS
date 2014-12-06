package com.company;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Lista {
    List<Produkt> lista = new ArrayList<Produkt>();
    private String NazwaListy;
    public void setNazwaListy(String NazwaListy){
        this.NazwaListy = NazwaListy;
    }
    public String getNazwaListy(){
        return NazwaListy;
    }
    public Lista (String NazwaListy){
        this.NazwaListy = NazwaListy;
    }
    public Lista (){} // przez te testy trzeba dodać takie coś. o co cho?

    public void StworzListe(String NazwaListy) throws FileNotFoundException, UnsupportedEncodingException {
        // //zapisywanie w konkretnym folderze:
        //PrintWriter ListaTxt = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/Sylwia/IdeaProjects/projektOMPS/src/com/company/Katalog/"+ NazwaListy+".txt"), "UTF-8"));
        PrintWriter ListaTxt = new PrintWriter(NazwaListy+".txt", "UTF-8");
        for(Produkt a: lista) {
            ListaTxt.println(a.getNazwa());
        }
        int rozmiar = lista.size();
        ListaTxt.println("Na Twojej liscie znajduje sie "+ rozmiar + " produktow.");
        ListaTxt.close();
    } //dziala

    public void DodajProdukt(){
        System.out.println("Wpisz nazwe produktu i nacisnij ENTER.");
        String NazwaProduktu;
        Scanner nazwa = new Scanner(System.in);
        NazwaProduktu = nazwa.nextLine();
        lista.add(new Produkt(NazwaProduktu));
    } // dziala

    public void DodajProdukt(String NazwaProduktu){
        lista.add(new Produkt(NazwaProduktu));
    } // dziala

    public void UsunProdukt(String NazwaProduktu){
        lista.remove(new Produkt(NazwaProduktu));
    } // NIE dziala

    public void UsunProdukt(int index){
        lista.remove(index);
    } // dziala

    public int Rozmiar (){
        return lista.size();
    } // dziala

    public void WyswietlListe(){
        System.out.println("Lista produktów: ");
        for(Produkt a: lista) {
            System.out.println(a.getNazwa());
        }
    } // dziala

    public void UsunListe(){
        lista.clear();
    } // dziala

    public void SortujListe(){
        Collections.sort(lista);
    } // dziala

}
