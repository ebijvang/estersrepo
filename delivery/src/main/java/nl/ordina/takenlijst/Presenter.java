package nl.ordina.takenlijst;

import nl.ordina.takenlijst.usecase.MaakTaakInterface;

import java.io.Console;

public class Presenter {

    MaakTaakInterface maakTaakInterface;

    public Presenter(final MaakTaakInterface maakTaakInterface) {
        this.maakTaakInterface = maakTaakInterface;
    }

    public void start(){
        Console console = System.console();
        while (true){
            String command = console.readLine("tkn>:");
            switch (command){
                case "exit":
                    System.exit(0);
                case "maak":
                    voerMaakTaakUit(console);
                    break;
                case "toonAlles":
                    maakTaakInterface.toonAlles();
                    break;
                default:
                    System.out.println("Onbekende opdracht");
                    break;
            }
        }
    }

    private void voerMaakTaakUit(final Console console) {
        System.out.println("******Nieuwe taak******");
        String omschrijving =  console.readLine("Omschrijving              : ");
        String prioriteit =    console.readLine("Prioriteit                : ");
        String uitersteDatum = console.readLine("Uiterste datum(DD-MM-YYYY): ");
        Integer result = maakTaakInterface.voerUit(omschrijving,prioriteit,uitersteDatum);
        if (result != 0)  System.out.println("De datum heeft een verkeerd formaat");
        return;
    }
}
