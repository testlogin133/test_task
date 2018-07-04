Feature: ya.ru mail
  ####################################################################################################################
  Scenario: search letter
    Given an open a main page
    And logged with login: "testlogin133" and pass: "testpass133"
    And an open inbox page
    When entered "Hello, world!" in search field
    And opened the found message
    Then subject of the message should be: "test_message"
    Then sender of the message should be: "ebenny f"
    Then content of the message should be: "Hello, world!"