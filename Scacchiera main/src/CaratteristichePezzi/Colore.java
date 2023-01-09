package CaratteristichePezzi;

/** Enumerazione che contiene  le tipologi di colore del pezzo o pedina della scacchiera */
public enum Colore {

    BIANCO ("bianco"),
    NERO ("bianco");

    /** Stringa che contiene la descrizione del colore del pezzo */
    String colore;

    /** Costruttore per istanziare il colore del Pezzo
     * @param colore */
    Colore(String colore) {
        this.colore = colore;
    }
}