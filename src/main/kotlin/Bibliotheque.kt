import business.Consultable
import business.Empruntable
import business.Media

class Bibliotheque {

    // Attributs
    var medias: MutableList<Media>
        private set

    var emprunts: MutableList<Media>
        private set

    // Constructeurs
    constructor(medias: MutableList<Media>, emprunts: MutableList<Media>) {
        this.medias = medias
        this.emprunts = emprunts
    }

    constructor() : this(mutableListOf<Media>(), mutableListOf<Media>())

    // Méthodes
    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    fun emprunter(media: Media) {
        if (media !is Empruntable<*>) {
            println("Ce média ne peut pas être emprunté.")
            return
        }
        if (emprunts.contains(media)) {
            println("Impossible d'emprunter ce média, il est déjà emprunté.")
            return
        }

        if (media.emprunter()) {
            emprunts.add(media)
        } else {
            println("Impossible d'emprunter le média")
        }
    }

    fun retourner(media: Media) {
        if (media !is Empruntable<*>) {
            println("Ce média ne peut pas être emprunté et retourné.")
            return
        }

        if (!emprunts.contains(media)) {
            println("Ce média n'est pas emprunté.")
            return
        }

        if (media.retourner()) {
            emprunts.remove(media)
        } else {
            println("Impossible de retourner le média.")
        }
    }

    fun consulter(media: Media) {
        if (media !is Consultable<*>) {
            println("Ce média ne peut pas être consulté.")
            return
        }

        media.consulter()
    }

    fun afficherEmprunts() {
        if (emprunts.isEmpty()) {
            println("Aucun média n'est actuellement emprunté.")
            return
        }

        println("Emprunts en cours :")
        for (mediaEmprunte in emprunts) {
            mediaEmprunte.afficher()
        }
    }
}