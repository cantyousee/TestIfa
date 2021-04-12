Project Requirements
IDE (Eclipse)
Xampp

Running the project
Download and import the project into Eclipse
Download and install xampp
Navigate to http://localhost:8081 (or the port that you have configured) and click on phpmyadmin
Create the database schema as provided in the ‘server_if.sql’ file
Run the project


About the assessment

The UI has been created to simulate the events generated from the mobile app and to test the rest endpoint.

To simulate the event you enter the details manually into the UI and on clicking submit, the details are sent to the rest endpoint which then gets stored into the database.
The create the database, phpmyadmin tool is used.


There are two UI pages in the project
/new : to insert a new record
/ : homepage that displays the events generated from the table

Implementation of 3 business rules:

For the 1st rule when the user pays the bill for the first time, the database is queried to find if the user id entry already exists in the ServerIf table (the events table). If it does not exist, a model attribute is redirected to the page which is loaded when the user submits the event through the UI. This model attribute displays the text “first time payment” (and for now acts a notification).
