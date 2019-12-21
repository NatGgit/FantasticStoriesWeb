INSERT INTO "author" (id, first_name, second_name, story_list) VALUES
(DEFAULT, 'Łukasz','Malinowski', NULL),
(DEFAULT,'Krzysztof','Rewiuk', NULL ),
(DEFAULT,'Beatrycze','Nowicka', NULL ),
(DEFAULT,'Max','Gladstone', NULL ),
(DEFAULT,'Michael','Swanwick', NULL ),
(DEFAULT,'Vina Jie-Min','Prasad', NULL ),
(DEFAULT,'Przemysław','Karbowski', NULL ),
(DEFAULT,'Wojciech','Zembaty', NULL ),
(DEFAULT,'Andriej','Kokoulin', NULL ),
(DEFAULT,'Mark','Lawrence', NULL ),
(DEFAULT,'Maciej','Jesionowski', NULL);

INSERT INTO "issue" (id, issue_number, publication_year, story_list) VALUES
(DEFAULT,'05/2019', 2019, NULL),
(DEFAULT,'04/2019', 2019, NULL);

INSERT INTO "story" (id, title, original_title, author_id, issue_id, review_id) VALUES
(DEFAULT,'Garncarska igraszka', NULL, 1, 1, NULL),
(DEFAULT,'Kot Baskerville''a', NULL, 2, 1, NULL),
(DEFAULT,'Nożem i widelcem', NULL, 3, 1, NULL),
(DEFAULT,'Modelka Crispina', '(Crispin''s Model)', 4, 1, NULL),
(DEFAULT,'Konik z Dalarny', '(The Dala Horse)', 5, 1, NULL),
(DEFAULT,'Zamówienie na steki', '(A Series of Steakes)', 6, 1, NULL),
(DEFAULT,'Pies Patriarchy', NULL, 7, 2, NULL),
(DEFAULT,'Pewnego razu w D.', NULL, 8, 2, NULL),
(DEFAULT,'Tomydzieci','(Ктомыдети)', 9, 2, NULL),
(DEFAULT,'W słusznej sprawie','(Bulletproof)', 10, 2, NULL),
(DEFAULT,'Groza nad Mutindale (scenariusz RPG)', NULL, 11, 2, NULL);