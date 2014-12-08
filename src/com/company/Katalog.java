package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sylwia on 2014-11-23.
 */
public class Katalog {

    private String Directory;
    public Katalog (){
        this.Directory = "Katalog/";
    }

    //UsunListeZDysku usuwa liste zapisana na dysku
    /*public void UsunListeZDysku (String NazwaListy){
        File file = new File("Katalog/"+NazwaListy);
        file.delete();
    } */// dziala

    //CzytajListe otwiera liste zapisana w folderze, w ktorym znajduje sie projekt
    public void CzytajListe(String NazwaListy) throws IOException {
        BufferedReader odczyt = new BufferedReader(new FileReader("Katalog/"+NazwaListy));
        String line;
        while ((line = odczyt.readLine()) != null) {
            System.out.println(line);
        }
        odczyt.close();
    } // dziala

    // WybierzListe wyswietla wszystkie pliki .txt z katalogu i pozwala uzytkownikowi wybrac, ktora liste chce otworzyc
    public String WybierzListe(){
        File folder = new File("Katalog/");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Lista: " + listOfFiles[i].getName());
            }
        }
        System.out.println("Wpisz nazwe listy (razem z .txt) i nacisnij ENTER.");
        String NazwaListy;
        Scanner nazwa = new Scanner(System.in);
        NazwaListy = nazwa.nextLine();
        return NazwaListy;
    } // dziala

}

