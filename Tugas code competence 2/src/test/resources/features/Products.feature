Feature: Products service Fake Store API

  @FakeStoreAPI @ProductsFakeStore @GetAllProducts
  Scenario: User get all products
    Given User call an api "/products" with method "GET"
    Then User verify response is match with json schema "allproducts.json"

  @FakeStoreAPI @ProductsFakeStore @GetSingleProduct
  Scenario: User get single products
    Given User call an api "/products/1" with method "GET"
    Then User verify response is match with json schema "singleproduct.json"

  @FakeStoreAPI @ProductsFakeStore @GetAllProductsWithLimit
  Scenario: User get all products with limit
    Given User call an api "/products?limit=5" with method "GET"
    Then User verify response is match with json schema "allproducts.json"

  @FakeStoreAPI @ProductsFakeStore @AddNewProduct
  Scenario: User add new product
    Given User call an api "/products" with method "POST" with payload below
      | title            | price  | description | image                 | category |
      | Jam tangan casio | 200000 | jam tangan  | https://i.pravatar.cc | fashion  |
    Then User verify status code is 200
    Then User verify response is match with json schema "newproduct.json"

  @FakeStoreAPI @ProductsFakeStore @EditProduct
  Scenario: User edit product with given id
    Given User call an api "/products/7" with method "PUT" with payload below
      | title | price   | description | image                 | category  |
      | Kasur | 2000000 | bed         | https://i.pravatar.cc | household |
    Then User verify status code is 200
    Then User verify response is match with json schema "newproduct.json"

  @FakeStoreAPI @ProductsFakeStore @DeleteProduct
  Scenario: User delete product
    Given User call an api "/products/10" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteproduct.json"
