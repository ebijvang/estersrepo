package nl.ordina.todolist.core.usecase;

public interface CreateTaakBoundary {
    void execute(final String omschrijving, final String prioriteit, final String uitersteDatumAfhandelen);
}
