@Login
Feature: Home page con Login funcional

Background:
  Given the client goes to the main page

   @Login1
   Scenario Outline: Login sensible a mayusculas y minusculas
     When The client clicks on the my account botton
     And The client enters the case changed username <username>
     And The client enters the case changed password <password>
     And The client clicks on the login button
     Then A login error is displayed
     Examples:
       | username | password     |
       | FEDEADBE | LALOLANDA123 |

   @Login2
   Scenario Outline: Autentificación del Logout funcional
     When The client clicks on the my account botton
     And The client enters the valid username <username>
     And The client enters the valid password <password>
     And The client clicks on the login button
     And The client clicks on the Sign Out Button
     And The client goes back to My Account
     Then A general webpage must be visible without the user being signed in
     Examples:
       | username | password     |
       | fedeadbe | lalolanda123 |
