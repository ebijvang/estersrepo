package nl.ordina.takenlijst;

import nl.ordina.takenlijst.core.domain.Taak;
import nl.ordina.takenlijst.core.usecase.MaakTaak;
import nl.ordina.takenlijst.core.usecase.MaakTaakInterface;

import java.io.Console;

public class App {
    public static void main (String[] args){
        MaakTaakInterface maakTaak = new MaakTaak();
        Console console = System.console();
        while (true){
            String command = console.readLine("tkn>:");
            switch (command){
                case "exit":
                    System.exit(0);
                case "maak":
                    System.out.println("******Nieuwe taak******");
                    String omschrijving =  console.readLine("Omschrijving              : ");
                    String prioriteit =    console.readLine("Prioriteit                : ");
                    String uitersteDatum = console.readLine("Uiterste datum(DD-MM-YYYY): ");
                    Taak taak = maakTaak.voerUit(omschrijving,prioriteit,uitersteDatum);
                    if (taak != null)
                        maakTaak.toon(taak);
                    break;
                case "tonen":
                    System.out.println(command);
                    break;
                default:
                    System.out.println("Onbekende opdracht");
                    break;
            }
        }
    }
}
