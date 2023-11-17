@Shop
Feature: Shop funcional

  Background:
    Given the client goes to the main page

  @Shop1
  Scenario Outline: Página de confirmación de orden
    When The client clicks on the shop menu
    And The client clicks on the Add to Basket button of the shop
    And The client clicks on the Item menu
    And The client clicks on the Proceed to Check Out button
    And The client fills the first name field <firstname>
    And The client fills the last name field <lastname>
    And The client fills the phone field <phone>
    And The client fills the address field <address>
    And The client fills the town field <town>
    And The client fills the mail field <email>
    And The client fills the zip field <zip>
    And The client chooses a payment method
    And The client clicks on the Place Order button
    Then The client is sent to the Order Confirmation page
    Examples:
      | firstname | lastname | phone  | address         | town        | email              | zip  |
      | Pepe      | honguito | 111111 | Calle falsa 123 | aquiniestan | fedeadbe@gmail.com | 0000 |

  @Shop2
  Scenario Outline: Tasa de impuestos
    When The client clicks on the my account botton
    And The client enters the valid username <username>
    And The client enters the valid password <password>
    And The client clicks on the login button
    And The client clicks on the my account botton
    And The client clicks on the Address link
    And The client clicks on the edit button
    And The client goes to country and types <country>
    And The client clicks on Save Address button
    And The client clicks on the shop menu
    And The client clicks on the Add to Basket button of the shop
    And The client clicks on the Item menu basket
    Then The client can see that the tax rate for indian should be <percentage>
    Examples:
      | country   | percentage | username | password     |
      | India     | 2          | fedeadbe | lalolanda123 |
      | Argentina | 5          | fedeadbe | lalolanda123 |

