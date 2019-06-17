package nl.ordina.takenlijst.persistency;

import nl.ordina.takenlijst.core.domain.Taak;
import nl.ordina.takenlijst.core.domain.TaakGateway;

import java.util.ArrayList;
import java.util.List;

public class RealTaakGateway implements TaakGateway {
    private List<Taak> opgeslagenTaken = new ArrayList<>();

    @Override
    public void slaTaakOp(Taak taak) {
        opgeslagenTaken.add(taak);
    }

    @Override
    public List<Taak> toonTaken() {
        return opgeslagenTaken;
    }
}
