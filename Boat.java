package src;




/**
 * @author Mark Hayes
 *
 */
public class Boat {					//generates the 'Boat' class for use in the 'q3' program
	
			private String name = "";
			private double length = 0;
			private int rating = 0;		//initialises instance variables
						
			public Boat(String name, double length, int rating)		//allows access to set values to the objects states
			{
				this.name = name;
				this.length = length;
				this.rating = rating;
			}

			public String getName() {
				return name;			//returns object values for 'name'
			}

			public double getLength() {
				return length;			//returns object values for 'length'
			}

			public int getRating() {
				return rating;			//returns object values for 'rating'
			}
			
}

		
