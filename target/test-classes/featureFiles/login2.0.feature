
@featuretag
Feature: Add to cart

Rule: Rule 1



Scenario Outline:Scenario 1

Given I am on the store page
When I add a "<product_name>" to the cart
Then I see 1 "<product_name>" in the cart

Examples:

| product_name |

| Blue_Shoes |


Scenario Outline: Scenario 2

Given I am on the store page
When I add a "<product_name>" to the cart
Then I see 1 "<product_name>" in the cart

Examples:

| product_name |

| Blue_Shoes |


Rule: Rule 2



Scenario Outline: Scenario 3

Given I am on the store page
When I add a "<product_name>" to the cart
Then I see 1 "<product_name>" in the cart

Examples:

| product_name |

| Blue_Shoes |