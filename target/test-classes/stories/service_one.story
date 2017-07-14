
Scenario: Get Default User
Given ServiceOne Object created
When User calls getUsers
Then Verify that Default user is returned


Scenario: Add Customized User
Given ServiceOne Object created
When <user> is added
Then Verify that <user> is returned by getUsers

Examples:
|user|
|user1|
|user2|

Scenario: Get First User
Given ServiceOne Object created
When User calls getFirstUser
Then Verify that Default user is returned as String

