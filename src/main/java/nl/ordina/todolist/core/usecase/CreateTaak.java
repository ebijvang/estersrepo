package nl.ordina.todolist.core.usecase;

public class CreateTaak implements CreateTaakBoundary{
    @Override
    public void execute(String omschrijving, String prioriteit, String uitersteDatumAfhandelen) {
        System.out.println("We gaan een taak maken");
    }
}
