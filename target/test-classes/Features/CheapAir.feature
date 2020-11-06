Feature: CheapAirLine functionality

  @Cheap
  Scenario Outline: 
    Given User is in CheapAir Landing Page
    When User enter the travel details "<dest>"
    Then User is in Search Page
    Then User enter the payment credit card details "<firstname>","<lastname>","<gender>","<dateMonth>","<date>","<dateyear>","<creditcard>","<cardExpiryMonth>","<cardExpiryYear>","<cvv>","<holderName>","<country>","<address>","<city>","<state>","<zip>","<phone>","<email>","<pwd>","<confirmpwd>"
    Then User take screenshot of booking
    Then User close the browser

    Examples: 
      | dest             | firstname | lastname  | gender | dateMonth | date | dateyear | creditcard       | cardExpiryMonth | cardExpiryYear | cvv | holderName     | country | address | city    | state     | zip    | phone      | email           | pwd   | confirmpwd |
      | Bengaluru, India | Ramya     | sabapathi | Female |        04 |   20 |     1996 | 4485389429159240 | 04 - April      |           2021 | 123 | Jamil Prohaska | India   | Navalur | Chennai | TamilNadu | 600130 | 1234567891 | dummy@gmail.com | mugil | mugil      |
