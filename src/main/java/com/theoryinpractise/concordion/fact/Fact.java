package com.theoryinpractise.concordion.fact;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Fact {
    String value();
}
