/**
 * @author Jared Henry
 * 
 * Constructor creates a new DoubleEndedLinked List as country's are pushed onto the stafck
 * StackList Class provides push and pop methods for inserting and removing country objects in a double-ended
 * linked list from the stack
 * Display Stack method prints all items in the stack recursively from the printList method in Double Ended Linked List class
 * 
 * @version 10/19/2022
 * 
 */



public class StackedList {

	public DoubleEndedLinkedList theStack;


	//--------------------------------------------------------------
	
	/**
	 * @param theStack
	 */
	public StackedList(DoubleEndedLinkedList theStack) {
		this.theStack = theStack;
	}

	/**
	 * @StackedList constructor creates a new Double Ended Linked List
	 */
	
	public StackedList() // constructor
	{
	theStack = new DoubleEndedLinkedList();
	}
	
	//--------------------------------------------------------------
	
	/**
	 * @PushIt method calls insertFirst method of Doubled Ended Linked list class to top of the stack
	 */
	
	public void pushIt(Country j) // put item on top of stack
	{
	theStack.insertFirst(j);
	}
	
	//--------------------------------------------------------------
	/**
	 * @popIt method calls deleteFirst method of the Double ended linked list class to remove top link from the linked list
	 */
	public Link popIt() // take item from top of stack
	{
	
	
	return theStack.deleteFirst();
	
	}//end pop method
	
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @returns true if the stack is empty
	 * 
	 */
	
	
	public boolean isEmpty() // true if stack is empty
	{
	return ( theStack.isEmpty() );
	}
	
	
	//--------------------------------------------------------------
	
	/**
	 * @displayStack calls the recursive printStack method from Double Ended Linked List class 
	 */
	public void displayStack()
	{
		System.out.println("Stack Contents: \n\n");
		System.out.println("Name\t\t\t\t Captitol\t      GDPPC           CFR\t      CaseRate\t     "
				+ " DeathRate\t      PopDensity");
		System.out.println("----------------------------------------"
				+ "------------------------------------------------------------------"
				+ "-------------------------");

	theStack.printStack(theStack.top());
	}//end displayFoward method


}//end Stack Class
