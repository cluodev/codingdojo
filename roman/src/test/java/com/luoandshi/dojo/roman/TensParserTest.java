package com.luoandshi.dojo.roman;


import org.junit.Before;
import org.junit.Test;

public class TensParserTest extends RulebasedExpectedException {

    private TensParser parser;


    @Before
    public void beforeEachTest() throws Exception {
       parser = new TensParser();
    }

    @Test
    public void number_not_in_rang() throws Exception {
        expectedExceptionDetails(IllegalArgumentException.class, "Invalid number. Expected range [1,100] inclusive");
        parser.parse(101);
    }

}
