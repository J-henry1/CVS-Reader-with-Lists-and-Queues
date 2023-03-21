/**
 * @author Jared Henry
 * 
 * PriorityQ Class provides a constructr for the the List which is a Doubly Linked List 
 * PriorityQ Class provides a first elememnt for easy access to the first element in the doubly linked list
 * PriorityQ Class provides isEmpy() method to check for the PriorityQ when there are no Links in the Lists
 * PriorityQ Class provides insert method which inserts sorted elements with desired DeathRates in order 
 * from lowest DR (highest Priority) to highest DR (lowest Priority)
 * PriorityQ Class provides a interval delete method which calls the interval delete method in the DLL class. This will delete input
 * intervals by user in the desired range
 * 
 * The displayQueue method in PriorityQ recursively calls a print method to display all elements within the PriorityQ from
 * highest priority to lowest priority
 * 
 * 
 * 
 * version 10/23/2022
 */



public class PriorityQ {

	
	private DLL theList;
	private DLL first;
	
	
	
	
	
	//--------------------------------------------------------------
	
	/**
	 * @param theList
	 * @param first
	 */
	public PriorityQ(DLL theList, DLL first) {
		this.theList = theList;
		this.first = first;
	}

	
	/**
	 * @PriorityQ sets constructor for doubly linked list in priority queue
	 */
	public PriorityQ() // constructor
	{ 
		theList = new DLL(); 
	
	} //end constructor
	
	//--------------------------------------------------------------
	
	/**
	 * @isEmpty method returns true if queue is empty
	 */
	
	public boolean isEmpty() // true if queue is empty
	{ 
		return theList.isEmpty(); 
		
	}//end isEmpty method
	
	//--------------------------------------------------------------
	
	/**
	 * @insertIt inserts country objects of higher DR to the rear; low DR is highest priority. 
	 * insert method called from DLL class
	 */
	public void insertIt(Country j) // insert, rear of queue
	{ 
		theList.insert(j);
	}//end insert method
	
	//--------------------------------------------------------------
	/**
	 * @remove the country object in the front of queue
	 * delete method called from DLL class
	 */
	public Link remove() // remove, front of queue
	{ 
		return theList.deleteFirst(); 
	}//end remove method
	
	//--------------------------------------------------------------
	/**
	 * @displayQueue method takes in theFirst list as a parameter for the printList method called recursively 
	 * in DLL class
	 */
	public void displayQueue()
	{
		System.out.println("PriorityQ Contents: \n\n");
	System.out.print("Queue (highest Death Rate --> lowest Death Rate): \n");
	System.out.println("Name\t\t\t\t Captitol\t      GDPPC           CFR\t      CaseRate\t     "
			+ " DeathRate\t      PopDensity");
	System.out.println("----------------------------------------"
			+ "------------------------------------------------------------------"
			+ "-------------------------");
	theList.printList(theList.first);//recursive Print List Method in DLL class
	
	
	}//end display Queue
	
	
	/**
	 * @Interval delete method calls interval delete method of the DLL class and takes in double numbered 
	 * input from the user to delete a range of Countries based on their DR
	 */
	public void intervalDelete(double a, double b) {
		theList.intervalDelete(a, b);
	} 

	
}//end PriorityQ Class
