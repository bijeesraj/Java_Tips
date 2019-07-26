package com.braj.examples.ruleengine;

public interface Rule <I,O> {

    boolean matches(I input); // Added to avoid "if check of phone type" so that it can be used in functional way.
    O applyRule(I input);
}
