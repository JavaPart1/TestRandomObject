package be.vdab.apps;

import be.vdab.model.RandGetal;

public class RandApp {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            RandGetal rndGet = new RandGetal();
            System.out.println(rndGet.getWaarde());
            System.out.println(rndGet.getTekst());
        }
    }
}
// Dit kon veel simpeler. Neem een keer kijkje in repo van Wouter of Thomas bijv.
