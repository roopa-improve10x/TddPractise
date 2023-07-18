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
        assertEquals("", empty);
    }
}
