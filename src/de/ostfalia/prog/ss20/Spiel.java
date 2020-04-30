package de.ostfalia.prog.ss20;

import de.ostfalia.prog.ss20.enums.Farbe;
import de.ostfalia.prog.ss20.enums.Richtung;
import de.ostfalia.prog.ss20.figuren.Schlumpf;

import java.util.Scanner;

import static de.ostfalia.prog.ss20.enums.Farbe.*;
import static de.ostfalia.prog.ss20.enums.Richtung.ABZWEIGEN;

/**
 * Controller
 */
public class Spiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ZombieSchluempfe zombieSchluempfe = new ZombieSchluempfe("BLAU-A:30, BLAU-B:28, BLAU-C:30, BLAU-D:28, GELB-A:30, GELB-B:28, GELB-C:30, GELB-D:28, Bzz:20, Doc:29", BLAU, GELB);

        zombieSchluempfe.bewegeFigur("BLAU-A", 2, ABZWEIGEN);
        zombieSchluempfe.bewegeFigur("GELB-A", 2, ABZWEIGEN);
        zombieSchluempfe.bewegeFigur("BLAU-B", 4, ABZWEIGEN);
        zombieSchluempfe.bewegeFigur("GELB-B", 4, ABZWEIGEN);
        zombieSchluempfe.bewegeFigur("BLAU-C", 2, ABZWEIGEN);
        zombieSchluempfe.bewegeFigur("GELB-C", 2, ABZWEIGEN);

        System.out.println(zombieSchluempfe.toString());
        System.out.println(zombieSchluempfe.gewinner());

        /*Farbe farbeGewonnen = zombieSchluempfe.gewinner(); //hier kommt grad null zurück

        while (null != farbeGewonnen) {
            System.out.println("Es ist Spieler " + zombieSchluempfe.getFarbeAmZug() + " dran.");

            //System.out.println(zombieSchluempfe.toString());

            int augenzahl = zombieSchluempfe.wuerfeln(); //6 = fliege
            if (augenzahl == 6) {
                while (augenzahl == 6) {
                    augenzahl = zombieSchluempfe.wuerfeln();
                }
                System.out.println("Augenzahl der Fliege: " + augenzahl);

                //nachrechnen ob abbiegung zwischen figur und figur+augenzahl da ist
                if (zombieSchluempfe.fliege.getAktuellesFeld() <= 3 && zombieSchluempfe.fliege.getAktuellesFeld() + augenzahl > 3) {

                    System.out.println("In welche Richtung soll gezogen werden? WEITER oder ABZWEIGEN?");
                    String richtungString = scanner.next(); // TODO: 23.04.2020 fehlerhafte eingabe abfangen

                    //geht das kürzer?
                    if (richtungString.toUpperCase().equals(Richtung.WEITER)) {
                        zombieSchluempfe.bewegeFigur("Fliege", augenzahl, Richtung.WEITER);
                    } else if (richtungString.toUpperCase().equals(Richtung.ABZWEIGEN)) {
                        zombieSchluempfe.bewegeFigur("Fliege", augenzahl, Richtung.ABZWEIGEN);
                    }
                } else {
                    zombieSchluempfe.bewegeFigur("Fliege", augenzahl);
                }

            } else {
                System.out.println("Augenzahl: " + augenzahl);

                System.out.println("Welche Figur soll gezogen werden?");
                String figurName = scanner.next(); //fehlerhafte eingabe abfangen

                //nachrechnen ob abbiegung zwischen figur und figur+augenzahl da ist
                for (Spieler spieler : zombieSchluempfe.getSpielerListe()) {
                    for (Schlumpf schlumpf : spieler.getSchlumpfListe()) {
                        if (schlumpf.getName().equals(figurName)) {

                            if ((schlumpf.getAktuellesFeld() <= 3 && schlumpf.getAktuellesFeld() + augenzahl > 3)
                                    || (schlumpf.getAktuellesFeld() <= 31 && schlumpf.getAktuellesFeld() + augenzahl > 31)) {

                                System.out.println("In welche Richtung soll gezogen werden? WEITER oder ABZWEIGEN?");
                                String richtungString = scanner.next(); // TODO: 23.04.2020 fehlerhafte eingabe abfangen

                                //geht das kürzer?
                                if (richtungString.toUpperCase().equals(Richtung.WEITER)) {
                                    zombieSchluempfe.bewegeFigur(figurName, augenzahl, Richtung.WEITER);
                                } else if (richtungString.toUpperCase().equals(Richtung.ABZWEIGEN)) {
                                    zombieSchluempfe.bewegeFigur(figurName, augenzahl, Richtung.ABZWEIGEN);
                                }
                            } else {
                                zombieSchluempfe.bewegeFigur(figurName, augenzahl);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(farbeGewonnen + " hat gewonnen");
         */


//        ZombieSchluempfe zombieSchluempfe = new ZombieSchluempfe(BLAU, ROT);
//        System.out.println(zombieSchluempfe.toString());
//        zombieSchluempfe.bewegeFigur("BLAU-A", 3);
//        System.out.println(zombieSchluempfe.toString());
////        System.out.println(zombieSchluempfe.getSpielerListe().get(0).name);

    }
}
