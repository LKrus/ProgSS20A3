package de.ostfalia.prog.ss20.felder;

import de.ostfalia.prog.ss20.figuren.Schlumpf;

import java.util.List;

public class Zielfeld extends Spezialfeld {

    public Zielfeld(int nummer, List<Feld> nachbarListe, List<Schlumpf> figurListe) {
        super(nummer, nachbarListe, figurListe);
    }
}
