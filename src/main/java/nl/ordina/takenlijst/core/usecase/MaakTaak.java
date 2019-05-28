package nl.ordina.takenlijst.core.usecase;

import nl.ordina.takenlijst.core.domain.Taak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MaakTaak implements MaakTaakInterface {
    @Override
    public Taak voerUit(String omschrijving, String prioriteit, String uitersteDatumAfhandelen) {
        System.out.println(omschrijving);
        System.out.println(prioriteit);
        System.out.println(uitersteDatumAfhandelen);
        Date datum = null;

        try {
            SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
            formatter.setLenient(false);
            datum = formatter.parse(uitersteDatumAfhandelen);
            Taak taak = new Taak(omschrijving,prioriteit,datum);
            return taak;

        } catch(ParseException e){
            System.out.println("De datum heeft een verkeerd formaat");
            return null;
        }
    }

    @Override
    public void toon(Taak taak) {
        System.out.println(taak.toString());
    }
}
