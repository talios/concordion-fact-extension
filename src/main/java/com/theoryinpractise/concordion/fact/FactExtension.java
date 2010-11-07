package com.theoryinpractise.concordion.fact;

import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class FactExtension implements ConcordionExtension {

    public static final java.lang.String NAMESPACE_FACT = "http://www.theoryinpractise.com/2011/concordion/fact";

    public void addTo(ConcordionExtender concordionExtender) {
        concordionExtender
                .withCommand(NAMESPACE_FACT, "fact", new FactCommand());

    }
}
