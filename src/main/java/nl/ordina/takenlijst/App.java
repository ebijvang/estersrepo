package nl.ordina.takenlijst;

import nl.ordina.takenlijst.core.domain.TaakGateway;
import nl.ordina.takenlijst.core.usecase.MaakTaak;
import nl.ordina.takenlijst.core.usecase.MaakTaakInterface;
import nl.ordina.takenlijst.delivery.Presenter;
import nl.ordina.takenlijst.persistency.RealTaakGateway;


public class App {
    public static void main (String[] args){
        TaakGateway taakGateway = new RealTaakGateway();
        MaakTaakInterface maakTaak = new MaakTaak(taakGateway);
        Presenter presenter = new Presenter(maakTaak);
        presenter.start();
    }
}
