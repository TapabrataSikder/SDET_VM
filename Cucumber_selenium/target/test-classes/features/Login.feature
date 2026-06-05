Feature: login functionality

Scenario Outline: Validate registration page
    Given registration page is open
    When enter <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phone>, <ssn>, <username>, and <password>
    And click on register button
    Then user registration should be <status>

    Examples:
      | firstName | lastName | address | city | state | zipCode | phone | ssn | username | password | status |
      | John      | Doe      | 123 Main| Delhi| DL    | 110001  | 12345 | 999 | testUser | pass123  | Success|

Scenario Outline: validate login page
	Given login page open
	When enter <username> and <password> and click on submit button and check <status>
	Then successfully done
	Examples:
	|username|password|status|
	| taps | admin123  | Success |
    | askjk    | lkj@ljrd | Fail    |


