package be.vdab.model;

import java.util.Random;

public class RandGetal extends Random {
    private int waarde;
    private String tekst;

    public RandGetal() {
        int hbound = 1000;
        int firstHold = 250;
        int secHold = 500;
        this.waarde = nextInt(hbound);

        if (this.waarde < firstHold){
            this.tekst = "PIEF";
        } else if (this.waarde < secHold){
            this.tekst = "POEF";

        }else{
            this.tekst = "PAF";
        }
    }

    public int getWaarde() {
        return waarde;
    }

    public String getTekst() {
        return tekst;
    }
}
