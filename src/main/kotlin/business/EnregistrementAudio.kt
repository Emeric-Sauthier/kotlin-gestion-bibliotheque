package business

class EnregistrementAudio : Media, Empruntable<EnregistrementAudio>, Consultable<EnregistrementAudio> {

    // Attributs
    var duree: Int
        private set

    var genre: String
        private set

    // Constructeur
    constructor(titre: String, dateDeParution: String, duree: Int, genre: String) : super(titre, dateDeParution) {
        this.duree = duree
        this.genre = genre
    }

    // Méthodes
    override fun afficher() {
        println("- Enregistrement Audio: Titre = '${this.titre}', Durée = '${this.duree}' minutes, Genre = '${this.genre}'")
    }

    override fun emprunter(): Boolean {
        println("L'enregistrement audio '${this.titre}' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        println("L'enregistrement audio '${this.titre}' a été retourné.")
        return true
    }

    override fun consulter() {
        println("L'enregistrement audio '${this.titre}' est consulté sur place.")
    }
}