package nl.ordina.takenlijst.core.domain;

import java.util.List;

public interface TaakGateway {
    void slaTaakOp(Taak taak);
    List<Taak> toonTaken();
}
