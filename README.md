*****************************PROBLEM TWO: SALES TAX**********************************
The objective of the problem is to let the user select the items to be purchased and impose sales taxes based on three conditions.

1.10% for all goods except books, food and medicine
2.An additional 5% for imported goods. All the imported products will have a 15% sales tax but the books, food and medicine will have the basic tax exempt which makes 5% (only on books food and medicine)
3. The receipt should display prices rounded up to the nearest 0.05.

The project is structured with the following files:

**Package** - com.kitombatest.salestax
****Files**** 
	1. Shop.java - contains the main class with variables and instances of other classes in the package.
	2. Product.java - contains the blueprint of products object and the products are added to an ArrayList.
	3. Cart.java - contains the blueprint to add selected products into cart.
	4. CartManipulations.java - contains methods to add products to cart, calculate the Sales tax and total bill amount.
	
The methods in the files mentioned have commented lines describing the functions of the method.

NOTE: The project is created as a Maven project in order to avoid compatibility issues with libraries.
	
****PROGRAM EXECUTION****
When the program gets executed, the console will display a numbered list of products. The user will be prompted to enter the required range of values to add the required items into cart. The user can press 0 or type any other value outside the range to view the receipt. A sample program execution and output of the console is as follows:

**************************************OUTPUT*******************************************
1. book: $12.49
2. music CD: $14.99
3. chocolate bar: $0.85
4. imported box of chocolates: $10.0
5. imported box of chocolates: $11.25
6. imported bottle of perfume: $47.5
7. imported bottle of perfume: $27.99
8. bottle of perfume: $18.99
9. packet of headache pills: $9.75
Enter the ID number between 1 and 8 to add products into cart.
Enter 0 to exit and calculate the bill amount:
7
1 imported bottle of perfume at $27.99
8
1  bottle of perfume at $18.99
9
1  packet of headache pills at $9.75
5
1 imported box of chocolates at $11.25
0
1 imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 9.75
1 imported box of chocolates: 11.85
Sales Taxes:6.70
Total Bill:74.68
=================
*************************************TEST CASE EXECUTION********************************
**Package** - com.kitombatest.testcase
****Files**** 
	1. TestCase.java - Contains the set of test inputs given to check the expected outputs.
	2. TestRunner.java - Contains the runner method to run the TestCase.class
****Test Execution****
The test case can be executed by running TestCase.java under the specified package (com.kitombatest.testcase) as a stand-alone jUnit test. Alternatively, TestRunner can also be used to run the TestCase.class. The sample output for the program is as follows.
****Output****

***Printing the output for first input set***
1 book: 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes:1.50
Total Bill:29.83
=================
***Printing the output for second input set***
1 imported box of chocolates: 10.5
1 imported bottle of perfume: 54.65
Sales Taxes:7.65
Total Bill:65.15
=================
***Printing the output for third input set***
1 imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 9.75
1 imported box of chocolates: 11.85
Sales Taxes:6.70
Total Bill:74.68
=================
