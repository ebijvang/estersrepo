package nl.ordina.takenlijst.core.usecase;

import nl.ordina.takenlijst.core.domain.Taak;

public interface MaakTaakInterface {
    Integer voerUit(final String omschrijving, final String prioriteit, final String uitersteDatumAfhandelen);
    void toon(Taak taak);
}
