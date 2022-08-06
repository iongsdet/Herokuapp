Feature: Add Element Functionality

  @smoke
  Scenario Outline: Validation of entered elements
    Given the user navigates to The Internet (the-internet.herokuapp.com)
    When user adds "<nr>" elements
    Then asserts that "<nr>" elements exist on the page
    Examples:
      | nr |
      | 4  |
      | 7  |
      | 2  |

