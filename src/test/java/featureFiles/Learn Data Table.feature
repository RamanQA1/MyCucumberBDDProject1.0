
Feature: Data Tables

#Scenario: Single Row with No Header

#Given My Credential
#| John | John123 |
#| Bill | Bill123 |


#Scenario: Single Row with Header
#
#Given My Credential
#| Username | Password |
#| John | John123 |
#| Bill | Bill123 |


Scenario: Single Column with Header

Given My Credential
| Username |John | Bill |
| Password |  John123 |  Bill123 |

