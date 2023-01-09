package ElementiTavoloDaGioco;
import CaratteristichePezzi.Colore;
import CaratteristichePezzi.TipoPezzo;
import java.util.Objects;

/** Questa classe descrive un pezzo sulla scacchiera */
public class Pezzo {

    /** Questo attributo definisce la tipologia di pezzo  */
    private TipoPezzo tipo;
    /** Questo attributo definisce il colore del pezzo */
    private Colore colore;

    /**
     * Metodo costruttore per istanziare un nuovo  pezzo
     * @param tipoPezzo tipologia de pezzo
     * @param colorePezzo colore del pezzo
     */
    public Pezzo (TipoPezzo tipoPezzo, Colore colorePezzo){
        this.tipo = tipoPezzo;
        this.colore = colorePezzo;
    }

    /**
     *  Metodo get che ritorna il tipo del pezzo
     * @return tipo
     */
    public TipoPezzo getTipo() { return tipo; }

    /**
     * Metodo get che ritorna il colore del pezzo
     * @return colore
     */
    public Colore getColore() { return colore; }

    /**
     * Override del metodo equals per verificare se due Pezzi appartengono alla stessa classe e se sono uguali
     * @param o oggetto passato in input da verificare
     * @return true se la condizione è verificate, false se non è verificata
     */
    @Override
    public boolean equals(Object o) {
        Pezzo pezzo = (Pezzo) o;
        if (this.tipo == pezzo.tipo && this.colore == pezzo.colore) return true;
        else return false;
    }

    /**
     * Override del metodo hasCode che permette di eguagliare gli hascode dei due oggetti esaminati nel metodo equals
     * @return hasCode
     */
    @Override
    public int hashCode() { return Objects.hash(tipo, colore); }

    /**
     * Override che permette di stampare gli attributi della classe Pezzo quando Necessario
     * @return stringa con tutti gli attributi della classe Pezzo
     */
    @Override
    public String toString() {
        return "ElementiTavoloDaGioco.Pezzo{" + "tipo=" + tipo + ", colore=" + colore + '}';
    }
}