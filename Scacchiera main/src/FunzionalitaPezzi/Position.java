package FunzionalitaPezzi;
import java.util.Objects;

/** Classe che descrive una posizione sulla scacchiera */
public class Position implements Comparable <Position>{

    /** Attributo che indica la coordianta orizzontale x della posizione */
    private int x;
    /** Atributo che indica la coordinata verticale y della posizione */
    private int y;

    /**
     * Costruttore per istanziare una nuova Posizione che ha come parametri tutti gli attributi delle classe Posizione
     * @param x cooridnata orizzontale x
     * @param y coordinata verticale y
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo get che ritotna la x ( coordinata orizzontale ) della posizione
     * @return x
     */
    public int getX() { return this.x; }

    /**
     * Metodo get che ritotna la y ( coordinata verticale ) della posizione
     * @return y
     */
    public int getY() { return this.y; }

    /**
     * Override del metodo equals  per verificare se due oggetti di tipo Position appartengono alla stessa classe e
     * se sono uguali tra loro
      * @param o oggetto passato in input da confrontare
     * @return true se la condizione è verificata, false se non lo è
     */
    @Override
    public boolean equals(Object o) {
        Position position = (Position) o;
        if ( getClass() == o.getClass() && this.x == position.x && this.y == position.y ) return true;
        else return false;
    }

    /**
     * Override del metodo hasCode che permette di eguagliare gli hascode dei due oggetti esaminati nel metodo equals
     * @return hasCode
     */
    @Override
    public int hashCode() { return Objects.hash(x, y); }

    /**
     * compareTo ordina prima in base alla x e poi in base alla y le coordinate.
     * @param p oggetto in input da confrontare
     * @return la posizione - se è la prima - altrimenti ne compara anche la coordinata y.
     */
    @Override
    public int compareTo(Position p) {
        int position = x - p.x;
        return (position != 0 ? position : y-p.y);
    }

    /**
     * Override che permette di stampare gli attributi della classe Position quando necessario
     * @return stringa con tutti gli attributi della classe Position
     */
    @Override
    public String toString() {
        return "Posizione{" + "x=" + x + ", y=" + y + '}';
    }
}