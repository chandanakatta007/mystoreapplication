Feature: This casestudy is by using BDD frameworks for http://automationpractice.com/
Background:
     Given launch the firefox browser and application link is opened and maximize it
    |http://automationpractice.com|
    @sc1
Scenario: User should be able to register using a valid email address
When verify signin link is present in homepage if exists click and navigate to page
 Then verify  email address  under create an account and enter valid emailid
|chandu@gmail.com|
#And if email id entered is already exist it should display error message
#And if email id entered and doesnot exist then create account
Then verify you entered into your personal information page
 And verify 'First name' 'Last name' and 'Password'
|chandu|
|k|
|123456|
And  verify 'signup for newsletter'and 'Receive special offers from our partners' buttons present and click on the desired button
And verify in 'YOUR ADDRESS''First name' 'Last name' 'Company' 'Address' 'Address (Line 2)' 'City' 'Zip/Postal Code' 'Additional information' 'Home phone' 'Mobile phone' 'Assign an address alias for future reference' textboxes should present and enter text
And verify 'state' and 'country' dropdown is present and enter select if thet exist
And verify 'Register' button is present and submit after filling all details


#Scenario: While registering, if the email address is incorrect. User should see an error message
#Given launch the firefox browser and application link is opened and maximize it
#When entered invalid email should through error message
#|abcd|
#|@abcd#|
#|%12345|
#
#
#Then invalid email is unable to register
#
#Scenario: Check whether Megamenu works (Dresses -> Summer dresses)
#    Given launch the firefox browser and application link is opened and maximize it
#    When an action is performed
#    Then something should be asserted
#    
#    Scenario: scenario description
#        Given a precondition is valid
#        When an action is performed
#        Then something should be asserted