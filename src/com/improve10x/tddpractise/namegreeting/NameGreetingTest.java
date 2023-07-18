package com.improve10x.tddpractise.namegreeting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameGreetingTest {
    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnEmpty() {
        Greeting greeting = new Greeting();
        String empty = greeting.greetingName("");
        assertEquals("Hello !", empty);
    }

    @Test
    public void givenGerald_returnHelloGeraldSymbol() {
        Greeting greeting = new Greeting();
        String name = greeting.greetingName("Gerald");
        assertEquals("Hello Gerald!", name);
    }

    @Test
    public void givenEd_returnHelloEdSymbol() {
        Greeting greeting = new Greeting();
        String name = greeting.greetingName("Ed");
        assertEquals("Hello Ed!", name);
    }
    @Test
    public void givenRoopa_returnHelloRoopaSymbol() {
        Greeting greeting = new Greeting();
        String name = greeting.greetingName("Roopa");
        assertEquals("Hello Roopa!", name);
    }

    @Test
    public void givenTiffany_returnHelloTiffanySymbol() {
        Greeting greeting = new Greeting();
        String name = greeting.greetingName("Tiffany");
        assertEquals("Hello Tiffany!", name);
    }



}
