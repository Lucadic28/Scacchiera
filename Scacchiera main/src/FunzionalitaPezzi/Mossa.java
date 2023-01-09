package FunzionalitaPezzi;
import ElementiTavoloDaGioco.Pezzo;
import java.util.Objects;

/** Classe che descrive le caratteristiche di una Mossa */
public class Mossa {

    /** Atributo che definisce la x ( coordinata orizzontale ) della posizione della mossa che si vuole eseguire */
    private int x;
    /** Atributo che definisce la y ( coordinata verticale ) della posizione della mossa che si vuole eseguire */
    private int y;
    /** Attributo di tipo Pezzo che indica il pezzo checsi vuole spostare tramite l'eseguzione della mossa */
    private Pezzo pezzo;

    /**
     * Costruttore per istanziare una nuova mossa che ha come parametri tutti gli attributi della classe Mossa
     * @param pezzo pezzo che si vuole spostare tramite la mossa
     * @param x coordinata orizzontale della posizione finale della mossa
     * @param y coordinata verticale della posizione finale della mossa
     */
    public Mossa (Pezzo pezzo, int x, int y){
        this.pezzo = pezzo;
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo get che ritorna la coordinata orizzontale x della posizione finale della mossa
     * @return cordinata orizzionale x
     */
    public int getX() { return x; }

    /**
     * Metodo get che ritorna la coordinata verticale y della posizione finale della mossa
     * @return cordinata verticale y
     */
    public int getY() { return y; }

    /**
     * Metodo get che ritorna il pezzo che con la mossa si vuole spostare
     * @return pezzo
     */
    public Pezzo getPezzo() { return pezzo; }

    /**
     * Override del metodo equals che verifica se due oggetti della classe Mossa appartengono alla stessa classe e se
     * sono uguali
     * @param o oggetto in input da verificare
     * @return true se la condizione è verificata, false se non lo è
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mossa mossa)) return false;
        return x == mossa.x && y == mossa.y && pezzo.equals(mossa.pezzo);
    }

    /**
     * Override del metodo hasCode che permette di eguagliare gli hascode dei due oggetti esaminati nel metodo equals
     * @return hasCode
     */
    @Override
    public int hashCode() { return Objects.hash(x, y, pezzo); }
}