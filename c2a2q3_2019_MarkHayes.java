package src;


import java.util.ArrayList;

public class c2a2q3_2019_MarkHayes {

	/**
	 * @param Boat boat# - each object added to the array using the Boat class
	 * @param boats - the arrayList of objects
	 * 
	 * @author Mark Hayes
	 */
	public static void main(String[] args) {
		
	
		
		Boat boatOne = new Boat("Argo", 23.5, 5);
		Boat boatTwo = new Boat("Pequod", 17.6, 2);
		Boat boatThree = new Boat("Nellie", 30.7, 4);
		Boat boatFour = new Boat("Endeavour", 37.8, 8);
		Boat boatFive = new Boat("Oceanic", 74.9, 3);		//constructing objects of the 'Boat' class
		
		ArrayList<Boat> boats = new ArrayList<Boat>();		//creates a new arrayList to hold the objects and their characteristics
	
		boats.add(boatOne);
		boats.add(boatTwo);
		boats.add(boatThree);
		boats.add(boatFour);
		boats.add(boatFive);		//adding each object to the arrayList

		for (Boat object : boats)
		{
			System.out.println("The " + object.getName() + " is " + object.getLength() + " metres long, and has a rating of " + object.getRating() + " out of 10.");
		}		//informs the user of each object and their states
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		String shortestBoat = boats.get(0).getName();		
		double shortest = boats.get(0).getLength();
		int shortestBoatRating = boats.get(0).getRating();		//declares variables needed for first calculation - the shortest boat
	
		for (int i = 0; i < boats.size(); i++)			//iterates through the objects for the calculation
		{
			if (shortest > boats.get(i).getLength())	
			{
				shortest = boats.get(i).getLength();	//sets each element as shortest to discover if the next is shorter
				shortestBoat = boats.get(i).getName();
				shortestBoatRating = boats.get(i).getRating();		//assigns the object's other states to match the length
			}		
		}
		System.out.println("The shortest boat is the " + shortestBoat + " at " + shortest + " metres long, with a rating of " + shortestBoatRating + " out of 10."); 
					//prints calculation results		

		
		int highestRating = boats.get(0).getRating();
		String highestRatedBoat = boats.get(0).getName();
		double highestRatedLength = boats.get(0).getLength();	//declares variables needed for second calculation - highest rating
	
		for (int i = 0; i < boats.size(); i++)		//iterates through the objects for the calculation
		{
			if (highestRating < boats.get(i).getRating())
			{
				highestRating = boats.get(i).getRating();		//sets each element as highest rated to discover if the next is higher
				highestRatedBoat = boats.get(i).getName();
				highestRatedLength = boats.get(i).getLength();		//assigns objects other states to variables
			}		
		}
		System.out.println("The boat with the highest rating of " + highestRating + " out of 10 is the " + highestRatedBoat + " which is " + highestRatedLength + " metres long.");	
					//prints calculation results

	}

}
