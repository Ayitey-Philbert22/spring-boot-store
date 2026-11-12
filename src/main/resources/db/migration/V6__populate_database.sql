INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Dairy'),
       ('Beverages'),
       ('Bakery'),
       ('Meat'),
       ('Seafood'),
       ('Snacks'),
       ('Grains'),
       ('Household');

INSERT INTO products (name, price, description, category_id)
VALUES ('Fresh Bananas', 18.50,
        'A bunch of fresh, ripe bananas, rich in potassium and ideal for healthy snacking.',
        1),

       ('Fresh Tomatoes', 25.00,
        'Fresh red tomatoes suitable for salads, sauces, stews and everyday cooking.',
        2),

       ('Peak Evaporated Milk 160ml', 8.50,
        'Creamy evaporated milk suitable for tea, coffee, baking and other recipes.',
        3),

       ('Coca-Cola 500ml', 12.00,
        'Refreshing carbonated soft drink, perfect for enjoying chilled.',
        4),

       ('Butter Bread', 20.00,
        'Freshly baked soft butter bread, perfect for breakfast and sandwiches.',
        5),

       ('Chicken Breast 1kg', 75.00,
        'Fresh boneless chicken breast, suitable for grilling, frying and healthy meals.',
        6),

       ('Frozen Tilapia 1kg', 65.00,
        'Quality frozen tilapia fish, ideal for grilling, frying and traditional dishes.',
        7),

       ('Pringles Original 165g', 45.00,
        'Crispy original-flavoured potato crisps packaged in a convenient cylindrical container.',
        8),

       ('Royal Aroma Jasmine Rice 5kg', 110.00,
        'Premium quality jasmine rice with a pleasant aroma and soft texture when cooked.',
        9),

       ('Morning Fresh Dishwashing Liquid 500ml', 28.00,
        'Dishwashing liquid designed to remove grease and food residue from plates and kitchen utensils.',
        10);

