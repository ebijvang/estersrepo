package nl.ordina.takenlijst;

import nl.ordina.takenlijst.domain.Taak;
import nl.ordina.takenlijst.domain.TaakGateway;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RealTaakGateway implements TaakGateway {
    private List<Taak> opgeslagenTaken = new ArrayList<>();

    private String bestandsNaam = "D:\\workspaces\\estersrepo\\src\\main\\resources\\taken";
    private File bestand = new File(bestandsNaam);

    public RealTaakGateway(){
        if (bestand.exists()){
            laadTaken();
        }
    }

    private void laadTaken() {
        Object obj = null;
        try{
            FileInputStream fileIn = new FileInputStream(bestandsNaam);
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            obj = ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        opgeslagenTaken.add((Taak) obj);
    }

    @Override
    public void slaTaakOp(final Taak taak) {
        opgeslagenTaken.add(taak);
        bewaarTaak(taak);
    }

    private void bewaarTaak(final Taak taak) {
        try {
            FileOutputStream fileOut = new FileOutputStream(bestandsNaam);
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);
            oos.writeObject(taak);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Taak> toonTaken() {
        return opgeslagenTaken;
    }
}
