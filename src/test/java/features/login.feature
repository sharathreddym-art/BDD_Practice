Feature:  Application Login

  Scenario: Home page default login
    Given User is on banking landing page
    When User login into application with username "Jin" and password "1234"
    Then Home page is populated
    And Cards displayed is "True"

  Scenario: Home page default login
    Given User is on banking landing page
    When User login into application with username "John" and password "4321"
    Then Home page is populated
    And Cards displayed is "False"

  Scenario: Home page default login
    Given User is on banking landing page
    When User signup with following details
    | jenny | abcd | john@abcd | Australia | 12345698 |
    Then Home page is populated
    And Cards displayed is "False"