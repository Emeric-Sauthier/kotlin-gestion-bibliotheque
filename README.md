# Gestion de bibliothèque

Développeur : SAUTHIER Emeric

Application Kotlin console simulant un système de gestion de bibliothèque : emprunt, retour et consultation de médias (Livres, DVDs, Enregistrements Audio, Magazines, Journaux).

---

## Exécution du programme

### Prérequis

- **JDK 17 ou supérieur** (le projet utilise le toolchain JVM 25 via Gradle — Gradle télécharge automatiquement le JDK requis si absent)
- Cloner le projet depuis GitHub : `git clone https://github.com/Emeric-Sauthier/kotlin-gestion-bibliotheque

### Via IntelliJ IDEA (recommandé)

1. Ouvrir le dossier du projet dans une IDE
3. Ouvrir le fichier `src/main/kotlin/Main.kt`
4. Lancer la fonction main ou Main.kt

---

## Architecture du projet



---

## Gestion des dates

Le format de date utilisé est le format ISO 8601 (`YYYY-MM-DD`), conformément aux instructions du projet.

Lors de l'initialisation d'un média, toute valeur respectant le format ISO est stockée telle quelle. Si la date fournie ne correspond pas au format attendu (ex. `28/10/2024` pour un Journal), la valeur est remplacée par le premier jour du mois en cours.

---

## Sortie attendue

Résultat de l'exécution de `Main.kt` avec les données de l'exemple :

```
Le DVD 'Inception' a été emprunté.
Le livre '1984' de 'George Orwell' a été emprunté.
Le magazine 'National Geographic', numéro '10' (2024-10-28) est consulté sur place.
Le journal 'Le Monde' du '28/10/2024' est consulté sur place.
L'enregistrement audio 'Beethoven - Symphonie No.9' a été emprunté.
Emprunts en cours:
- DVD: Titre = 'Inception', Durée = '8880' minutes, Genre = 'Action'
- Livre: Titre = '1984', Auteur = 'George Orwell', Éditeur = 'Gallimard', Date de parution = '1972-01-01'
- Enregistrement Audio: Titre = 'Beethoven - Symphonie No.9', Durée = '960' minutes, Genre = 'Classical'
Le DVD 'Inception' a été retourné.
Le livre '1984' de 'George Orwell' a été retourné.
Emprunts en cours:
- Enregistrement Audio: Titre = 'Beethoven - Symphonie No.9', Durée = '960' minutes, Genre = 'Classical'
```
