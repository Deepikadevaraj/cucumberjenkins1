Feature: Register functionality
Description: Registered user login to the application by entering valid credentials
Scenario: register with valid data
 When user opens chrome browser and opens application
When user clicks on signup button

When user enters the user name as "deepik" in user name field
Then firstname as"deepika" and last name as "deva" in user name field
Then password as "123456"
And confirm password as "123456"
Then selects gender as male
Then  types the email address as "qwertyuiop@gmail.com" in email field
Then enters the mobile number as "1234567890"
And  DOB as "08/01/2019"
Then type address as "address 123"
Then user selects the security question as What is your Nick Name?
And enters the answer as "DEEPI"
Then user clicks Register





 

