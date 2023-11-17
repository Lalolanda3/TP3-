@Home
Feature: Información de pago tras una compra

Background:
  Given the client goes to the main page

   @Home1 @Test
   Scenario: Posibilidad de añadir cupón y ver facturación, pedidos y otros detalles
     When The client clicks on an arrival
     And The client clicks on the Add to Basket button
     And The client clicks on the Item menu
     And The client clicks on the Proceed to Check Out button
     Then The client can add a coupon and see their order

   @Home2 @Test
   Scenario Outline: Confirmación del pedido con los datos
     When The client clicks on an arrival
     And The client clicks on the Add to Basket button
     And The client clicks on the Item menu
     And The client clicks on the Proceed to Check Out button
     And The client fills the first name field <firstname>
     And The client fills the last name field <lastname>
     And The client fills the phone field <phone>
     And The client fills the address field <address>
     And The client fills the town field <town>
     And The client fills the mail field <email>
     And The client fills the zip field <zip>
     And The client clicks on the Place Order button
     Then The client is sent to the Order Confirmation page
     Examples:
       | firstname | lastname | phone  | address         | town        | email               | zip  |
       | Pepe      | honguito | 111111 | Calle falsa 123 | aquiniestan | fede_adbe@gmail.com | 0000 |