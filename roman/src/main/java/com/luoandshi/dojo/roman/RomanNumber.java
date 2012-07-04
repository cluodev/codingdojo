package com.luoandshi.dojo.roman;

/**
 * Roman numerical parser.
 Symbol	Value
 I	1
 V	5
 X	10
 L	50
 C	100
 D	500
 M	1,000

 Generally, symbols are placed in order of value, starting with the largest values.
 When smaller values precede larger values, the smaller values are subtracted from the larger values,
 and the result is added to the total. For example MCMXLIV = 1000 + (1000 − 100) + (50 − 10) + (5 − 1) = 1944

 2012 - MMXII
 1954 - MCMLIV
 14 - XIV

 An online converter: http://www.onlineconversion.com/roman_numerals_advanced.htm

 */

public class RomanNumber {
    private RomanNumericalParser tensParser;
    private RomanNumericalParser hundrendsParser;
    private RomanNumericalParser thousandssParser;


    public RomanNumber() {
        this.tensParser = new TensParser();
    }

    public String parse(int number) {
        final String parse = tensParser.parse(number);
        return parse != null ? parse : null;
    }
}
