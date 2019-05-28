package nl.ordina.takenlijst.core.domain;

import java.text.SimpleDateFormat;
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

    @Override
    public String toString() {

        String datum = new SimpleDateFormat("dd-MM-yyyy").format(uitersteDatumAfhandelen);
        return "Taak{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prioriteit='" + prioriteit + '\'' +
                ", uitersteDatumAfhandelen=" + datum +
                '}';
    }
}
