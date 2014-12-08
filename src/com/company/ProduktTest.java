package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProduktTest  extends junit.framework.TestCase {

    Produkt produkt1;

    public ProduktTest() {}

    protected void setUp(){
        produkt1 = new Produkt("ziemniaki");
    }


    protected void tearDown() {

    }


    public void testSetNazwa() {
        assertEquals("ziemniaki",produkt1.getNazwa());
    }


    public void testGetNazwa() {

    }
}