package com.luoandshi.dojo.roman;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRomanNumericalParser implements RomanNumericalParser {
    public static Map<Integer, String> DEFAULT_SYMBOLS = new HashMap<Integer, String>();

    static {
        DEFAULT_SYMBOLS.put(1, "I");
        DEFAULT_SYMBOLS.put(5, "V");
        DEFAULT_SYMBOLS.put(10, "X");
        DEFAULT_SYMBOLS.put(50, "L");
        DEFAULT_SYMBOLS.put(100, "C");
        DEFAULT_SYMBOLS.put(500, "D");
        DEFAULT_SYMBOLS.put(1000, "M");
    }

    protected static String getDefaultValue(int number) {
        return DEFAULT_SYMBOLS.get(number);
    }

}
