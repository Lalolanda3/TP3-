@Registration
Feature: Registro funcional

Background:
  Given the client goes to the main page

   @Registration1
   Scenario Outline: Registro con mail y contraseña vacios
     When The client clicks on the my account botton
     And The client enters the valid email <email>
     And The client enters the empty password <password>
     Then The registration button is disabled
     Examples:
       | email              | password |
       | fedeadbe@gmail.com |          |

   @Registration2
   Scenario Outline: Registro con mail y contraseña vacíos
     When The client clicks on the my account botton
     And The client enters the empty email <email>
     And The client enters the empty password <password>
     Then The registration button is disabled
     Examples:
       | email | password |
       |       |          |