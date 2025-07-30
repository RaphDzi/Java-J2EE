# Java-J2EE

## Exercice 1

### Partie 1

Créez une application JEE qui contiendra 3 servlets et une page d'index.

Les 3 servlets doivent avoir des routes différentes :

* Une servlet qui renvoie du texte brut.
* Une servlet qui renvoie du texte HTML.
* Une servlet qui transfère la requête vers une page JSP.

La page d'accueil (index) de l'application contiendra des liens pour accéder à ces 3 servlets.

### Partie 2

Nous souhaitons ajouter à l'exercice 1 deux autres servlets qui transfèrent leurs requêtes vers des pages JSP.
Nos trois pages JSP devront utiliser la librairie Bootstrap sans nécessiter de réimporter cette bibliothèque
sur chaque page.



## Exercice 2

Nous allons creer une servlet qui transfère sa requête vers une page JSP afin d'afficher dans
un tableau (avec Bootstrap) une liste d'au moins trois personnes.
Chaque personne sera représentée par au moins :

* Un nom
* Un prénom
* Un âge



## Exercice 3

Nous allons creer une servlet qui transfère sa requête vers une page JSP afin d'afficher dans un tableau (avec Bootstrap) une liste de chat. Chaque chat sera représentée par au moins :

* Un nom
* Une race
* Un repas favoris
* Une date de naissance

Nous aurons la possibilité d'ajoute des chats a notre liste via un formulaire.

Bonus :

Si la liste de chats est vide nous aurons un message "vous n'avez aucun chat dans votre liste"
a la place d'un tableau vide.







## Exercice 4



#### Objectif :

Réaliser une application web en Java JEE utilisant des servlets pour gérer une collection de chiens. L'application doit permettre d'ajouter, de consulter la liste de tous les chiens et de voir les détails d'un chien spécifique. Les données des chiens doivent être persistées à l'aide de Hibernate.



#### Description des entités :



**Chien** :

- `id` : Identifiant unique du chien (généré automatiquement).

- `nom`  : Nom du chien.

- `race` : Race du chien.

- `dateDeNaissance`  : Date de naissance du chien.



#### Fonctionnalités requises :



1. **Page pour afficher tous les chiens** :

&nbsp;   - Cette page doit lister tous les chiens présents dans la base de données.

&nbsp;   - Chaque chien doit être affiché avec son nom, sa race, et un lien vers la page de détails.



2. **Page pour ajouter un chien** :

&nbsp;   - Cette page doit fournir un formulaire permettant de saisir les informations d'un nouveau chien (nom, race, date de naissance).

&nbsp;   - Une fois le formulaire soumis, les données doivent être persistées dans la base de données à l'aide de Hibernate.



3. **Page pour afficher les détails d'un chien** :

&nbsp;   - Cette page doit afficher les détails complets d'un chien spécifique.



#### Contraintes techniques :

- Utiliser Java JEE avec les servlets pour la partie web.

- Utiliser Hibernate ou jpa pour la couche de persistance.

