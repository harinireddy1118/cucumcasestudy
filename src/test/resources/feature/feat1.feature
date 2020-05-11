Feature: TestMeApp registration

Scenario Outline: Registration
Given user access the registration page
When user enters"<username>","<firstname>","<lastname>","<password>","<confirmpassword>","<gender>","<email>","<mobileno>","<dateofbirth>","<address>","<Securityquestion>","<answer>"
Then user navigates to login page

Examples: 
|username   |firstname|lastname|password      |confirmpassword|gender  |email                  |mobileno  |dateofbirth|address  |securityquestion          |answer|
|harireddy  |Harini   |Reddy   |harini123     |harini123      |female  |harini123@gmail.com    |0123456789|06/01/1997 |hyd      |What Is Your Nick name?   |hari |