package com.luoandshi.dojo.roman;

import org.apache.log4j.Logger;

/**
 * The parser parses the number ranging from 1 (I) to 99 (IC)
 */
public class TensParser extends AbstractRomanNumericalParser {
    private transient static final Logger LOG = Logger.getLogger(TensParser.class);

    @Override
    public String parse(int number) {
        String roman = "";

        if (getDefaultValue(number) != null) {
            return getDefaultValue(number);
        }

        if (getDefaultValue(number + 1) != null) {
            return "I" + getDefaultValue(number + 1);
        }

        while (number > 0) {
            roman += "I";
            number--;
        }
        return roman;
    }


}
