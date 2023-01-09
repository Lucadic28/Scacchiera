package Test;
import CaratteristichePezzi.Colore;
import CaratteristichePezzi.TipoPezzo;
import ElementiTavoloDaGioco.Pezzo;
import ElementiTavoloDaGioco.Scacchiera;
import FunzionalitaPezzi.Mossa;
import FunzionalitaPezzi.Position;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Classe per testare tutte i metodi e le funzionalità di tutte le classi del Progetto */
public class Test {

    public static void main(String[] args) {

        Scacchiera scacchiera = new Scacchiera(8, 8);

        Position position1 = new Position(2, 3);
        Position position2 = new Position(2, 1);
        Position position3 = new Position(3, 3);
        Position position4 = new Position(1, 3);
        Position position5 = new Position(1, 4);
        Position positionOut = new Position(1, 44);
        Position positionRe = new Position(2, 6);
        Position positionRegina = new Position(3, 7);

        Pezzo re = new Pezzo(TipoPezzo.RE, Colore.NERO);
        Pezzo rePezzotto = new Pezzo(TipoPezzo.RE, Colore.NERO);
        Pezzo regina = new Pezzo(TipoPezzo.REGINA, Colore.BIANCO);

        Mossa mossa1 = new Mossa(re, 1, 3);
        Mossa mossa2 = new Mossa(regina, 3, 3);
        Mossa mossaNonValida1 = new Mossa(rePezzotto, 15, 3);
        Mossa mossaNonValida2 = new Mossa(re, 3, 3);
        Mossa mossa1b = new Mossa(re, 2, 6);
        Mossa mossaX = new Mossa(re, 2, 6);

        System.out.println("Sto testando il metodo equals della classe Pezzo:");
        System.out.println(re.equals(rePezzotto));
        System.out.println(re.equals(regina));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando il metodo equals della classe Position:");
        System.out.println((position4.equals(position5)));
        System.out.println(position1.equals(position2));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando il metodo compareTo della classe Position:");
        List<Position> listaPosizioni = new ArrayList<>();
        listaPosizioni.add(position1);
        listaPosizioni.add(position2);
        listaPosizioni.add(position3);
        listaPosizioni.add(position4);
        listaPosizioni.add(position5);

        System.out.println("Posizioni disordinate:");
        System.out.println(listaPosizioni);
        Collections.sort(listaPosizioni);
        System.out.println("Posizioni ordinate:");
        System.out.println(listaPosizioni);
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando il metodo equals della classe Mossa:");
        System.out.println(mossa1.equals(mossa1b));
        System.out.println(mossa1.equals(mossa2));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando i metodi getWidth e getHeight:");
        System.out.println("L'altezza della scacchiera è " + scacchiera.getHeight() + " e la sua larghezza è " + scacchiera.getWidth() + ".");
        System.out.println("-----------------------------------------");


        System.out.println("Sto testando l'override del metodo isValid dell'interfaccia iTavolaDaGioco nella classe Scacchiera:");
        System.out.println(scacchiera.isValid(mossa1));
        System.out.println(scacchiera.isValid(mossaNonValida1));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando l'override del metodo isInBoard dell'interfaccia iTavolaDaGioco nella classe Scacchiera:");
        System.out.println(scacchiera.isInBoard(position1));
        System.out.println(scacchiera.isInBoard(positionOut));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando l'override del metodo positions dell'interfaccia iTavolaDaGioco nella classe Scacchiera:");
        System.out.println(scacchiera.positions());
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando il metodo put della classe Scacchiera:");
        System.out.println("Posizione vuota:");
        System.out.println(scacchiera.getPosizioniPezzi().get(position1));
        System.out.println("Sto inserendo il re nella posizione vuota:");
        scacchiera.put(re, position1);
        System.out.println(scacchiera.getPosizioniPezzi().get(position1));
        System.out.println("-----------------------------------------");

        System.out.println("Sto testando il metodo eseguiMossa della classe Scacchiera:");
        System.out.println("Pezzo nella posizione del re:");
        System.out.println(scacchiera.getPosizioniPezzi().get(position1));
        System.out.println("inserisco il re nella nuova posizione dopo aver  eseguito la mossa:");
        scacchiera.eseguiMossa(mossa1);
        System.out.println(scacchiera.getPosizioniPezzi().get(position4));
        System.out.println("Posizione iniziale del re che dopo la mossa si e' liberata:");
        System.out.println(scacchiera.getPosizioniPezzi().get(position1));
    }
}