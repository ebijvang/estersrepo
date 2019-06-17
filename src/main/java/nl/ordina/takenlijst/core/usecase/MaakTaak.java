package nl.ordina.takenlijst.core.usecase;

import nl.ordina.takenlijst.core.domain.Taak;
import nl.ordina.takenlijst.core.domain.TaakGateway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MaakTaak implements MaakTaakInterface {

    private TaakGateway taakGateway;

    public MaakTaak(TaakGateway taakGateway) {
        this.taakGateway = taakGateway;
    }

    @Override
    public Integer voerUit(String omschrijving, String prioriteit, String uitersteDatumAfhandelen) {
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
    public void toon(Taak taak) {
        System.out.println(taak.toString());
    }
}
