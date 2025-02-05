-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste)
VALUES ('Bastide', 'Rémi', 'prof'),
       ('Lamine', 'Elyes', 'directeur'),
       ('Pécatte', 'Jean-Marie ', 'prof');



INSERT INTO PROJET(nom, debut)
VALUES ('math', '2004-02-01'),
       ('physique', '2006-05-24'),
       ('algebre', '2025-03-02');

INSERT INTO PARTICIPATION(role, pourcentage)
VALUES ('prof', 50),
       ('prof', 60),
       ('comercile', 70);