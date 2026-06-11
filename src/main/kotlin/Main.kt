import business.DVD
import business.EnregistrementAudio
import business.Journal
import business.Livre
import business.Magazine

fun main() {
    val bibliotheque = Bibliotheque()
    val magazine = Magazine("National Geographic", "2024-10-28", "10")
    val journal = Journal("Le Monde", "28/10/2024")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", "1967-01-01", 960, "Classical")
    val dvd = DVD("Inception", "2010-01-01", 8880, "Action")
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")

    bibliotheque.ajouterMedia(magazine)
    bibliotheque.ajouterMedia(journal)
    bibliotheque.ajouterMedia(enregistrementAudio)
    bibliotheque.ajouterMedia(dvd)
    bibliotheque.ajouterMedia(livre)

    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.afficherEmprunts()
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(livre)
    bibliotheque.afficherEmprunts()
}