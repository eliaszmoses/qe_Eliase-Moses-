Feature: Cart service Fake Store API

  @FakeStoreAPI @CartsFakeStore @GetAllCarts
  Scenario: User Get All carts
    Given User call an api "/carts" with method "GET"
    Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartsFakeStore @GetSingleCart
  Scenario: User get single carts
    Given User call an api "/carts/1" with method "GET"
    Then User verify response is match with json schema "singlecarts.json"

  @FakeStoreAPI @CartsFakeStore @GetAllCartsWithLimit
  Scenario: User get all carts with limit
    Given User call an api "/carts?limit=5" with method "GET"
    Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartsFakeStore @AddNewCarts
  Scenario: User add new product
    Given User call an api "/carts" with method "POST" with payload below
      | userId | date  | products |
      | 5 | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}]  |
    Then User verify status code is 200
    Then User verify response is match with json schema "newcarts.json"

  @FakeStoreAPI @CartsFakeStore @EditCarts
  Scenario: User edit product with given id
    Given User call an api "/carts/7" with method "PUT" with payload below
      | userId | date  | products |
      | 3 | 2019-12-10 | [{productId:1,quantity:3}]  |
    Then User verify status code is 200
    Then User verify response is match with json schema "newcarts.json"

  @FakeStoreAPI @CartsFakeStore @DeleteCarts
  Scenario: User delete cart
    Given User call an api "/carts/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deletecarts.json"