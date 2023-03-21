/**
 * @author Jared Henry
 * 
 * Link class provides construction of each Link in both the DLL and DoubleEndedLinkedList Class
 * The Link class offers reference to the Data of each Country object in the form of dData
 * It provides reference to Next Country object in the list through Link next and access to the "Next" link through
 * Link Next
 * 
 * the display Link method prints out country objects one by one on a new line
 * 
 * version 10/15/2022
 */
public class Link {

	
	public Country dData; // data item
	public Link next; // next link in list
	public Link previous; // previous link in list

	/**
	 * @Link takes in a country object to create a Link with data
	 */
	public Link(Country dd) // constructor
	{ 
		dData = dd;

	}//end of Constructor
	/**
	 * @displayLink method prints the country object and adds a new line between each object printed
	 */
	public void displayLink() // display this link
	{ System.out.print(dData + " \n"); 
	}//end displayLink method
	
}//end Link Class
