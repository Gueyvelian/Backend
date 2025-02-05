-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste, superieur_matricule)
VALUES ('Lamine', 'Elyes', 'directeur', null),
       ('Bastide', 'Rémi', 'prof', 2),
       ('Pécatte', 'Jean-Marie ', 'prof', 2);



INSERT INTO PROJET(nom, debut)
VALUES ('math', '2004-02-01'),
       ('physique', '2006-05-24'),
       ('algebre', '2025-03-02');

INSERT INTO PARTICIPATION(role, pourcentage, personne_matricule, projet_code)
VALUES ('prof', 50.0, 1, 2),
       ('prof', 60.0, 3, 1),
       ('commercial', 70.0, 2, 3);