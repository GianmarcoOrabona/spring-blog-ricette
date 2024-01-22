-- Insert Recipes
INSERT INTO recepies (portion, ingredient_list, preparation_time, title, img, recipe_procedure) VALUES (4, 'Spaghetti 400g, Guanciale 150g, Uova 3, Pecorino Romano grattugiato 100g, Pepe nero q.b.', '00:20 minuti', 'Pasta alla Carbonara', 'https://www.giallozafferano.it/images/244-24489/Spaghetti-alla-Carbonara_450x300_sp.jpg', 'Cuoci gli spaghetti in acqua salata. Rosola il guanciale in una padella. Sbatti le uova e mescola con il Pecorino Romano. Unisci gli ingredienti e condisci con pepe nero a piacere. Mescola tutto e servi caldo.');
INSERT INTO recepies (portion, ingredient_list, preparation_time, title, img, recipe_procedure) VALUES (6, 'Uova 3, Farina 00 250g, Latte intero 500g, Burro 40g', '00:25 minuti', 'Crepe', 'https://www.giallozafferano.it/images/241-24147/Crepes-dolci-e-salate-ricetta-base_450x300.jpg', 'Mescola uova, farina e latte. Aggiungi il burro fuso. Cuoci in una padella e servi con il ripieno desiderato.');
INSERT INTO recepies (portion, ingredient_list, preparation_time, title, img, recipe_procedure) VALUES (2, 'Pomodori 4, Mozzarella di bufala 200g, Basilico fresco, Olio extravergine d''oliva, Sale q.b.', '00:10 minuti', 'Insalata Caprese', 'https://blog.giallozafferano.it/lebistro/wp-content/uploads/2018/05/insalata-caprese.jpg', 'Taglia pomodori e mozzarella. Alterna strati. Condisci con olio, sale e basilico.');
INSERT INTO recepies (portion, ingredient_list, preparation_time, title, img, recipe_procedure) VALUES (4, 'Riso Carnaroli 300g, Funghi porcini secchi 30g, Cipolla 1, Vino bianco secco 150ml, Brodo vegetale 1l', '00:40 minuti', 'Risotto ai Funghi', 'https://www.giallozafferano.it/images/170-17085/Risotto-ai-funghi_450x300.jpg', 'Soffriggi cipolla. Aggiungi riso e tosta. Sfuma con vino. Aggiungi funghi e brodo, cuoci finché il riso è al dente.');
INSERT INTO recepies (portion, ingredient_list, preparation_time, title, img, recipe_procedure) VALUES (2, 'Petto di pollo 4 fette, Limoni 2, Farina 50g, Burro 30g, Prezzemolo fresco, Sale e pepe q.b.', '00:30 minuti', 'Pollo al Limone', 'https://www.giallozafferano.it/images/235-23580/Pollo-al-limone_450x300.jpg', 'Impana pollo con farina. Rosola in padella con burro. Aggiungi succo di limone. Cucina fino a cottura completa.');


-- Insert Categories
INSERT INTO categories (name) VALUES ('Antipasto');
INSERT INTO categories (name) VALUES ('Primo');
INSERT INTO categories (name) VALUES ('Secondo');
INSERT INTO categories (name) VALUES ('Dessert');

-- Insert Recipes_category
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (2, 1);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (4, 2);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (2, 2);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (1, 3);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (2, 3);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (3, 3);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (2, 4);
INSERT INTO recepies_categories (categories_id, recipes_id) VALUES (3, 5);