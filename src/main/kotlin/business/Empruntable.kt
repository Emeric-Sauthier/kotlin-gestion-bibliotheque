package business

interface Empruntable<T> {
    fun emprunter(): Boolean
    fun retourner(): Boolean
}