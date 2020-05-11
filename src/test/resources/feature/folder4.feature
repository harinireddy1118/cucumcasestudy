Feature: The one where the user moves to cart without adding any item in it.

Scenario: purchase the item which is added to cart

Given user acceses the login page
When user searches for the product 
When user adds to cart
When user checkout
When user proceeds to payment
When user enters netbanking details
Then user checks for order confirmation