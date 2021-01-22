# Autor: XXXXXXXXX
@stories
Feature:  AcademyChoucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser     |strPassword  |
      | 1037616175  |Choucair2021*|
    When he search for the course on the choucair academy platform
      |strCourse                            |
      |Prueba Técnica - Analista Bancolombia|
    Then he finds the course called resources
      |strCourse                            |
      |Prueba Técnica - Analista Bancolombia|

