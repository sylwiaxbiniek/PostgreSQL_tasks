CREATE TABLE autor (
    id serial primary key,
    imie varchar not null,
    nazwisko varchar not null
);

CREATE TABLE ksiazka (
    id SERIAL primary key,
    tytul varchar not null,
    liczba_autorow integer references,
    autor1id integer references autor(id),
    autor2id integer references autor(id)
);

INSERT INTO autor (id,imie,nazwisko) VALUES (1,'Andrzej','Sapkowski');
INSERT INTO autor (id,imie,nazwisko) VALUES (2,'Stephen','King');
INSERT INTO autor (id,imie,nazwisko) VALUES (3,'Joanne','Murray');
INSERT INTO autor (id,imie,nazwisko) VALUES (4,'James','Patterson');
INSERT INTO autor (id,imie,nazwisko) VALUES (5,'George','Martin');
INSERT INTO autor (id,imie,nazwisko) VALUES (6,'William','Schakespeare');
INSERT INTO autor (id,imie,nazwisko) VALUES (7,'Boleslaw','Prus');
INSERT INTO autor (id,imie,nazwisko) VALUES (8,'Charles','Dickens');
INSERT INTO autor (id,imie,nazwisko) VALUES (9,'Adam','Mickiewicz');
INSERT INTO autor (id,imie,nazwisko) VALUES (10,'Joseph','Conrad');
INSERT INTO autor (id,imie,nazwisko) VALUES (11,'Graham','Read');
INSERT INTO autor (id,imie,nazwisko) VALUES (12,'John','Tolkien');
INSERT INTO autor (id,imie,nazwisko) VALUES (13,'Peter','Straub');
INSERT INTO autor (id,imie,nazwisko) VALUES (14,'Lisa','Tuttle');
INSERT INTO autor (id,imie,nazwisko) VALUES (15,'Paulo','Coelho');
INSERT INTO autor (id,imie,nazwisko) VALUES (16,'Nicholas','Sparks');
INSERT INTO autor (id,imie,nazwisko) VALUES (17,'Ford','Hueffer');
INSERT INTO autor (id,imie,nazwisko) VALUES (18,'Andrew','Gross');
INSERT INTO autor (id,imie,nazwisko) VALUES (19,'Agatha','Christie');
INSERT INTO autor (id,imie,nazwisko) VALUES (20,'Harold','Robbins');

INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (1,'Harry Ptter i Zakon Feniksa',1,3,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (2,'Druga Szansa',2,18,4);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (3,'Lsnienie',1,NULL,2);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (4,'Czarny Dom',2,2,13);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (5,'To',1,2,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (6,'Gra o tron',1,5, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (7,'Lalka',1,7, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (8,'Pielgrzym',1,15, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (9,'Harry Potter i Czara Ognia',1,NULL,3);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (10,'Pamietnik',1, NULL,16);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (11,'Pan Tadeusz',1,NULL,9);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (12,'Starcie krolow',1,5,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (13,'Nawalnica mieczy',1,5,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (14,'Opowiesc wigilijna',1,8,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (15,'Trzy oblicza zemsty',2,18,4);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (16,'Tajemniczy przeciwnik',1,19,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (17,'Harry Potter i Komnata Tajemnic',1,3,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (18,'Wiedzmin',1,NULL,1);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (19,'Dwie Wieze',1,NULL,12);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (20,'Sedzia i Kat',2,4,18);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (21,'Powrot Krola',1,NULL,12);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (22,'Sherlock Holmes',0, NULL, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (23,'Hamlet',1,6,NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (24,'Lord Jim',2,10,11);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (25,'Spadkobiercy',2,10,17);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (26,'Ksiega Welesa',0, NULL, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (27,'Przygoda',2,17,10);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (28,'Alicja w Krainie Czarow',0, NULL, NULL);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (29,'Przystan Wiatrow',2,14,5);
INSERT INTO ksiazka (id,tytul,liczba_autorow,autor1id,autor2id) VALUES (30,'Talizman',2,13,2);
