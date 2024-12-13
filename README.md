[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/dnW0dm4q)
# Projet "Dice" - Gestion de lancés de dés avec Spring Boot

## Description
Le projet "Dice" est une application construite avec Spring Boot permettant de simuler des lancés de dés et de gérer un historique des résultats en base de données. Ce projet met en œuvre les concepts fondamentaux de Spring Boot, notamment l'injection de dépendances, les services RESTful, les entités JPA et les repositories.

## Étapes réalisées

1.	Création du projet Spring Boot :
   - Utilisation de Spring Initializr pour générer un projet Spring Boot avec les dépendances suivantes :
     - Spring Web
     - Spring Data JPA
     - H2 Database
       
2.	Création de la classe Dice :
   - Cette classe représente un dé avec un nombre de faces configurables.
   - La méthode roll() génère un résultat aléatoire entre 1 et le nombre de faces du dé.



3.	Création de l’entité JPA DiceRollLog :
  - Cette entité permet de stocker l’historique des lancés de dés dans la base de données.
  - Elle contient :
      - id : identifiant unique du lancé.
      - diceCount : le nombre de dés lancés.
      - results : une liste des résultats des lancés.
      - timestamp : l’horodatage du lancé.


4.	Création du Repository DiceRollLogRepository :
  - Ce repository permet de gérer l’entité DiceRollLog en utilisant les méthodes JPA standards.

5.	Création du Service DiceRollService :
   - Ce service contient la logique pour lancer les dés et enregistrer l’historique dans la base de données.
   - La méthode rollDices() prend un paramètre diceCount, effectue les lancers, et enregistre les résultats dans la base de données.

6.	Création du Contrôleur REST DiceController :
   - Ce contrôleur expose deux endpoints :
        - GET /api/dice/rollDice pour lancer un seul dé.
        - GET /api/dice/rollDices/{count} pour lancer un nombre dynamique de dés.

7.	Création du Contrôleur REST DiceLogController :
   - Ce contrôleur permet de récupérer tous les enregistrements des lancés de dés.
   - L’endpoint GET /api/diceLogs retourne tous les enregistrements au format JSON.


8.	Test et validation :
    - L’application a été testée via navigateur web pour s’assurer que les endpoints fonctionnent correctement :
    - Lancer des dés (un et plusieurs à la fois).
    - Afficher l’historique des lancés de dés.
