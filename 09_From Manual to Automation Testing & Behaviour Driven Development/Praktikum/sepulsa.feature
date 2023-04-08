@Sepulsa
Feature: Sepulsa

  @NormalPositive @BeliPulsa5rbDiSepulsa
  Scenario: User can choose pulsa indosat 5 ribu
    Given Elang is on sepulsa home page
    And Elang click beli pulsa
    And Elang input nomor handphone "085732607215"
    And Elang choose pulsa 5 ribu

  @NormalPositive @BeliPulsa10rbDiSepulsa
  Scenario: User can choose pulsa indosat 10 ribu
    Given Elang is on sepulsa home page
    And Elang click beli pulsa
    And Elang input nomor handphone "085732607215"
    And Elang choose pulsa 10 ribu

  @NormalPositive @BeliPulsa12rbDiSepulsa
  Scenario: User can choose pulsa indosat 12 ribu
    Given Elang is on sepulsa home page
    And Elang click beli pulsa
    And Elang input nomor handphone "085732607215"
    And Elang choose pulsa 12 ribu
    Then Elang see "Total Payment" checkout page
