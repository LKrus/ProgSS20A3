package de.ostfalia.prog.ss20.felder;

import de.ostfalia.prog.ss20.figuren.Schlumpf;

import java.util.List;

public class Normalfeld extends Feld {
    public Normalfeld(int nummer, List<Feld> nachbarListe, List<Schlumpf> figurListe) {
        super(nummer, nachbarListe, figurListe);
    }
}
