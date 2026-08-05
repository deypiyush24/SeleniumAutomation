@GoogleSearchFeatures
  Feature: Search the Values in Google

#    Scenario Outline: Search the
#      Given User nagivate to Google
#      When User enter the details
#      Then Validate all the information
#      Examples:
#        |  |

    @Piyush
    Scenario: Searching for 'apple'
      Given "Sergey" is researching things on the internet
      When he looks up "apple"
      Then he should see information about "apple"