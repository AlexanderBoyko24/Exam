Feature: Logout functionality
  As a registered user I want to be able to log out to protect my data

  Scenario: Logout from app
    Given the user is logged in
    When  the user logs out
    Then the app login page is open


Feature: Searching bar
  As a user I want to search products using search bar to find product faster

  Scenario: Searching products
    Given a main page is open
    When the user enters "Iphone" into the search bar
    Then products related to "Iphone" are shown on the results page


Feature: Favourite products
  As a user I want to add products to Favourites to find them quicker next time

  Scenario: Add products to Favourite
    Given user is on products result page
    When user click on product "Heart" icon
    Then product is added to Favourite


Feature: Add to cart
  As a user I want to add products to cart so that I can purchase them later

  Scenario: Adding a single product to the cart
    Given user is on products result page
    When user click on [Adauga]
    Then product is added to cart
