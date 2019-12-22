INSERT INTO author (id, first_name, second_name) VALUES
(1, 'Łukasz','Malinowski'),
(2, 'Krzysztof','Rewiuk'),
(3, 'Beatrycze','Nowicka'),
(4, 'Max','Gladstone'),
(5, 'Michael','Swanwick'),
(6, 'Vina Jie-Min','Prasad'),
(7, 'Przemysław','Karbowski'),
(8, 'Wojciech','Zembaty'),
(9, 'Andriej','Kokoulin'),
(10, 'Mark','Lawrence'),
(11, 'Maciej','Jesionowski');

INSERT INTO issue (id, issue_number, publication_year) VALUES
(1, '05/2019', 2019),
(2, '04/2019', 2019);

INSERT INTO story (id, title, original_title, author_id, issue_id) VALUES
(1, 'Garncarska igraszka', NULL, 1, 1),
(2, 'Kot Baskerville''a', NULL, 2, 1),
(3, 'Nożem i widelcem', NULL, 3, 1),
(4, 'Modelka Crispina', '(Crispin''s Model)', 4, 1),
(5, 'Konik z Dalarny', '(The Dala Horse)', 5, 1),
(6, 'Zamówienie na steki', '(A Series of Steakes)', 6, 1),
(7, 'Pies Patriarchy', NULL, 7, 2),
(8, 'Pewnego razu w D.', NULL, 8, 2),
(9, 'Tomydzieci','(Ктомыдети)', 9, 2),
(10, 'W słusznej sprawie','(Bulletproof)', 10, 2),
(11, 'Groza nad Mutindale (scenariusz RPG)', NULL, 11, 2);