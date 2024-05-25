Feature: Add to Cart

Scenario: Add one quantity from Store

Given I am on the Store page
When I add "Blue Shoes" to the cart
Then I should see 1 "Blue Shoes" in the cart
