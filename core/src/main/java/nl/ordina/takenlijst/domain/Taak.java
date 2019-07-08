package nl.ordina.takenlijst.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Taak implements Serializable {
    private static final long serialVersionUID = 1L;
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
