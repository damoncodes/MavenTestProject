Scenario: Get Default User in ServiceTwo
Given ServiceTwo Object created
When User calls getUsers in ServiceTwo
Then Verify that Default user is returned in ServiceTwo

Scenario: Add Customized User in ServiceTwo
Given ServiceTwo Object created
When <user> is added in ServiceTwo
Then Verify that <size> users is returned by getUsers in ServiceTwo
Examples:
|user|size|
|user1|2|
|user2|2|
Scenario: Get Default User after adding a user
Given ServiceTwo Object created
When <user> is added in ServiceTwo
And User calls getUsers in ServiceTwo
Then Verify that Default user is returned in ServiceTwo

Examples:
|user|
|user5|
|user6|

Scenario: Get First User
Given ServiceTwo Object created
When User calls getFirstUser in ServiceTwo
Then Verify that Default user is returned as String in ServiceTwo

Scenario: Get Default User after adding a user
Given ServiceOne Object created
When <user> is added
And User calls getUsers
Then Verify that Default user is returned

Examples:
|user|
|user5|
|user6|