package business

class Livre : Media, Consultable<Livre>, Empruntable<Livre> {

    var auteur: String
        private set

    var editeur: String
        private set

    // Setters
    fun setAuteur(auteur: String) { this.auteur = auteur }
    fun setEditeur(editeur: String) { this.editeur = editeur }

    // Constructeurs
    constructor(titre: String, dateDeParution: String, auteur: String, editeur: String) : super(titre, dateDeParution) {
        this.auteur = auteur
        this.editeur = editeur
    }

    // Méthodes
    override fun afficher() {
        println(" - Livre: Titre = '${this.titre}', Auteur = '${this.auteur}', Éditeur = '${this.editeur}', Date de parution = '${this.dateDeParution}'")
    }

    override fun consulter() {
        println("Le livre '${this.titre}' de ${this.auteur} est consulté sur place")
    }
    override fun emprunter(): Boolean {
        println("Le livre '${this.titre}' de ${this.auteur} a été emprunté")
        return true
    }

    override fun retourner(): Boolean {
        println("Le livre '${this.titre}' de ${this.auteur} a été retourné")
        return true
    }
}