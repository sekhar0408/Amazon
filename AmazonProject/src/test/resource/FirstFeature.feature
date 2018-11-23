Feature: Amazon Test

Scenario: Signin and verify error message on email
Given Click on Signin
When Enter random message "az@gmail.com"
And  Click on Sign on button
Then verify the error message "Enter your password"


 
 