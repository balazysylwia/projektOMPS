package com.company;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class KatalogTest extends junit.framework.TestCase {
    Katalog katalog1;

    public KatalogTest() {}

    protected void setUp(){
        katalog1 = new Katalog();

    }

    protected void tearDown() {

    }



    public void testCzytajListe() throws IOException {
        katalog1.CzytajListe("dodawanie.txt");

    }
    

    public void testUsunListeZDysku(){
        katalog1.UsunListeZDysku("probna.txt");
    }
}