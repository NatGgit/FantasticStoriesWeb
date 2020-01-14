INSERT INTO author (first_name, last_name)
VALUES ('Łukasz ', 'Malinowski'),
       ('Krzysztof ', 'Rewiuk'),
       ('Beatrycze ', 'Nowicka'),
       ('Max ', 'Gladstone'),
       ('Michael ', 'Swanwick'),
       ('Vina Jie-Min ', 'Prasad'),
       ('Przemysław ', 'Karbowski'),
       ('Wojciech ', 'Zembaty'),
       ('Andriej ', 'Kokoulin'),
       ('Mark ', 'Lawrence'),
       ('Maciej ', 'Jesionowski');

INSERT INTO issue (number, publication_year)
VALUES ('05/2019', 2019),
       ('04/2019', 2019);

INSERT INTO story (title, original_title, author_id, issue_id)
VALUES ('Garncarska igraszka', NULL, 1, 1),
       ('Kot Baskerville''a', NULL, 2, 1),
       ('Nożem i widelcem', NULL, 3, 1),
       ('Modelka Crispina', '(Crispin''s Model)', 4, 1),
       ('Konik z Dalarny', '(The Dala Horse)', 5, 1),
       ('Zamówienie na steki', '(A Series of Steakes)', 6, 1),
       ('Pies Patriarchy', NULL, 7, 2),
       ('Pewnego razu w D.', NULL, 8, 2),
       ('Tomydzieci', '(Ктомыдети)', 9, 2),
       ('W słusznej sprawie', '(Bulletproof)', 10, 2),
       ('Groza nad Mutindale (scenariusz RPG)', NULL, 11, 2);

INSERT INTO review(rating, title, text, story_id)
VALUES (3, 'opowiadanie o niczym',
        'bardzo smutne opowiadanie, które zupełnie mi się nie podobało niby sprawnie napisane, ' ||
        'ale bez sensu. Główna bohaterka pragnie czegośtam ale wszystko żle się dla niej kończy itd', 1);