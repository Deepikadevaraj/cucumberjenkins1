
Feature: Moving to payment without adding to cart

Scenario: The one where the user moves to cart without adding any item in it
Given Alex has registered into TestMe app
When Alex search a particular product like headphone
And try to proceed to payment without adding any item to cart
Then TestMeApp doesn't display the cart icon