# Autor: Marco Polo
  @stories
  Feature: Academy Choucair
    As a user, I want to lear hoe to autometa in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for aa automation course
    Given than brando wants to learn automation at the academy Choucair
      | strUser | strPassword |
      | <strUser>  | <strPassword>  |
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      | atrCourse |
      | <strCourse  |
    Then  he finds the course called resources Recursos Automatizacion Bancolombia
      | atrCourse |
      | <strCourse  |
