package com.example.pizzalab6.service;

import com.example.pizzalab6.R;
import com.example.pizzalab6.classes.Produit;
import com.example.pizzalab6.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProduitService();
        }
        return INSTANCE;
    }

    private void seed() {

        data.add(new Produit(
                "SUPREME DELUXE",
                70.0,
                R.mipmap.pizza1,
                "35 min",
                "- Pâte artisanale\n- Sauce tomate maison\n- Mozzarella\n- Pepperoni\n- Poivrons\n- Oignons\n- Olives",
                "Une pizza généreuse garnie de plusieurs ingrédients pour un maximum de saveurs.",
                "STEP 1: Étaler la pâte et ajouter la sauce tomate.\n" +
                        "STEP 2: Ajouter mozzarella, pepperoni, légumes.\n" +
                        "STEP 3: Cuire 12-15 min à 220°C."
        ));

        data.add(new Produit(
                "BBQ CHICKEN",
                64.0,
                R.mipmap.pizza2,
                "30 min",
                "- Pâte\n- Sauce barbecue\n- Blanc de poulet grillé\n- Oignons rouges\n- Mozzarella",
                "Pizza au poulet grillé nappée d'une délicieuse sauce barbecue.",
                "STEP 1: Étaler sauce BBQ.\n" +
                        "STEP 2: Ajouter poulet + oignons + fromage.\n" +
                        "STEP 3: Cuire 12 min à 220°C."
        ));

        data.add(new Produit(
                "VEGETARIAN FRESH",
                55.0,
                R.mipmap.pizza3,
                "28 min",
                "- Pâte\n- Sauce tomate\n- Courgettes\n- Champignons\n- Poivrons\n- Fromage",
                "Une pizza légère et savoureuse pour les amateurs de légumes.",
                "STEP 1: Ajouter sauce + fromage.\n" +
                        "STEP 2: Ajouter légumes frais.\n" +
                        "STEP 3: Cuire 12 min."
        ));

        data.add(new Produit(
                "SEAFOOD SPECIAL",
                75.0,
                R.mipmap.pizza4,
                "40 min",
                "- Pâte\n- Sauce blanche\n- Crevettes\n- Calamars\n- Fromage\n- Persil",
                "Une pizza raffinée aux fruits de mer et sauce crémeuse.",
                "STEP 1: Ajouter sauce blanche.\n" +
                        "STEP 2: Ajouter fruits de mer + fromage.\n" +
                        "STEP 3: Cuire 15 min."
        ));

        data.add(new Produit(
                "SPICY MEXICAN",
                68.0,
                R.mipmap.pizza5,
                "32 min",
                "- Pâte\n- Sauce tomate\n- Viande hachée épicée\n- Jalapeños\n- Fromage",
                "Pizza piquante inspirée des saveurs mexicaines.",
                "STEP 1: Cuire viande épicée.\n" +
                        "STEP 2: Garnir avec sauce + fromage + jalapeños.\n" +
                        "STEP 3: Cuire 12-15 min."
        ));

        data.add(new Produit(
                "FOUR CHEESE",
                60.0,
                R.mipmap.pizza6,
                "25 min",
                "- Pâte\n- Mozzarella\n- Gorgonzola\n- Parmesan\n- Fromage râpé",
                "Un mélange crémeux de quatre fromages fondants.",
                "STEP 1: Ajouter mélange de fromages.\n" +
                        "STEP 2: Cuire 10-12 min.\n" +
                        "STEP 3: Ajouter un peu d'origan."
        ));

        data.add(new Produit(
                "TURKEY & MUSHROOM",
                63.0,
                R.mipmap.pizza7,
                "30 min",
                "- Pâte\n- Sauce tomate\n- Dinde fumée\n- Champignons\n- Fromage",
                "Pizza gourmande à la dinde fumée et champignons frais.",
                "STEP 1: Étaler sauce + fromage.\n" +
                        "STEP 2: Ajouter dinde + champignons.\n" +
                        "STEP 3: Cuire 12 min."
        ));

        data.add(new Produit(
                "HAWAIIAN STYLE",
                58.0,
                R.mipmap.pizza8,
                "27 min",
                "- Pâte\n- Sauce tomate\n- Jambon\n- Ananas\n- Fromage",
                "Un mélange sucré-salé avec ananas et jambon.",
                "STEP 1: Ajouter sauce + fromage.\n" +
                        "STEP 2: Ajouter jambon + ananas.\n" +
                        "STEP 3: Cuire 12 min."
        ));

        data.add(new Produit(
                "ITALIAN CLASSIC",
                59.0,
                R.mipmap.pizza9,
                "30 min",
                "- Pâte fine\n- Sauce tomate\n- Mozzarella\n- Basilic frais",
                "Recette traditionnelle italienne simple et élégante.",
                "STEP 1: Ajouter sauce + mozzarella.\n" +
                        "STEP 2: Cuire 10-12 min.\n" +
                        "STEP 3: Ajouter basilic frais."
        ));

        data.add(new Produit(
                "BREAKFAST PIZZA",
                72.0,
                R.mipmap.pizza10,
                "35 min",
                "- Pâte\n- Sauce tomate\n- Bacon\n- Fromage\n- Œuf\n- Poivrons",
                "Pizza parfaite pour le brunch avec œuf au centre.",
                "STEP 1: Garnir avec sauce + fromage + bacon.\n" +
                        "STEP 2: Cuire 10 min.\n" +
                        "STEP 3: Ajouter l'œuf et cuire encore 5 min."
        ));
    }
    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}