package nl.ordina.takenlijst.domain;

import java.util.List;

public interface TaakGateway {
    void slaTaakOp(Taak taak);
    List<Taak> toonTaken();
}
