Feature: Saisie de la gare de départ sur Ouigo

  Scenario: Saisir une gare de départ valide
    Given l'utilisateur est sur la page d'accueil de Ouigo
    When il saisit "Paris Gare de Lyon" dans le champ Gare de départ
    Then la suggestion "Paris Gare de Lyon" doit apparaître
