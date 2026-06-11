package business

class DVD : Media, Empruntable<DVD>, Consultable<DVD> {

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
        println(" - DVD: Titre = '${this.titre}', Date de parution = '${this.dateDeParution}', Durée = ${this.duree}s, Genre = ${this.genre}")
    }

    override fun emprunter(): Boolean {
        println("Le DVD '${this.titre}' a été emprunté")
        return true
    }

    override fun retourner(): Boolean {
        println("Le DVD '${this.titre}' a été retourné")
        return true
    }

    override fun consulter() {
        println("Le DVD '${this.titre}'est consulté sur place")
    }
}