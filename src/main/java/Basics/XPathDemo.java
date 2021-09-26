package Basics;

public class XPathDemo {

	/*
	 * 2 brothers
	 * parents
	 * Ajay
	 * second brother
	 * 
	 * div id =1
	 * 		div id = 2
	 * 		div id = 3
	 * 		div
	 *
	 * give me div where id = 2
	 * div id = 1 >> give me the 3rd child
	 * 
	 * OR
	 * 
	 * div id = 2 >> give me the next sibling
	 * 
	 * XPATH:
	 * is an XML Path used for navigation
	 * through the HTML structure
	 * 
	 * /html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input
	 * //*[@id="email"]
	 * Syntax of XPATH:
	 * Xpath = //tagName [@attribute = 'value']
	 * 
	 * Basic:
	 *	//input[@id = 'email']
	 *	//input[@name = 'pass']
	 *	//button[@id = 'loginbutton']
	 * 
	 * Contains:
	 * 1 buttons
	 * button : id = btn1Login
	 * id = btn2Login
	 * id = btn3Login
	 * u_0_d_XG
	 * u_0_d_qo
	 * u_0_d_e4
	 * 
	 * SyntaX:
	 * Xpath = //tagName[contains(@attribute, 'matchingValue')]
	 * 
	 * 	//button[contains(@id, 'Login')]
	 * 	//button[contains(@id, 'u_0_d')]
	 * 
	 * AND and OR
	 * QA ENV, login button id = qabtn1
	 * Prod ENV, login button id = prdbtn1
	 * 
	 *	//button[@id = 'qabtn1' or @id = 'prdbtn1']
	 *
	 *
	 *	btn1 = qabtn1 name = login
	 *	btn2 = qabtn1 name = qalogin
	 *	//button[@id = 'qabtn1' and @name = 'qalogin']
	 * 
	 * Starts-with
	 * 
	 * btn1:
	 * id = btnqa1
	 * id = btnqa232
	 * id = btnqa434
	 * 
	 *	//button[start-with(@id, 'btnqa')]
	 *
	 *
	 *	Text()
	 *	//a[text() = 'Forgotten password?']
	 *
	 *
	 *	Heirarchy:
	 *
	 *form
	 *	div
	 *		div
	 *			username
	 *		div
	 *			password
	 *	div login buton
	 *
	 *	XPATh AXES
	 *	1. Child
	 *		gives all the child
	 *	//form[@class='_9vtf']//child::div[1]//child::input[1]
	 *
	 *	//input[@id = 'email']//parent::div//following-sibling::div//child::input
	 * 	following-sibling
	 * 	preceding-sibling
	 * 
	 * Table
	 * 
	 * 
	 * Howmwork: https://opensource-demo.orangehrmlive.com/index.php/dashboard
	 * 1. Login
	 * 2. Goto Admin >> UserManagement>> Users
	 * 3. CLick on the check box where name = Aravind
	 */
}
