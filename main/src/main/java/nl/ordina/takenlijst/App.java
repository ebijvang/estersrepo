package nl.ordina.takenlijst;

import nl.ordina.takenlijst.domain.TaakGateway;
import nl.ordina.takenlijst.usecase.MaakTaak;
import nl.ordina.takenlijst.usecase.MaakTaakInterface;



public class App {
    public static void main (final String[] args){
        TaakGateway taakGateway = new RealTaakGateway();
        MaakTaakInterface maakTaak = new MaakTaak(taakGateway);
        Presenter presenter = new Presenter(maakTaak);
        presenter.start();
    }
}
