//Name: Soniya Dasadia
//Date: Jan 11, 2021
//Purpose: Speedy words card class

public class SpeedyStack {
	//Instance variables
	private int count;
	//returns a deck of 50 cards
	private Speedywords data[] = new Speedywords [50];
	public SpeedyStack () {
		count = 0;
	}
	//adds a card to the deck
	public void push (Speedywords addMe) {
		data [count] = addMe;
		count++;
	}
	//returns the number of cards left in the deck
	public int size () {
		return count;
	}
	//returns true if deck is full
	public boolean isFull () {
		return (count == 50);
	}
	//removes a card from the deck
	public Speedywords pop () {
		count--;
		return data [count];
	}
	//returns the top card from the deck
	public Speedywords peek () {
		return data [count--];
	}
	//returns true id there are no cards left in the deck
	public boolean isEmpty () {
		return count == 0;
	}
	//removes all cards from the deck
	public void clear () {
		count = 0;
	}
	//shuffle method - adds all 50 cards to the deck in random order.
	public void shuffle(){
		String names[] = {"Countries", "Food and drink", "Music", "Movies",
				"Sports", "Animals", "Pets", "National Parks", "Rivers",
				"Vintage", "Authors", "Star wars", "Intruments", "Smurfs",
				"Foreign Currency", "Book titles", "Emotions", "Careers",
				"Ethnic Foods", "Ice cream flavours",
				"Harry Potter Universe", "Spices", "Cities", "Vehicles",
				"Dog Breeds", "Forest names", "Tropical fruits", "Flowers",
				"Under the Sea", "Equipment", "Social media", "Classic shows",
				"Water Bodies", "70s Music", "Disney movies", "Disney Characters", 
				"Marvel", "CHildren's books", "Desserts", "Cars", "Holidays", "Accessories",
				"Hobbies", "Brands", "Body products", "Candy" };
		String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", 
				"U", "V", "W", "X", "Y", "Z"};
		//Randomize the order of the arrays
		for (int i = 0; i < 100; i++) {
			int r1 = (int) (Math.random() * names.length);
			int r2 = (int) (Math.random() * names.length);
			//swap names array
			String temp = names[r1];
			names[r1] = names[r2];
			names[r2] = temp;
		}
		//swap points array
		for (int j = 0; j < 100; j++) {
			int r3 = (int) (Math.random() * letters.length);
			int r4 = (int) (Math.random() * letters.length);
			//swap names array
			String temp1 = letters[r3];
			letters[r3] = letters[r4];
			letters[r4] = temp1;				
		}
		int LC = 0;
		count = 0;
		//TO DO: push all (now in random order) into the Deck
		for (int i = 0; i < names.length; i++) {
			Speedywords d = new Speedywords(names[i],letters[LC]);
			push(d);
			LC++;
			if(LC>=letters.length)
			{
				LC=0;
			}
		}

	}
}
