package nl.ordina.takenlijst.usecase;

import nl.ordina.takenlijst.domain.Taak;
import nl.ordina.takenlijst.domain.TaakGateway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MaakTaak implements MaakTaakInterface {

    final private TaakGateway taakGateway;

    public MaakTaak(final TaakGateway taakGateway) {
        this.taakGateway = taakGateway;
    }

    @Override
    public Integer voerUit(final String omschrijving, final String prioriteit, final String uitersteDatumAfhandelen) {
        Date datum = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            formatter.setLenient(false);
            datum = formatter.parse(uitersteDatumAfhandelen);
            Taak taak = new Taak(omschrijving, prioriteit, datum);
            taakGateway.slaTaakOp(taak);
            return 0;

        } catch (ParseException e) {
            return 200;
        }
    }

    @Override
    public void toonAlles() {
        List<Taak> alleTaken = taakGateway.toonTaken();
        for (Taak taak : alleTaken){
            System.out.println(taak.toString());
        }

    }

}
