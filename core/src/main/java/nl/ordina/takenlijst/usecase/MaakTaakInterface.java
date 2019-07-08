package nl.ordina.takenlijst.usecase;


public interface MaakTaakInterface {
    Integer voerUit(final String omschrijving, final String prioriteit, final String uitersteDatumAfhandelen);

    void toonAlles();
}
