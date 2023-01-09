package CaratteristichePezzi;

/** eunumerazione che contiene le tipologie di pedina che si possono utilizzare sulla scacchiera */
public enum TipoPezzo {
    DISCO("Pedina della dama"),
    RE("Nel gioco degli scacchi il re (♔, ♚) è il pezzo più importante e non può in nessun caso essere catturato, inoltre una mossa che lasci il proprio re in presa è illegale. Ogni volta che il re è minacciato di presa, viene detto \"sotto scacco\" ed il giocatore che lo difende è obbligato a risolvere questa situazione nella mossa immediatamente successiva. Se non è possibile rimediare, è scacco matto."),
    REGINA("Nel gioco degli scacchi la donna (♕, ♛)[1], chiamata anche regina (dall'inglese queen), è considerato il pezzo più potente, essendo quello che gode della mobilità maggiore. Prima dell'arrivo in Europa degli scacchi questo pezzo era conosciuto come il generale, lo stratega o il visir. La donna è stata usata anche in matematica per sviluppare il rompicapo delle otto regine."),
    TORRE("Nel gioco degli scacchi la torre (♖, ♜) è uno dei pezzi a disposizione dei giocatori. Le torri vengono rappresentate come delle \"torri d'assedio\". Nell'antico gioco indiano erano raffigurate da torri sorrette su degli elefanti."),
    ALFIERE("Nel gioco degli scacchi l'alfiere (♗, ♝) è uno dei pezzi a disposizione dei giocatori. Assieme al cavallo è uno dei cosiddetti \"pezzi leggeri\", in contrapposizione a donna e torre chiamati \"pezzi pesanti\". L'alfiere viene spesso rappresentato con il copricapo da vescovo dato che nei paesi anglofoni è chiamato appunto bishop (vescovo); il nome è invece di origine arabo-persiana: \"alfiere\" deriva infatti da al-fil che significa \"l'elefante\" (al = articolo determinativo; fil = elefante), in quanto nei paesi del Medio Oriente questo pezzo raffigurava tale animale. Nella lingua italiana, invece, il termine significa portabandiera e indica il soldato che, diversi secoli addietro, era deputato a portare il vessillo del suo esercito. In alcune marine del mondo, inoltre, questo termine continua a persistere, riferendosi al grado di ufficiale di vascello più basso nella scala gerarchica."),
    CAVALLO("Nel gioco degli scacchi il cavallo (♘, ♞) è uno dei pezzi a disposizione dei giocatori. Assieme all'Alfiere è uno dei cosiddetti \"pezzi leggeri\" in contrapposizione a Donna e Torre chiamati \"pezzi pesanti\". È spesso raffigurato come la testa di un cavallo. Simboleggia i soldati a cavallo, i cavalieri. Il movimento del cavallo dà origine al problema matematico del Percorso del cavallo."),
    PEDONE("Nel gioco degli scacchi il pedone (♙, ♟) è uno dei pezzi a disposizione dei giocatori. È il pezzo più presente sulla scacchiera (ve ne sono otto per giocatore), e può essere paragonato alla fanteria di uno schieramento militare. Tradizionalmente, i pedoni vengono considerati come una categoria distinta da quella degli altri pezzi essi se arrivano a fine scacchiera possono reincarnarsi in un altro scacco che dopo una mossa avversaria potrà muoversi; se lo scacco appena messo sulla scacchiera sarà in grado di uccidere il re l’avversario sarà obbligato a muovere esclusivamente il re senza poter mangiare quella pedina.");

    /** Stringa che contiene la descrizione del tipo di del pezzo */
    public String descrizionePezzo;

    /**
     * Costruttore per istanziare la tipologia del Pezzo
     * @param descrizionePezzo
     */
    TipoPezzo(String descrizionePezzo) {
        this.descrizionePezzo = descrizionePezzo;
    }
}