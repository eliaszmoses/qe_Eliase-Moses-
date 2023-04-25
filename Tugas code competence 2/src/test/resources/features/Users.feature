Feature: Users of Fake Store API

  @FakeStoreAPI @UsersFakeStore @GetAllUsers
  Scenario: User Get All users
    Given User call an api "/users" with method "GET"
    Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UsersFakeStore @GetSingleUsers
  Scenario: User get single carts
    Given User call an api "/users/1" with method "GET"
    Then User verify response is match with json schema "singleusers.json"

  @FakeStoreAPI @UsersFakeStore @GetAllUsersWithLimit
  Scenario: User get all user with limit
    Given User call an api "/users?limit=5" with method "GET"
    Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UsersFakeStore @AddNewUsers
  Scenario: User add new product
    Given User call an api "/users" with method "POST" with payload below
      | email | username  | password | name | address | phone |
      | John@gmail.com | johnd | m38rmF$  | [{firstname: John, lastname: Doe}]| [{city: kilcoole, street: 7835 new road, number: 3, zipcode: 12926-3874, geolocation: {lat:-37.3159, long:81.1496 }] | 1-570-236-7033 |
    Then User verify status code is 200
    Then User verify response is match with json schema "newusers.json"

  @FakeStoreAPI @UsersFakeStore @EditUsers
  Scenario: User edit users with given id
    Given User call an api "/users/7" with method "PUT" with payload below
      | email | username  | password | name | address | phone |
      | John@gmail.com | johnd | m38rmF$  | [{firstname: John, lastname: Doe }] | [{city: kilcoole, street: 7835 new road, number: 3, zipcode: 12926-3874, geolocation: {lat:-37.3159, long:81.1496 }] | 1-570-236-7033 |
    Then User verify status code is 200
    Then User verify response is match with json schema "newusers.json"

  @FakeStoreAPI @UsersFakeStore @DeleteUsers
  Scenario: User delete cart
    Given User call an api "/users/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteusers.json"