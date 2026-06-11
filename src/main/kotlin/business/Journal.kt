package business

class Journal(titre: String, date: String) : Media(titre, date), Consultable<Journal> {
    override fun afficher() {
        println(" - Journal: Titre = '${this.titre}', Date = '${this.dateDeParution}'")
    }

    override fun consulter() {
        println("Le journal '${this.titre}' du '${this.dateDeParution}' est consulté sur place.")
    }
}