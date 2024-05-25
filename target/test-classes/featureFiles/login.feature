Feature: Add to cart

Rule: Add Product from Store


@scenario1
Scenario Outline: Add one quantity to the cart

Given I am on the store page
When I add a "<product_name>" to the cart
Then I see 1 "<product_name>" in the cart

Examples:

| product_name |

| Blue_Shoes |
#| Nike_Shoes |


