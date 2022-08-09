//Name: Soniya Dasadia
//Date: Jan 11, 2021
//Purpose: Speedy words card class

public class Speedywords {
	//instance variables
	private String catname;
	private String catname2;
	public Speedywords() {
		//Category names
		String names[] = {"Countries", "Food and Drink", "Music", "Movies",
				"Sports", "Animals", "Pets", "National Parks", "Rivers",
				"Vintage", "Authors", "Star wars", "Instruments", "Smurfs",
				"Foreign Currency", "Book titles", "Emotions", "Careers",
				"Ethnic Food", "Ice Cream Flavours",
				"Harry Potter Universe", "Spices", "Cities", "Vehicles",
				"Dog Breeds", "Forest Names", "Tropical fruits", "Flowers",
				"Under the Sea", "Equipment", "Social media", "Classic shows",
				"Water Bodies", "70s Music", "Disney movies", "Disney Characters", 
				"Marvel", "Children's books", "Desserts", "Cars", "Holidays", "Accessories",
				"Hobbies", "Brands", "Body products", "Candy"};
		String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", 
				"U", "V", "W", "X", "Y", "Z"};
		//chooses a random category from the list above
		int rand = (int) (Math.random() * names.length);
		catname = names[rand];
		int rand2 = (int) (Math.random() * letters.length);
		catname2 = letters[rand2];


	}
	//generates a card using parameters
	public Speedywords(String n, String n2){
		catname = n;
		catname2 = n2;
	}
	//can see values on a card using return types
	public String getcatname() {
		return catname;
	}
	public String getcatname2() {
		return catname2;
	}
	//allows changes to a card using parameters
	public void setName (String n){
		catname = n;
	}
	public void setName2 (String n2){
		catname2 = n2;
	}
	//returns a string with all instance variables in a card
	public String toString(){
		return "Category: "+catname  +  ", Letter: " +catname2;
	}
	//tests if two cards are equal based on the picture name
	public boolean equals(Speedywords d){
		if(d.getcatname().equals(catname)&&d.getcatname().equals(catname2))
			return true;
		else
			return false;
	}
	//based on the card picture name, it returns -1 
	//if parameter is greater, 0 if parameter is equal
	//and 1 if parameter is smaller
	public int compareTo(Speedywords d){
		if(catname.compareTo(d.getcatname())>0 &&catname2.compareTo(d.getcatname2())>0)
			return 1;
		else if (catname.compareTo(d.getcatname())<0&&catname2.compareTo(d.getcatname2())<0)
			return -1;
		else
			return 0;
	}
	//returns the picture depending on the category name.
	public String getPicName() {
		if (catname.equals("Countries"))
			return "1";
		else if (catname.equals("Food and Drink"))
			return "2";
		else if (catname.equals("Music"))
			return "3";
		//etc for all of the rest of the donuts.
		else if (catname.equals("Movies"))
			return "4";
		else if (catname.equals("Sports"))
			return "5";
		else if (catname.equals("Animals"))
			return "6";
		else if (catname.equals("Pets"))
			return "7";
		else if (catname.equals("National Parks"))
			return "8";
		else if (catname.equals("Rivers"))
			return "9";
		else if (catname.equals("Vintage"))
			return "10";
		else if (catname.equals("Authors"))
			return "11";
		else if (catname.equals("Star wars"))
			return "12";
		else if (catname.equals("Instruments"))
			return "13";
		else if (catname.equals("Smurfs"))
			return "14";
		else if (catname.equals("Foreign Currency"))
			return "15";
		else if (catname.equals("Book titles"))
			return "16";
		else if (catname.equals("Emotions"))
			return "17";
		else if (catname.equals("Careers"))
			return "18";
		else if (catname.equals("Ethnic Food"))
			return "19";
		else if (catname.equals("Ice Cream Flavours"))
			return "20";
		else if (catname.equals("Harry Potter Universe"))
			return "21";
		else if (catname.equals("Spices"))
			return "22";
		else if (catname.equals("Cities"))
			return "23";
		else if (catname.equals("Vehicles"))
			return "24";
		else if (catname.equals("Dog Breeds"))
			return "25";
		else if (catname.equals("Forest Names"))
			return "26";
		else if (catname.equals("Tropical Fruit"))
			return "27";
		else if (catname.equals("Flowers"))
			return "28";
		else if (catname.equals("Under the sea"))
			return "29";
		else if (catname.equals("Equipment"))
			return "30";
		else if (catname.equals("Social media"))
			return "31";
		else if (catname.equals("Classic shows"))
			return "32";
		else if (catname.equals("Sports team"))
			return "33";
		else if (catname.equals("Bands"))
			return "34";
		else if (catname.equals("Celebrity"))
			return "35";
		else if (catname.equals("Classic Movies"))
			return "36";
		else if (catname.equals("Water Bodies"))
			return "37";
		else if (catname.equals("70s Music"))
			return "38";
		else if (catname.equals("Disney movies"))
			return "39";
		else if (catname.equals("Disney Characters"))
			return "40";
		else if (catname.equals("Marvel"))
			return "41";
		else if (catname.equals("Children's books"))
			return "42";
		else if (catname.equals("Desserts"))
			return "43";
		else if (catname.equals("Cars"))
			return "44";
		else if (catname.equals("Holidays"))
			return "45";
		else if (catname.equals("Accessories"))
			return "46";
		else if (catname.equals("Hobbies"))
			return "47";
		else if (catname.equals("Brands"))
			return "48";
		else if (catname.equals("Body products"))
			return "49";
		else if (catname.equals("Candy"))
			return "50";
		else
			return "50";
	}

}
