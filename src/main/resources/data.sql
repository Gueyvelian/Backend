-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste, superieur)
VALUES ('Bastide', 'Rémi', 'prof', 2),
       ('Lamine', 'Elyes', 'directeur'),
       ('Pécatte', 'Jean-Marie ', 'prof', 2);



INSERT INTO PROJET(nom, debut)
VALUES ('math', '2004-02-01'),
       ('physique', '2006-05-24'),
       ('algebre', '2025-03-02');

INSERT INTO PARTICIPATION(role, pourcentage, personne, projet)
VALUES ('prof', 50, 1, 2),
       ('prof', 60, 3, 1),
       ('comercile', 70, 2, 3);