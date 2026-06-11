package business

import java.text.SimpleDateFormat
import java.time.LocalDate

abstract class Media {
    // Companion
    companion object {
        val dateFormater: SimpleDateFormat = SimpleDateFormat("yyyy/MM/dd")
    }

    // Attributs
    var titre: String = ""
        private set
    var dateDeParution: String = ""
        private set

    // Setters
    fun setTitle(titre: String) { this.titre = titre }
    fun setDate(dateDeParution: String) { this.dateDeParution = dateFormater.parse(dateDeParution).toString() }

    // Constructeurs
    constructor(titre: String, date: String) {
        this.setTitle(titre)
        this.setDate(date)
    }

    constructor(titre: String) : this(titre, LocalDate.now().toString())

    // Méthodes
    abstract fun afficher()
}