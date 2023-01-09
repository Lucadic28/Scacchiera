package ElementiTavoloDaGioco;
import FunzionalitaPezzi.Mossa;
import FunzionalitaPezzi.Position;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/** Questa classe descrive le carratteristiche di una scacchiera */
public class Scacchiera implements iTavolaDaGioco {

    /** Attributo che definisce la larghezza della Scacchiera */
    private int w;
    /** Attributo che definisce l'altezza della Scacchiera */
    private int h;

    /** TreeMap che contiene una serie di posizioni della scacchiera a cui corrispondono i pezzi posizionati su di essa
     *  Ha come chiava una Posizione e come valore il Pezzo posizionato su di essa */
    private TreeMap<Position,Pezzo> posizioniPezzi = new TreeMap<>();
    /** TreeSet che contiene tutte le posizioni esistenti sulla scacchiera, in ordine crescente prima in base alla X e poi in base alle Y */
    private TreeSet<Position> listaPosizioni = new TreeSet<>();

    /**
     * Costruttore che permette di istanziare una scacchiera che prende come paramentri tutti gli attributi delle classe Scacchiera
     * @param larghezza lunghezza della scacchiera
     * @param altezza altezza della scacchiera
     */
    public Scacchiera (int larghezza, int altezza){
        this.w = larghezza;
        this.h = altezza;

        for (int i = 1; i <= h; i++){
            for (int j = 1; j <=w; j++){
                posizioniPezzi.put(new Position(i,j),new Pezzo(null,null));
                listaPosizioni.add(new Position(i,j));
            }
        }
    }

    /**
     * Metodo get che ritorna la Mappa posizionePezzi
     * * @return TreeMap posizioniPezzi
     */
    public TreeMap<Position, Pezzo> getPosizioniPezzi() { return posizioniPezzi; }

    /**
     * Metodo get che ritorna la lista con tutte le posizioni della scacchiera ordinate
     * @return TreeSet listaposizioni
     */
    public TreeSet<Position> getListaPosizioni() { return listaPosizioni; }

    /**
     * Override che ritorna la larghezza della scacchiera
     * @return larghezza scacchiera
     */
    @Override
    public int getWidth() { return w; }

    /**
     * Override che ritorna l'altezza della scacchiera
     * @return altezza della scacchiera
     */
    @Override
    public int getHeight() { return h; }

    /**
     * Override del metodo isInBoard dell'intefaccia iTavoloDaGioco che consente
     * di verificare se l'oggetto in input è presente sualla scacchiera
     * @param p oggetto di tipo posizione che rappresenta la posizione passata in input da verificare
     * @return true se la condizione è verificata, false se non lo è
     */
    @Override
    public boolean isInBoard(Position p) { return posizioniPezzi.containsKey(p); }

    /**
     * Override del metodo positions dell'interfaccia iTavoloDaGioco che ritorna la lista ordinata di tutte le posizioni della scacchiera
     * @return lista ordinata di tutte le posizioni
     */
    @Override
    public TreeSet<Position> positions() { return this.listaPosizioni; }

    /**
     * Metodo che inserisce per la prima volta un Pezzo su una determinata posizione della scacchiera
     * @param pz pezzo da posizionare sulla scacchiera
     * @param ps posizione sulla quale si vuole inserire il Pezzo
     */
    public void put(Pezzo pz, Position ps){
        if (isInBoard(ps) && posizioniPezzi.get(ps).getTipo() == null && posizioniPezzi.get(ps).getColore() == null){
            posizioniPezzi.put(ps,pz);
        }
        else System.out.println("La posizione selezionata è occupata oppure non è parte del tavolo da gioco.");
    }

    /**
     * Metodo che verifica se una Mossa è valida o meno, ovvero se la posizione della mossa presa in input ù
     * è sulla scacchiera  e se quella posizione non è già occupata da un altro pezzo
     * @param m mossa da verificsre
     * @return true se la condizione è verificata, false se non lo è
     */
    public boolean isValid(Mossa m){
        Position position = new Position(m.getX(), m.getY());
        return (isInBoard(position) && posizioniPezzi.get(position).getTipo() == null && posizioniPezzi.get(position).getColore() == null);
    }

    /**
     * Metodo che esegue una mossa presa in input, solo se è valida tramite il metodo isValid, e libera la poszione
     * iniziale da cui parte il pezzo che abbiamo spostato tramite la mossa
     * @param m mossa che vogliamo eseguire
     */
    public void eseguiMossa(Mossa m){

            Position position = new Position(m.getX(), m.getY());
            if (isValid(m)){
                Set<Map.Entry<Position,Pezzo>> entrySet = posizioniPezzi.entrySet();
                for (Map.Entry<Position,Pezzo> entry: entrySet) {
                    if(entry.getValue().equals(m.getPezzo())){
                        posizioniPezzi.replace(entry.getKey(),new Pezzo(null,null));
                    }
                }
                posizioniPezzi.put(position, m.getPezzo());
            }
            else System.out.println("La posizione di destinazione della mossa è occupata oppure non è parte del tavolo da gioco.");
    }
}