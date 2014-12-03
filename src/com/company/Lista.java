package com.company;
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

    public void StworzListe(){
        Scanner nazwa = new Scanner(System.in);
        NazwaListy = nazwa.nextLine();
        File ListaTxt = new File(NazwaListy + ".txt");
    }
    public void DodajProdukt(){
        String NazwaProduktu;
        Scanner nazwa = new Scanner(System.in);
        NazwaProduktu = nazwa.nextLine();
        lista.add(new Produkt(NazwaProduktu));
    }
    public void DodajProdukt(String NazwaProduktu){
        lista.add(new Produkt(NazwaProduktu));
    }
    public void UsunProdukt(String NazwaProduktu){
        lista.remove(new Produkt(NazwaProduktu));
    }
    public void ZapiszListe(String NazwaListy){

    }
    public void WyswietlListe(){
        System.out.println("Lista produktów: ");
        for(Produkt a: lista) {
            System.out.println(a.getNazwa());
        }
    }
    public void UsunListe(){
        lista.clear();
    }

    public void SortujListe(){
        Collections.sort(lista);
    }

}
