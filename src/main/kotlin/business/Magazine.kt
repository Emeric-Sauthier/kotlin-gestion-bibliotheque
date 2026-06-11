package business

class Magazine : Media, Consultable<Magazine> {

    // Attributs
    private var numero: String
        private set

    // Setters
    fun setNumero(numero: String) { this.numero = numero }

    // Constructeurs
    constructor(titre: String, date: String, numero: String) : super(titre, date) {
        this.numero = numero
    }

    // Méthodes
    override fun consulter() {
        println("Le magazine '${this.titre}', numéro '${this.numero}' (${this.dateDeParution}) est consulté sur place.")
    }

    override fun afficher() {
        println(" - Magazine: Titre = '${this.titre}', Date = '${this.dateDeParution}', Numéro = '${this.numero}'")
    }
}