package business

import java.time.LocalDate

abstract class Media {

    // Attributs
    var titre: String = ""
        private set
    var dateDeParution: String = ""
        private set

    // Setters
    fun setTitle(titre: String) { this.titre = titre }
    fun setDate(dateDeParution: String) {
        if (dateDeParution.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            this.dateDeParution = dateDeParution
        } else {
            val now = LocalDate.now()
            this.dateDeParution = "${now.year}-${String.format("%02d", now.monthValue)}-01"
        }
    }

    // Constructeurs
    constructor(titre: String, date: String) {
        this.setTitle(titre)
        this.setDate(date)
    }

    constructor(titre: String) : this(titre, LocalDate.now().toString())

    // Méthodes
    abstract fun afficher()
}