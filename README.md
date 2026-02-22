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


<img width="461" height="853" alt="Screenshot 2026-02-21 220836" src="https://github.com/user-attachments/assets/bf08c6b3-a7f8-4431-b107-78d4b9a3dae4" />

-----

<img width="499" height="885" alt="Screenshot 2026-02-21 220840" src="https://github.com/user-attachments/assets/abb38675-aa31-4bf5-8c0c-c33a1fe34800" />

----
<img width="414" height="761" alt="Screenshot 2026-02-21 220847" src="https://github.com/user-attachments/assets/7f0b9690-7fdf-49c0-980d-9c9396d8d7cf" />



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
