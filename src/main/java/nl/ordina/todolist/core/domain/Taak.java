package nl.ordina.todolist.core.domain;

import java.util.Date;

public class Taak {
    private final String omschrijving;
    private final String prioriteit;
    private final Date uitersteDatumAfhandelen;

    public Taak(final String omschrijving, final String prioriteit, final Date uitersteDatumAfhandelen) {
        this.omschrijving = omschrijving;
        this.prioriteit = prioriteit;
        this.uitersteDatumAfhandelen = uitersteDatumAfhandelen;
    }
}
