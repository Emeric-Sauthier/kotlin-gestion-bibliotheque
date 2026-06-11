package business

class EnregistrementAudio : Media, Empruntable<EnregistrementAudio>, Consultable<EnregistrementAudio> {

    // Attributs
    var duree: Int
        private set

    var genre: String
        private set

    // Setters
    fun setDuree(duree: Int) { this.duree = duree }
    fun setGenre(genre: String) { this.genre = genre }

    // Constructeur
    constructor(titre: String, dateDeParution: String, duree: Int, genre: String) : super(titre, dateDeParution) {
        this.duree = duree
        this.genre = genre
    }

    // Méthodes
    override fun afficher() {
        println(" - Enregistrement Audio: Titre = '${this.titre}', Date de parution = '${this.dateDeParution}', Durée = ${this.duree}s, Genre = ${this.genre}")
    }

    override fun emprunter(): Boolean {
        println("L'enregistrement audio '${this.titre}' a été emprunté")
        return true
    }

    override fun retourner(): Boolean {
        println("L'enregistrement audio '${this.titre}' a été retourné")
        return true
    }

    override fun consulter() {
        println("L'enregistrement audio '${this.titre}'est consulté sur place")
    }
}