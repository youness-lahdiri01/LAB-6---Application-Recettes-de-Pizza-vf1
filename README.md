# 🍕 LAB 6 - Application "Recettes de Pizza"

## 📌 Description

Cette application Android permet d'afficher une liste de pizzas avec leurs informations principales (nom, prix, durée de préparation).  
L'utilisateur peut cliquer sur une pizza pour afficher les détails complets : image, ingrédients, description et étapes de préparation.

---

## 🚀 Fonctionnalités

- ✅ Splash Screen au démarrage  
- ✅ Liste des pizzas avec ListView  
- ✅ Adapter personnalisé (BaseAdapter)  
- ✅ Page détail pour chaque pizza  
- ✅ Affichage image + description complète  

---

## 🛠 Technologies utilisées

- Java  
- Android SDK  
- ListView  
- Custom Adapter (BaseAdapter)  
- Architecture DAO / Service  

---

## 📱 Captures d’écran

### 🔹 1️⃣ Splash Screen


<img width="471" height="776" alt="Screenshot 2026-02-21 214709" src="https://github.com/user-attachments/assets/c4a9ae6c-0095-400e-854f-fece43059702" />

-----

<img width="428" height="728" alt="Screenshot 2026-02-21 214717" src="https://github.com/user-attachments/assets/94d3c64d-098c-4535-b933-2c77fbe61d53" />

## Structure du projet
app/

 ├── activities/
 
 ├── adapter/
 
 ├── dao/
 
 ├── service/
 
 ├── model/
 
 └── res/layout/
 
 ## Architecture & Organisation du Code

L’application est structurée selon une architecture simple en couches afin de séparer la logique métier de l’interface utilisateur :

### Model

Contient les classes représentant les données (ex : Pizza.java).

### DAO (Data Access Object)

Responsable de la gestion des données (liste des pizzas, création des objets).

### Service

Couche intermédiaire entre le DAO et les activités.
Permet de centraliser la logique métier.

### Adapter

PizzaAdapter hérite de BaseAdapter pour personnaliser l’affichage des éléments dans la ListView.

### Activities

SplashActivity

MainActivity (Liste des pizzas)

DetailActivity (Détails d’une pizza)
