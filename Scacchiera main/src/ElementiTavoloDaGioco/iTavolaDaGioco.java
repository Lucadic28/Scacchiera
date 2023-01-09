package ElementiTavoloDaGioco;
import FunzionalitaPezzi.Position;
import java.util.TreeSet;

/** Interfaccia che contiene metodi inerenti da implementare nella scacchiera */
public interface iTavolaDaGioco {

    /** metodo che ritorna una volta implementato nella classe Scacchiera la larghezza della scacchiera */
    int getWidth();

    /** metodo che ritorna una volta implementato nella classe Scacchiera l'altezza della scacchiera */
    int getHeight();

    /**
     * metodo di default per controllare se la posizione è presente della scacchiera
     * @param p oggetto di tipo posizione che rappresenta la posizione passata in input da verificare */
    default boolean isInBoard(Position p){
        return false;
    };

    /** Metodo che restituisce una volta implementato nella classe Scacchiera la lista in ordine di tutte le posizioni della scacchiera */
    TreeSet positions();
}