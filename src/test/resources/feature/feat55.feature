Feature: User moves to cart without adding any item 

Scenario: The one where the user moves to cart without adding any item in it

Given user should be login
Given user enters valid credentials
Given search for product
Given try to proceed to payment without adding any item in the cart
Given testme app does not display the cart icon