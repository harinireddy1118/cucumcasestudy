Feature: Add_to_cart

Scenario: product to be added to cart

Given user should be in login page
When user enters valid credentials And performs login
And clicks the product
And selects product from the dropdown
Then clicks on add to cart
