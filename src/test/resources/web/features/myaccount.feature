@Myaccount
Feature: My account funcional

Background:
  Given the client goes to the main page

   @Myaccount1
   Scenario Outline: Usuario ingresa a sus direcciones con su cuenta
     When The client clicks on the my account botton
     And The client enters the valid username <username>
     And The client enters the valid password <password>
     And The client clicks on the login button
     And The client clicks on the my account botton
     And The client clicks on the Account details
     Then The client must view their account details
     Examples:
       | username | password     |
       | fedeadbe | lalolanda123 |

   @Myaccount2
   Scenario Outline: Logout funcional
     When The client clicks on the my account botton
     And The client enters the valid username <username>
     And The client enters the valid password <password>
     And The client clicks on the login button
     And The client clicks on the my account botton
     And The client clicks on the logout Button
     Then The client succesfully logs out from the page
     Examples:
       | username | password     |
       | fedeadbe | lalolanda123 |