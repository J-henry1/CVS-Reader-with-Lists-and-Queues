
/**
 * @author Jared Henry
 * 
 * The DoubleEnded Linked List class offers access to the Links of the Link class and a first and last position Link of the
 * Double Ended Linked List
 * 
 * Reference to top is used in printing out the top of the stack recursively in the DisplayStack method
 * 
 * The Insert method is called in the StackedList class which puts items in a queue as they are loaded from Countries3.csv
 * The remove method removes items from the stack in a first in last out basis
 * 
 * Print stack method recursively prints the stack and is called in the StackedList class. 
 * 
 * version 10/15/2022
 */

public class DoubleEndedLinkedList {

	
	private Link first; // ref to first link
	private Link last; // ref to last link
	
	// -------------------------------------------------------------
	
	/**
	 * @param first
	 * @param last
	 */
	public DoubleEndedLinkedList(Link first, Link last) {
		this.first = first;
		this.last = last;
	}

	public DoubleEndedLinkedList() // constructor
	{
	first = null; // no links on list yet
	last = null;
	}
	
	// -------------------------------------------------------------
	
	//method to pull top of stack for SinglyLinked list
	public Link top() {
		return first;
	}
	
	// -------------------------------------------------------------
	
	public boolean isEmpty() // true if no links
	{ return first==null; }
	
	// -------------------------------------------------------------
	
	public void insertFirst(Country dd) // insert at front of list
	{
	Link newLink = new Link(dd); // make new link
	if( isEmpty() ) // if empty list,
	last = newLink; // newLink <-- last
	newLink.next = first; // newLink --> old first
	first = newLink; // first --> newLink
	}
	
	// -------------------------------------------------------------
	
	public void insertLast(Country dd) // insert at end of list
	{
	Link newLink = new Link(dd); // make new link
	if( isEmpty() ) // if empty list,
	first = newLink; // first --> newLink
	else
	last.next = newLink; // old last --> newLink
	last = newLink; // newLink <-- last
	}
	
	// -------------------------------------------------------------
	
	public Link deleteFirst() // delete first link
	{ // (assumes non-empty list)
	Link temp = first;
	if(first.next == null) // if only one item
	
		last = null; // null <-- last
	first = first.next; // first --> old next
	return temp;
	}
	
	// -------------------------------------------------------------
	
	public void printStack(Link x) {
		
		if(x == null)
			return;
		else
		x.displayLink();
		printStack(x.next);
		
	}
}//end of DoubleEndedLinkedList Class
