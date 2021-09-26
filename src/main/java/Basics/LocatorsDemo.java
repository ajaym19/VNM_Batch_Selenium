package Basics;

public class LocatorsDemo {

	public static void main(String[] args) {
		/*
		 * HTML Tag:
		 * input, button,a
		 * 
		 * Locators by:
		 * 
		 * ID: best to use
		 * Name: second best to use
		 * Xpath:
		 * 2types:
		 * 
		 *	//HTMLTag[@attribute = 'value']
		 * //input[@id="email"]
		 * /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		 * 
		 *	//input[@name = 'pass']
		 * 
		 * CSS
		 * #email
		 * ClassName: we can use but miltiple elemetns might have same class name and hence we wont be getting unique element
		 * 
		 * Tag
		 * input/a/submit/select/p
		 * 
		 * Links:
		 * Link Text: Forgotten password?
		 * Forgotten password Ajay
		 * Forgotten password Swati
		 * 
		 * textbox1 id = id1
		 * textbox2 id = id1
		 * find element >> by.id(id1);
		 * 2 elements:
		 * will store only one element
		 * 
		 * 
		 * 
		 * Partial Link Text
		 * Forgotten password
		 */
	}
}
