# Autor: Marco Polo
  @stories
  Feature: Academy Choucair
    As as user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than brando wants to learn automation at the academy Choucair
        |strUser   |  strPassword   |
        |<strUser> |  <strPassword> |
      When the search for the course on the Choucair academy platform
        |  strCourse   |
        |  <strCourse> |
      Then she finds the course called
        | strCourse               |
        | <strCourse> |
      Examples:
        | StrUser | strPassword   | strCourse              |
        | Brandon | Choucair2021* | Multimedia Bancolombia |