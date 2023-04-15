Feature: Pilih Produk on Sepulsa Website

  Scenario Outline: Select a Product
    Given the user is on Sepulsa website
    When the user selects a <product>
    Then the user should see the product detail page

    Examples:
      | product          |
      | Pulsa Telkomsel  |
      | Token PLN        |

  Scenario Outline: Product Not Found
    Given the user is on Sepulsa website
    When the user searches for a <product> that does not exist
    Then the user should see an error message

    Examples:
      | product         |
      | Non-existent    |


