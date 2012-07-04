package com.luoandshi.dojo.roman;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class RulebasedExpectedException {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    protected void expectedExceptionDetails(Class<? extends Throwable> exceptionType, String message) {
        expectedException.expect(exceptionType);
        expectedException.expectMessage(message);
    }
}
