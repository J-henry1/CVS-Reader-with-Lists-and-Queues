import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Project3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Data Structures\nProject 2\nN01484167 Jared Henry");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file or path to file you wish to load:");
		String fileName = sc.next();
		System.out.println(fileName);
		Scanner inFile = null;
		
		
		StackedList theStack = new StackedList();//creates new stack
		PriorityQ theList = new PriorityQ();
		try
		{
			 inFile = new Scanner(new File(fileName));
			 System.out.println("File Read");
			 //System.out.println("Enter 8 to view options:");
		}//end of try for file scanner
		
		catch (FileNotFoundException e)
		{
			
			System.out.println("\nCould not open the file!");
			System.exit(1);
		}//end catch for file error
		
		
		inFile.useDelimiter(",|\n");
		inFile.nextLine();
		while(inFile.hasNext())
		{
			String name = inFile.next();
			String capital = inFile.next();
			double population = Double.parseDouble(inFile.next());
			double gDP = Double.parseDouble(inFile.next());
			double cOVIDCases = Double.parseDouble(inFile.next());
			double cOVIDDeaths = Double.parseDouble(inFile.next());
			double area = Double.parseDouble(inFile.next());
			
			double GDPPC = gDP/population;
			double CFR = cOVIDDeaths/cOVIDCases;
			double CaseRate = (cOVIDCases/population)*100000;
			double DeathRate = cOVIDDeaths/(population/100000);
			double PopDensity = population/area;
			
			Country c = new Country(name, capital, population, gDP, cOVIDCases, cOVIDDeaths, area, GDPPC, CFR, CaseRate, DeathRate, PopDensity);;

			
			if(DeathRate >= 20 && DeathRate <= 350) {
			theStack.pushIt(c);
			
			}//end if Statement

		}// end of while loop
		
		theStack.displayStack();
		
		do {
			theList.insertIt(theStack.popIt().dData);
		}
		while(!theStack.isEmpty());
		
		System.out.println("\n\n");
		
		theList.displayQueue();
		
		int menuOption = 1;
		do {
			if(menuOption > 3 || menuOption < 1) {
				System.out.println("Invalid entry! Please enter number from the menu.");
			}
			
			try {
				System.out.println("\n1) Enter a DR interval for deletions on priority queue"
						+ "\n2) Print the priority queue"
						+ "\n3) Exit program"
						+ "\nPlease enter your choice: ");

					menuOption = sc.nextInt();
						//menuOption = Integer.valueOf(sc.next());
			}//end try 
			catch (InputMismatchException e) {
				sc.nextLine();
				System.err.print("Try again! Please enter an integer value for menu option.\n");		
				menuOption = sc.nextInt();
			}//end of catch for string input
		
		
		
		if(menuOption == 1) {
			
			double lower;
			double higher;
			System.out.println("Enter first DR interval:");
			try {
			lower = sc.nextDouble();
			}//end try
			
			catch(InputMismatchException e) {
				System.out.println("Try again! Please enter the correct type of value");
				lower = sc.nextDouble();
			}//end catch
			
			
			System.out.println("Enter second DR interval:");
			try{
				higher = sc.nextDouble();
			}//end try
			

			catch(InputMismatchException e)
			{
				System.out.println("Try again! Please enter the correct type of value");
				higher = sc.nextDouble();
			}//end catch
			theList.intervalDelete(lower, higher);
			
			if(lower > higher ) {
				System.out.println("You must enter a higher interval for your second input");
			}
			

			
		}//end menuOption 1
		
		if(menuOption == 2) {
			
			theList.displayQueue();
			
		}//end menuOption 2
		
		//recursion test
		}//end do while loop

	while(menuOption != 3);
		
		sc.close();
		
	}//end of Main method

}//end of Project 3 class
