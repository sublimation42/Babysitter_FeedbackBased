PROJECT TITLE: Sitter Simulator and Pay Calculator

PURPOSE OF PROJECT: Babysitter Kata Completion: calculates sitter pay using variable rates  
	Redone based on feedback

VERSION or DATE: 03/04/2017
AUTHORS: Adam Howard

Note: as the lib folder is part of the .gitignore, the junit and hamcrest jars have been provided inside the 
babySitterKata_FeedbackBased\classes directory and are referenced in the commands below.


To freshly compile classes:

Copy the babySitterKata_FeedbackBased folder from the repository.


From the command line inside the babySitterKata_FeedbackBased\source directory issue command:

    javac -cp ../classes/junit-4.12.jar -d ../classes *.java


Next, to run the tests from the command line change to the babySitterKata_FeedbackBased\classes directory and issue commands:
   	
	java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore SitterTest

	java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore PayEstimatorTest

Runtime and "OK" (##) will appear on the screen after each test run where ## is the number of tests completed. 
