package com.luoandshi.dojo.roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Copyright:
 */
public class RomanNumberTest {

    private RomanNumber romanNumber;

     @Before
     public void beforeEachTest() throws Exception {
          this.romanNumber=new RomanNumber();
     }

    @Test
    public void one_i() throws Exception {
        Assert.assertThat("",romanNumber.parse(1), is("I"));
    }

    @Test
    public void two_ii() throws Exception {
        Assert.assertThat("", romanNumber.parse(2), is("II"));
    }

    @Test
    public void four_iv() throws Exception {
        Assert.assertThat("", romanNumber.parse(4), is("IV"));
    }

    @Test
    public void five_v() throws Exception {
        Assert.assertThat("", romanNumber.parse(5), is("V"));
    }

    @Test
    public void eight_viii() throws Exception {
        Assert.assertThat("", romanNumber.parse(8), is("VIII"));
    }

    @Test
    public void nine_IX() throws Exception {
        Assert.assertThat("", romanNumber.parse(9), is("IX"));
    }
}